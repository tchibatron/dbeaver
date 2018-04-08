# Prerequisites for debugging
In order to implement interactive debugging of PL/SQL procedures on Postgres server you have to use plugin_debugger plugin. Plugin_debugger is typical interactive debugger which is delivered as an extension and requires shared library preload in Postgres to operate shared_preload_libraries parameter in settings). The debugger is developed and maintained by the community, its source codes are available for examination and improvement.
 
The debugger provides required server API for the debugging of a PL/SQL procedure:

* Breakpoint management;
* Step-by-step tracing;
* Variable acquisition and management.

Installation
------------

First, you need to install plugin_debugger extension in your postgres database 

Its free and open source. You can download source code here https://git.postgresql.org/gitweb/?p=pldebugger.git;a=tree

README for make and install here - https://git.postgresql.org/gitweb/?p=pldebugger.git;a=blob_plain;f=README.pldebugger;hb=HEAD

* Copy this directory to contrib/ in your PostgreSQL source tree.
* Run 'make; make install'
* Edit your postgresql.conf file, and modify the shared_preload_libraries config option to look like:
  shared_preload_libraries = '$libdir/plugin_debugger'
* Restart PostgreSQL for the new setting to take effect.
* Run the following command in the database or databases that you wish to
  debug functions in:

  CREATE EXTENSION pldbgapi;

  (on server versions older than 9.1, you must instead run the pldbgapi--1.0.sql
  script directly using psql).

If you using binary builds from pgdg you can use repository for your linux distribution, more info at  https://www.postgresql.org/download/

After installing plugin at server you need to install debug plugion from marketplace or P2 repository, [see doc](https://github.com/dbeaver/dbeaver/wiki/Optional-extensions)

# How to start debug with local breakpoint
When breakpoint is local, stop will be done only for server process launched by initiator. All other processes will run procedure\function as usually. When you create or run previously defined debugging session in Dbeaver with local breakpoint, the following steps are performed:
1. DBeaver creates initiator session and local breakpoint
1. Dbeaver runs procedure\function (with parameters specified) selected for debugging in the initiator session  
1. Server process reaches breakpoint and displays NOTICE to initiator, in which the PORT in reported for PLDBGBREAK:XX debugging. Then process opens socket and becomes blocked, waiting for PROXY connection. If client cannot get PORT name from the process debugged, an error will return.
1. Client creates session, then tries to establish connection with process debugged using PORT from step 3 provided by initiator. The connection is established via API call (attach_to_port). If connection cannot be established, « Error rcv port number» error message is displayed.
1. PROXY receives PORT from the client, then establishes connection to process and returns session identificator to the client. After that, using the identificator, one can:
*Send debugging commands to the process;
*Receive responses from process;
*Translate responces to the client.

[[/images/debug-local.png|Debug with local breakpoint]]

# How to start debug with global brteakpoint

When control point is global, stop will be done for any server process launched by anyone. No modifications or additional calls from the process debugged is required.When you create session with global breakpoint, the following steps are performed:

1. Client creates session, then establishes connection with PROXY (receiving session). Then client creates global breakpoint  for the selected function, then becomes blocked via API call (pldbg_wait_for_target) waiting for server process.
1. PROXY receives global control point from the client and adds global control point to the shared memory (if the point of this type hasn’t been added before )
1. Initiator creates connection and runs selected procedure
1. On each executed line, process checks if global breakpoint (with corresponding conditions) exists and becomes blocked if breakpoint is reached
1. Process establishes connection with PROXY and reports that point is reached
1. After that, process becomes blocked and waits for PROXY (client) commands. Process will be implementing commands unless procedure is finished or exception is thrown. 

[[/images/debug-global.png|Debug with global breakpoint]]

Running debugger in DBeaver interface
------------
If server plugin up and running and you succefully installed debugger plugin you can start Debug from procedure source page by right-clicking on procedure source text (popup menu will appear) :

[[/images/start-debug.PNG|Debug popup menu]]

You must choose type for your debug session Local or Global

For **Global** session you need to specify target process PID filter (-1 for any process) : 
[[/images/start-debug-global.PNG|Debug global dialog]]

After running Global session you need to wait for any (or specified PID) process will call your procedure

For **Local** session you need to specify executable SQL sentence for starting in target process : 
[[/images/start-debug-local.PNG|Debug local dialog]]

In scrip edit window you can see text “select get_count(?)” this is just specification of how DBeaver must call your function(procedure) for debug. 

DBeaver does not know anything about the values of the variables with which to start the procedure for debugging – you need to set the values for call arguments BEFORE starting debugging your settings may look like this  :
[[/images/start-debug-local-params.png|Debug local dialog]]

If you run debugging now - Dbeaver creates a separate connection to the database server and tries to execute given SQL sentence (select get_count(‘pg_class’)) in this connection and attach debug session to running SQL context.

After successfuly attaching to target server process platform ask you about switching to debug perspective :
[[/images/debug-perspective.PNG|Debug perspective switch]]

Click "OK" and you will see debug toolset (perspective) :
[[/images/debug-perspective-win.png|Debug perspective]]
