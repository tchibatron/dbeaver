###Overview
SQL editor allows editing and execution of SQL queries and scripts.  

There are several ways to open SQL editor 
- "SQL Editor" command (`F3` or `CTRL+L`) command opens a popup dialog where you can choose existing script or create a new one (for current connection)
- "New SQL Editor" creates new SQL script
- "Recent SQL Editor" (`CTRL+Enter`) opens SQL script with the most recent update time (for current connection). This command available only in Database Navigator view.
- Also you can find a script in Project Explorer view and open it (by pressing `Enter` or using double-click).

SQL editor highlights SQL syntax depending on the current database SQL dialect. When you open SQL editor for some connection, DBeaver will try to connect to underlying database. If the database is inaccessible then you won't be able to execute queries.

You may change the active database of current SQL editor by using the main toolbar.

There are two SQL execution modes: query and script.

###Query execution
The query execution command is accessible from the toolbar, context menu, main menu or with shortcut `CTRL+Enter`.
SQL editor extract current query - the SQL statement under the cursor limited by empty lines or statement delimiter (";" symbol by default).

Also you may select any part of text - it will be executed as a single query.
Query execution usually produces some result set - it will be printed in the "Results" tab. 
Read more about <a href="Data-Editor">Data Editor</a>

### Scripts execution
Script executes the entire content of the SQL editor or selected text. This command is accessible from the menu, toolbar or with shortcut `ALT+X`.
SQL editor parses content using the ";" character as a delimiter (it is configurable in preferences) between statements and then executes these statements consequently.

###Execution plan
You may automatically build an execution plan for the current query. This command is accessible from the toolbar or with the shortcut `CTRL+SHIFT+E`.

Driver provider must support execution plan extraction.

###Execution log
Execution log tab contains history of all command executed in the current SQL editor.
Read more information about <a href="Query-Manager">Query Manager</a>.
