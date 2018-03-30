Connection types define how DBeaver behaves regarding:
* Default transactions commit mode - with or without automatic commit of changes to the database.

  NOTE: You can override the default commit behavior during your work with connections by changing the commit mode, see [Auto and Manual Commit Modes](https://github.com/dbeaver/dbeaver/wiki/Auto-and-Manual-Commit-Modes).  

* SQL statements execution (with or without user confirmation). If set to require user confirmation of SQL execution, DBeaver shows a confirmation message every time you attempt to execute a ‘transaction’ type of query (INSERT/DELETE/UPDATE, etc.):

  [[images/ug/Confirm-query-execution-dialog.png]]

For your convenience, DBeaver supports color-coding of connection types so that you know at once which behavior to expect when you use a certain connection. Colored are database connections that use a certain connection type in the [Database Navigator](https://github.com/dbeaver/dbeaver/wiki/Database-Navigator) and [Projects](https://github.com/dbeaver/dbeaver/wiki/Projects) views as well as editors related to these connections:

[[images/ug/Colored_connections.png]]

To manage connection types for a database connection, in the Database Navigator or Projects view, click the connection to set focus to it and then press <kbd>F4</kbd> to open the connection properties window. Then, in the properties window, in the navigation pane on the left, click **General** to see the general settings. You can see **Connection Type** field among the settings:

[[images/ug/Connection-Properties-General.png]]

There are three default connection types – **Development**, **Test**, and **Production**. You can change the connection type for your database connection as well as you can create a new connection type, edit or delete an existing one.