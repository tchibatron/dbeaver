Connection types define how DBeaver behaves regarding:
* Default transactions commit mode - with or without automatic commit of changes to the database.

  NOTE: You can override the default commit behavior during your work with connections by changing the commit mode, see [Auto and Manual Commit Modes](https://github.com/dbeaver/dbeaver/wiki/Auto-and-Manual-Commit-Modes).  

* SQL statements execution (with or without user confirmation). If set to require user confirmation of SQL execution, DBeaver shows a confirmation message every time you attempt to execute a ‘transaction’ type of query (INSERT/DELETE/UPDATE, etc.):

  [[images/ug/Confirm-query-execution-box.png]]

For your convenience, DBeaver supports color-coding of connection types so that you know at once which behavior to expect when you use a certain connection. Colored are database connections that use a certain connection type in the Database Navigator and Projects views as well as editors related to these connections:
