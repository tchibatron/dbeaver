The Database object, or metadata, editor is available for multiple database objects such as tables, views and schemas. To open the metadata editor for an object, in the [Database Navigator](https://github.com/serge-rider/dbeaver/wiki/Database-Navigator) or in the [Projects](https://github.com/serge-rider/dbeaver/wiki/Projects) view:
* Double-click the database object
* Click the database object and press <kbd>Enter</kbd> or <kbd>F4</kbd>

The editor has three tabs:
* **Properties** tab appears for all objects, contains properties of the database object and its sub-entities, see further in this article 
* **Data** tab appears for tables and views and represents the [Data Editor](https://github.com/serge-rider/dbeaver/wiki/Data-Editor)
* **ER Diagram** tab appears for tables and schemas and displays ERD (Entity Relation Diagrams), see [ER Diagrams](https://github.com/serge-rider/dbeaver/wiki/ER-Diagrams) and [Database Structure Diagrams](https://github.com/serge-rider/dbeaver/wiki/Database-Structure-Diagrams)

The tabs have the following common parts:

[[images/ug/Metadata-editor.png]]

The object`s path shows the chain of all its parent entities. The entities are clickable: clicking an entity in the path, depending on its nature, either shows its children or opens an editor or a settings window.

The toolbar contains different tools on each of the three tabs.

An asterisk appears in the title of an editor if it contains unsaved changes:

<img src="https://www.dropbox.com/s/deojn9xj28njz4a/Asterisk.png?raw=1"/>

The Database Object editor supports the Ctrl+Z (undo) function.


## SQL Script Editors
SQL script editors (**DDL** and **Source**) of the Properties tab contain SQL script that you can either view or modify.
The toolbar of the DDL and Source tabs provides the following tools:

Button|Name|Description
------|----|-----------
<img src="https://www.dropbox.com/s/9eobh6afyqdj4c5/Load%20from%20file%20icon.png?raw=1"/>|Load form file|- Allows selecting a file from the file system<br/>- Disabled if the SQL code is read-only
<img src="https://www.dropbox.com/s/n8kw5nreu19kwp6/Save%20to%20file%20icon.png?raw=1"/>|Save to file|Allows saving the current SQL code to a file
<img src="https://www.dropbox.com/s/lsggyzs1acoq7iy/Open%20in%20SQL%20Console%20icon.png?raw=1"/>|Open in SQL console|Opens the SQL code in an SQL Editor

You can select parts of the SQL code and apply generic commands such as copy-paste or SQL-specific commands like formatting – using the context menu. To open the context menu, right-click the SQL code. See [SQL Editor](https://github.com/serge-rider/dbeaver/wiki/SQL-Editor) for information about SQL-specific commands.

NOTE: **SQL Assist**, **SQL Template**, and **SQL Context Information** menu items on the context menu are disabled if the SQL script is read-only.