Database Navigator is the main view to work with the structure and content of databases. To open Database Navigator, on the Windows menu, click **Database Navigator**. For information on how to change the view layout, please see the [Application Window Overview](https://github.com/serge-rider/dbeaver/wiki/Application-Window-Overview) article.

[[images/database-navigator.png]]

Database Navigator contains a tree of objects, a toolbar and View menu which contain generic items. Each object in the tree has its own context menu.
The tree contains the following objects:
* Folders - <img src="https://www.dropbox.com/s/kxehrqzy14u88d4/Connection%20folder%20icon.png?raw=1">
* Database connections - <img src="https://www.dropbox.com/s/vcoyyh5ygds38qe/Connections%20icons.png?raw=1"> and other (icons differ depending on the database type)
* Database objects - various depending on the database type, such as Tables <img src="https://www.dropbox.com/s/f4dsi8knfu62v7k/Table%20icon.png?raw=1">, Views <img src="https://www.dropbox.com/s/2plf0fwwaorw82l/View%20icon.png?raw=1">, Columns <img src="https://www.dropbox.com/s/wxffh1j7sd8m2sp/Column%20icons.png?raw=1">, Indexes <img src="https://www.dropbox.com/s/bkegxqbvrohucqq/Index%20icon.png?raw=1">, etc.

To open the view menu of Database Navigator, click the View Menu button (<img src="https://www.dropbox.com/s/k4ut6zbp5apbcdo/View%20menu%20icon.png?raw=1"/>) in the upper-right corner of the window. 
For more information on where to find the view toolbar and menu, please see the [Views](https://github.com/serge-rider/dbeaver/wiki/Views) article.

The menu contains the following items:

Icon|Menu item|Description
----|---------|-----------
<img src="https://www.dropbox.com/s/iwa48qjl029pkzh/Driver%20Manager%20icon.png?raw=1"> |**Driver Manager**|Opens the Driver Manager window that allows creating, editing and deleting drivers for databases. See … for information about managing database drivers
<img src="https://www.dropbox.com/s/dkysg3skiwl2n9e/New%20connection%20icon.png?raw=1"> |**New Connection**|Opens the Create new connection wizard. See … for information about creating connections
(empty) | **Active Project** |Displays a submenu which allows you to choose a project. See ... for information about projects.
<img src="https://www.dropbox.com/s/pg9eoar3zkyymem/New%20Folder%20icon.png?raw=1"> |**New Folder** |Opens a dialog box for creating a new folder
<img src="https://www.dropbox.com/s/jg92vpaegfm8alz/Collapse%20All%20icon.png?raw=1"> | **Collapse All** |Collapses the tree to the root level
<img src="https://www.dropbox.com/s/8ctcn4vmkfex5zt/Link%20with%20editor%20icon.png?raw=1"> | **Link with editor** | Enabled when at least one editor is open, otherwise disabled - highlights the object in the tree that has its editor open

The toolbar is located in the title bar of the window, its buttons duplicate the menu items except for the **Active Project** one. 

To open the context menu for an object, right-click the object in the tree. The following table summarizes context menu items for all types of objects that may appear in the tree. Note that the presence or absence of context menu items for an object depends on the database and object types.

Menu item|Description
---------|-----------
**Open folder**|Opens a folder in a separate view
**Create new connections / Create New Connection**|Opens the Create new connection wizard
**New Folder**|Opens a dialog box for creating a new folder
**Copy**|Copies an object to the clipboard 
**Paste**|Inserts the copied object into a selected folder - most convenient for copy-pasting connections
**Delete**|Deletes an object<br/> **WARNING!** The Delete menu item removes the object not only from the tree but from the database itself or the file system, and this action is irreversible. 
**Rename**|Opens the Rename [object] dialog box
**Properties**|Opens the Properties for [object] window which allows viewing and modifying the object`s properties
**Refresh**|Depending on the object, refreshes the object itself, or its parent, or its subnodes – mostly used for refreshing tables and schemes
**Connect**|Attempts to connect to the database
**Invalidate/Reconnect**|Checks the status of connection, if it is broken, attempts to reconnect
**Disconnect**|Disconnects from the database
**SQL Editor**|Opens a new SQL editor for the connection
**Recent SQL Editor**|Opens the most recently opened SQL editor
**Edit Connection**|Opens the Connection Configuration window that allows configuring connection settings
**View [objects]**|-	For objects that DBeaver can create and delete, opens the object in a separate editor<br/>-	For objects that DBeaver cannot create and delete, opens the object in a separate viewer
**Edit [object]**|-	For objects that DBeaver can create and delete, opens the object in a separate editor<br/>-	For objects that DBeaver cannot create and delete, opens the object in a separate viewer
**Create new [object]**|Opens an editor in which you can specify properties and save the new object
**Filter**|Opens a submenu of one or more filtering options (depending on the object):<br/>-	Hide [object]<br/>-	Show only [object]<br/>-	Configure [objects] filter<br/>-	Toggle filter<br/>-	Clear filter<br/> See ... for information.
**Copy Advanced Info**|Copies the full name of an object
**Read Data in SQL Console**|Opens an SQL console displaying the object`s data
**Copy Advanced Info**|Copies the full name of an object
**Read Data in SQL Console**|Opens an SQL console displaying the object`s data
**Compare**|- Appears only if you select several objects of the same level<br/> - Opens the Compare objects wizard which guides you through the steps to generate a comparison report for the selected objects
**Generate SQL**|Opens a submenu on which you can select the type of SQL query to generate:<br/>- SELECT<br/>- INSERT<br/>- UPDATE<br/>- DELETE<br/>- MERGE<br/>- DDL<br/> Clicking one of the items (for example INSERT) generates a relevant query in a separate window.
**Tools**|Opens a submenu that provides tools for database backup and restore, vacuum, etc.

# Filtering Database Objects
You can filter database objects to include or exclude some of them from the view. You can filter schemas, tables, views and procedures. A `(...)` sign next to the node`s name indicates that a filter is applied to its sub-nodes:
<img src="https://www.dropbox.com/s/srxfd7qu29321cl/Filtered.png?raw=1">

There are several ways in which you can filter objects.
One of the ways is to filter objects by names of tables and views using the filter field above the tree of objects:

<img src="https://www.dropbox.com/s/u74zvc5bayf678l/DB%20Nav%20filter.png?raw=1">

To filter objects by the name of a table and view, type the name into the field. The tree dynamically updates to show tables / views with that name. To reset the filter, click the Clear icon  (<img src="https://www.dropbox.com/s/sk0yqgs5sdr6v87/Clear%20filter%20icon.png?raw=1">) on the right end of the field.

Another way to filter objects is to use the **Filter** item on the context menu of a single object. To filter objects using the **Filter** menu, right-click the object, then click **Filter** on the context menu, and then click one of the items on the submenu:

Filter submenu item|Description
-------------------|-----------
**Hide ‘[object name]’**|Hides the current object while displaying the other ones
**Show only ‘[object name]’**|Shows the current object while hiding the other ones
**Toggle filter**|Inverts the filtering – shows hidden objects and vice versa
**Clear filter**|Removes the filtering to display all objects
**Configure [objects] filter**|Appears only for folder or parent nodes of  database objects - like ‘Tables’, ‘Indexes’, etc. Allows creating a complex filter with multiple filtering criteria, see Configuring Complex Filters.

A third way of filtering is to use the **Filter** item on the context menu on several objects:
1. Select several objects of the same type using Ctrl or Shift keys.
2. Right-click the selection, then click **Filter**, and then choose one of the options on the submenu:

Filter submenu item|Description
-------------------|-----------
**Hide N objects**|Hides the selected objects while displaying the rest
**Show only selected objects**|Shows the selected objects while hiding the rest

To reset such filters, right-click the parent (folder) node displaying the `(...)` sign, and then click **Filter -> Clear filter**.

## Configuring Filters
To configure a custom filter:
1. Right-click the object and on the context menu click **Filter -> Configure [objects] filter**. The Filtering window opens.

   <img src="https://www.dropbox.com/s/32uvjklnx1d3wpg/Filtering%20dialog.png?raw=1"/>

2. Select the **Enable** checkbox to activate the fields of the window.
3. If you want the filter to apply to all objects of a certain type, for example to all schemes, click **Show global filter**. Otherwise, the filter will apply only to the current object.
NOTE: Once you apply the global filter, you cannot revert back to the local filer in the same window. To create a local filter, reopen the Filtering window, see Step 1.
4. For objects that you want to show, click **Add** next to the **Include** field and then, in the field itself, enter the name or combination of symbols to search. 
For objects that you want to hide, click **Add** next to the **Exclude** field and then, in the field itself, enter the name or combination of symbols to search. 
NOTE: You can use masks with `%` and `*` to replace one or more symbols and `_` to replace one symbol in the search combination.
5. To remove one filtering combination, click the combination in the field and then click **Remove**. To remove all combinations from either of the fields, click **Clear** next to the field.
6. Once you set all filtering criteria, you can save a filter to use for other objects. To save the filter, in the Saved filter area, in the **Name** field, enter the filter`s name and click **Save**.
7. You can also remove any of the saves filters. To remove a filter, in the **Name** drop-down list, click the filter name and then click **Remove**.
8. Click **OK** to apply the filtering criteria. Otherwise, click **Cancel**.
