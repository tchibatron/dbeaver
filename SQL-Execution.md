You can execute one query, a highlighted portion of a script, or a whole script.  This can be accomplished in several ways:
* Using a shortcut key combinations
* Using tools in the main toolbar: <img src="https://www.dropbox.com/s/qtahw2wgz5rmnkw/Execute%20commands%20in%20the%20toolbar.png?raw=1"/>
* Using the context menu (right-click the query):

  <img src="https://www.dropbox.com/s/tjmnteriqnc23c7/Execute%20menu.png?raw=1"/>  

* Using the main menu:
 
  <img src="https://www.dropbox.com/s/v2w72bpnak9wyej/Execute%20on%20main%20menu.png?raw=1"/>  

To execute a query under cursor or selected text, press <kbd>Ctrl+Enter</kbd> or right-click the query and click **Execute -> Execute SQL Statement** on the context menu. You can do the same using the main toolbar or main menu: **SQL Editor -> Execute SQL Statement**. This executes the SQL query under cursor or selected text and fills the results pane with query results.

To execute a query under cursor in a separate tab, press <kbd>CTRL+\ </kbd> or right-click the query and click **Execute -> Execute SQL in new tab** on the context menu. Same can be done using the main toolbar or the main menu: **SQL Editor -> Execute SQL in new tab**. This executes the SQL query under cursor or selected text and creates a new results tab.

To execute the whole script, press <kbd>Alt+X</kbd> or click **Execute -> Execute SQL Script** on the context menu or **SQL Editor -> Execute SQL Script** on the main menu or in the main toolbar. This executes all queries in the current editor (or selected queries) as a script. DBeaver parses queries one by one using a statements delimiter (“;” by default) and executes them consequently. You can configure the script execution behavior in the SQL editor preferences (Right-click the script and click **Preferences** on the context menu).

To execute a script opening each query results in a separate tab, press <kbd>Ctrl+Alt+X</kbd> or click **Execute -> Execute Statements In Separate Tabs** on the context menu or **SQL Editor -> Execute Statements In Separate Tabs** on the main menu or in the main toolbar. The executes all queries in the script but opens multiple result tabs. Each script query is executed in a separate thread (that is, all queries are executed simultaneously).  
NOTE: Be careful with this feature. If you execute a huge script with a large number of queries, it might cause unexpected problems. 

## Dynamic Parameter Bindings

You can use dynamic parameters in your SQL queries. The parameter format is :name. When you execute a query which contains dynamic parameters, DBeaver displays a dialog box in which you can fill the parameters` values:

<img src="https://www.dropbox.com/s/adne99abuixgpor/Parameter%20bindings.png?raw=1"/>

Also you can use anonymous parameters (?) but then you need to enable them in SQL editor preferences. 

## Execution Plan

If a database driver supports execution plan visualization, you can see the execution plan of the current query (under cursor) by pressing <kbd>Ctrl+Shift+E</kbd> or clicking **Explain execution plan** on the context menu or in the main toolbar: <img src="https://www.dropbox.com/s/dug8beiaot1r6n4/Explain%20execution%20plan.png?raw=1"/>  
The execution plan command generates a tree of query execution and is convenient in estimating if the query/script is quick/optimal enough. 

The result is an execution plan tree that appears as one of result tabs:

<img src="https://www.dropbox.com/s/pvep9egs9mefd5t/Execution%20plan%20result.png?raw=1"/>

You can click the rows of the execution plan to see their details in the panels below and to the right of the plan.


## Exporting Query
You can directly export the current query results to a file/table by right-clicking the query and then clicking **Execute -> Export From Query** on the context menu. This feature is useful if you have some very long-running query and you do not need to see its results in results panel.  

## Miscellaneous
* To select the current query row count, press <kbd>Ctrl+Alt+C</kbd>.  
* To open the definition of the database object currently in focus (under cursor) in a viewer/editor, press <kbd>F4</kbd>.  
* You can open SQL editor preferences by pressing <kbd>Alt+Enter</kbd>.