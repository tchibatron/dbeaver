# Prerequisites for debugging
In order to implement interactive debugging of PL/SQL procedures on Postgres server you have to use plugin_debugger plugin. Plugin_debugger is typical interactive debugger which is delivered as an extension and requires shared library preload in Postgres to operate shared_preload_libraries parameter in settings). The debugger is developed and maintained by the community, its source codes are available for examination and improvement.
 
The debugger provides required server API for the debugging of a PL/SQL procedure:

* Breakpoint management;
* Step-by-step tracing;
* Variable acquisition and management.

You need to install plugin_debugger extension in your postgres database 

Its free and open source. You can download source code here https://git.postgresql.org/gitweb/?p=pldebugger.git;a=tree

README for make and install here - https://git.postgresql.org/gitweb/?p=pldebugger.git;a=blob_plain;f=README.pldebugger;hb=HEAD

Installation
------------

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

