The metadata editor is available for multiple database objects such as tables, views and schemas. To open the metadata editor for an object, in the [Database Navigator](https://github.com/serge-rider/dbeaver/wiki/Database-Navigator) or in the [Projects](https://github.com/serge-rider/dbeaver/wiki/Projects) view:
* Double-click the database object
* Click the database object and press <kbd>Enter</kbd> or <kbd>F4</kbd>

The editor has three tabs:
* **Properties** tab appears for all objects, contains properties of the database object and its sub-entities, see further in this article
* **Data** tab appears for tables and views and represents the [Data Editor](https://github.com/serge-rider/dbeaver/wiki/Data-Editor)
* **ER Diagram** tab appears for tables and schemas and displays ERD (Entity Relation Diagrams), see [ER Diagrams](https://github.com/serge-rider/dbeaver/wiki/ER-Diagrams) and [Database Structure Diagrams](https://github.com/serge-rider/dbeaver/wiki/Database-Structure-Diagrams)

The tabs have the following common parts:

<img src="https://www.dropbox.com/s/jt5icc117393bg2/DB%20Object%20edito%20with%20markup.png?raw=1"/>

The object`s path shows the chain of all its parent entities. The entities are clickable: clicking an entity in the path, depending on its nature, either shows its children or opens an editor or a settings window.

The toolbar contains different tools on each of the three tabs.

An asterisk appears in the title of an editor if it contains unsaved changes:

<img src="https://www.dropbox.com/s/deojn9xj28njz4a/Asterisk.png?raw=1"/>

The Database Object editor supports the Ctrl+Z (undo) function.

The Properties tab of the [Database Object Editor](https://github.com/serge-rider/dbeaver/wiki/Database-Object-Editor) provides tools to view and edit the database object`s properties. 

<img src="https://www.dropbox.com/s/w01qxmgh5l82j2s/View%20editor.png?raw=1"/>

The content area of the Properties tab falls into two parts: the upper pane displays properties of the current database object itself while the lower pane contains properties of the object`s sub-entities or some complex properties like DDL (an SQL description of the current database object).

Properties of sub-entities appear in tabbed editors – to open such an editor, click the tabs on the left side of the area:

(picture)

The toolbar at the bottom of a tabbed editor provides the following tools for the majority of sub-entities except for some specific ones like Permissions (in PostreSQL) or SQL based views (DDL and Source):

Button|Name|Description
------|----|-----------
<img src="https://www.dropbox.com/s/ymgrvdc9rizdxmo/search%20icon.png?raw=1"/>|Search items|Displays a search field next to the button:<br/>- Type in the search combination - the content updates dynamically<br/>- To remove the filter, click the cross icon next to the search field
<img src="https://www.dropbox.com/s/c49v6wtsr4w7tin/Filter%20settings%20icon.png?raw=1"/>|Filter settings|Opens the Filtering window which allows setting a custom filter, see [Configure Filters](https://github.com/serge-rider/dbeaver/wiki/Configure-Filters)
<img src="https://www.dropbox.com/s/h01225sper0kfjw/Configure%20columns%20icon.png?raw=1"/>|Configure columns|Opens the Configure columns dialog box in which you can select the columns to display or hide in the current view
<img src="https://www.dropbox.com/s/b0kh0gj14wvfhlx/Refresh%20items%20icon.png?raw=1"/>|Refresh the selected items|Depending on the database type, refreshes either the current item or its parent or the whole database object – reloading data from the database
<img src="https://www.dropbox.com/s/vlflmta976cuydd/View-edit%20item%20icon.png?raw=1"/>|View / Edit [items]|Opens an editor for the item currently in focus
<img src="https://www.dropbox.com/s/ba6fqyb6adkuoxg/Create%20new%20item%20icon.png?raw=1"/>|Create new [items]|Creates a new item of the same type as currently displayed in the open view, for example, a column
<img src="https://www.dropbox.com/s/xbf7xgvi6bcrpzz/Delete%20object%20icon.png?raw=1"/>|Delete database object|Deletes the item currently in focus
<img src="https://www.dropbox.com/s/ap5204kc1itnijc/Save%20button.png?raw=1"/>|Save the current contents|- Same as the Save button on the application main toolbar<br/>- Same as <kbd>Ctrl+S</kbd><br/>- Opens the Persist Changes window that allows saving changes in the currently open sub-entity<br/>NOTE: DBeaver recommends saving work after each change. 
<img src="https://www.dropbox.com/s/70jsleztkvw9ce4/Revert%20button.png?raw=1"/>|Revert to the last saved state|Reverts all changes made to the whole database object to the last saved state 

Items in the tabbed editors have context menus which provide the same commands as those in the [Database Navigator](https://github.com/serge-rider/dbeaver/wiki/Database-Navigator). To open a context menu for an item, right-click the item. 

# SQL Script Editors
SQL script editors (**DDL** and **Source**) of the Properties tab contain SQL script that you can either view or modify.
The toolbar of the DDL and Source tabs provides the following tools:

Button|Name|Description
------|----|-----------
<img src="https://www.dropbox.com/s/9eobh6afyqdj4c5/Load%20from%20file%20icon.png?raw=1"/>|Load form file|- Allows selecting a file from the file system<br/>- Disabled if the SQL code is read-only
<img src="https://www.dropbox.com/s/n8kw5nreu19kwp6/Save%20to%20file%20icon.png?raw=1"/>|Save to file|Allows saving the current SQL code to a file
<img src="https://www.dropbox.com/s/lsggyzs1acoq7iy/Open%20in%20SQL%20Console%20icon.png?raw=1"/>|Open in SQL console|Opens the SQL code in an SQL Editor

You can select parts of the SQL code and apply generic commands such as copy-paste or SQL-specific commands like formatting – using the context menu. To open the context menu, right-click the SQL code. See [SQL Editor](https://github.com/serge-rider/dbeaver/wiki/SQL-Editor) for information about SQL-specific commands.

NOTE: **SQL Assist**, **SQL Template**, and **SQL Context Information** menu items on the context menu are disabled if the SQL script is read-only.