## SQL Templates

Templates allow you to insert frequently used SQL statements into an SQL script.

To see available templates, press <kbd>Ctrl+Alt+SPACE</kbd> or right-click the line in the script pane and click **SQL Template** on the context menu. A box appears with a list of available templates:

<img src="https://www.dropbox.com/s/k0lvcfrnjcyfxg4/Available%20templates.png?raw=1"/>

To apply a template, in the SQL Editor, in the script pane:
* Type the template name and press <kbd>Tab</kbd>
* Right-click the line where you want to insert a template expression, click **SQL Template** on the context menu, and then, in the list of templates, double-click the required template name.  
The template SQL statement appears in the script.
  
To edit/add/remove templates, click Configure (<img src="https://www.dropbox.com/s/h01225sper0kfjw/Configure%20columns%20icon.png?raw=1"/>) in the bottom toolbar, then click **Preferences -> SQL Editor -> Templates**. 
For more information about managing templates, please visit [Eclipse Website](http://help.eclipse.org/juno/index.jsp?topic=%2Forg.eclipse.jdt.doc.user%2Fconcepts%2Fconcept-editor-templates.htm).

#### [Standard Eclipse templates](http://help.eclipse.org/juno/topic/org.eclipse.jdt.doc.user/concepts/concept-template-variables.htm?cp=1_2_6_0):  

| Variable | Description |
-----------|-------------|
|${cursor} | Specifies the cursor position when the template edit mode is left. This is useful when the cursor should jump to different place than to the end of the template upon leaving the template edit mode. |
|${year} | Takes the current year value |
|${date} | Takes the current date value |
|${time} | Takes the current time value |
|${dollar} | Takes the dollar sign $. Alternatively, two dollar signs can be used: $$. |
|${user} | Takes the user name |
|${word_selection} | Takes the content of the current text selection |
|${line_selection} | Takes content of all currently selected lines

#### DBeaver-specific templates:  

| Variable | Description |
-----------|-------------|
|${schema} | Takes the current schema name |
|${catalog} | Takes the catalog name |
|${table} | Takes the current table name (from the active catalog/schema) |
|${column} | Takes the column name (from the current table) |


## SQL Assist and Auto-Complete
The SQL Assist feature provides auto-completion of database object names and SQL commands and other keywords in queries.
 
To perform some object name auto-complete, press <kbd>Ctrl+Space</kbd> or right-click the required place in the query and click **SQL Assist** on the context menu. DBeaver searches for potentially suitable objects in already loaded database metadata and in the database system tables. 

<img src="https://www.dropbox.com/s/p0pzgztwp4w9ivv/SQL%20Assist.png?raw=1"/>

When you start typing an SQL keyword in a statement, DBeaver offers auto-complete options as well.  
Another auto-complete function is search for completion only within already entered identifiers - press <kbd>Ctrl+Shift+Space</kbd>.  
