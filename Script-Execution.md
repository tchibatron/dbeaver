There are a few ways to execute a query:
- Standard query execute (<kbd>CTRL+ENTER</kbd>). Executes SQL query under cursor or selected text and fills results panel with query results.
- Execute in a separate tab (<kbd>CTRL+\ </kbd>). Similar to standard but creates new results tab.
- Execute a script (<kbd>ALT+X</kbd>). Executes all queries in current editor (or selected queries) as a script. DBeaver parses queries one by one using statements delimiter (“;” by default) and execute them consequently. Script execution behaviour can be configured in SQL editor preferences.
- Execute a script opening each query results in a separate tab (<kbd>CTRL+ALT+X</kbd>). The same as script execution but opens multiple result tabs. Each script query will be executed in a separate thread (i.e. all queries are executed simultaneously). Be careful with this feature – if you’ll execute a huge script with big number of queries it may lead to unexpected problems. 
