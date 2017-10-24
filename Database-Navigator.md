Database Navigator is the main view to work with the structure and content of databases. For information on how to open views and where to find the view toolbar and menu, please see the [Views](https://github.com/serge-rider/dbeaver/wiki/Views) article. For information on how to change the view layout, please see the [Application Window Overview](https://github.com/serge-rider/dbeaver/wiki/Application-Window-Overview) article.

[[images/database-navigator.png]]

The Database Navigator view contains a tree of objects:
* Folders - <img src="https://www.dropbox.com/s/kxehrqzy14u88d4/Connection%20folder%20icon.png?raw=1">
* Database connections - <img src="https://www.dropbox.com/s/vcoyyh5ygds38qe/Connections%20icons.png?raw=1"> and other (icons differ depending on the database type)
* Database objects - various depending on the database type, such as Tables <img src="https://www.dropbox.com/s/f4dsi8knfu62v7k/Table%20icon.png?raw=1">, Views <img src="https://www.dropbox.com/s/2plf0fwwaorw82l/View%20icon.png?raw=1">, Columns <img src="https://www.dropbox.com/s/wxffh1j7sd8m2sp/Column%20icons.png?raw=1">, Indexes <img src="https://www.dropbox.com/s/bkegxqbvrohucqq/Index%20icon.png?raw=1">, etc.

The view menu contains the following menu items:

Icon|Menu item|Description
----|---------|-----------
<img src="https://www.dropbox.com/s/iwa48qjl029pkzh/Driver%20Manager%20icon.png?raw=1"> |**Driver Manager**|Opens the Driver Manager window that allows creating, editing and deleting drivers for databases. See … for information about managing database drivers
<img src="https://www.dropbox.com/s/dkysg3skiwl2n9e/New%20connection%20icon.png?raw=1"> |**New Connection**|Opens the Create new connection wizard. See … for information about creating connections
(empty) | **Active Project** |Displays a submenu which allows you to choose a project. See ... for information about projects.
<img src="https://www.dropbox.com/s/pg9eoar3zkyymem/New%20Folder%20icon.png?raw=1"> |**New Folder** |Opens a dialog box for creating a new folder
<img src="https://www.dropbox.com/s/jg92vpaegfm8alz/Collapse%20All%20icon.png?raw=1"> | **Collapse All** |Collapses the tree to the root level
<img src="https://www.dropbox.com/s/8ctcn4vmkfex5zt/Link%20with%20editor%20icon.png?raw=1"> | **Link with editor** | Enabled when at least one editor is open, otherwise disabled - highlights the object in the tree that has its editor open

The toolbar buttons duplicate the menu items except for the **Active Project** one.

The following table summarizes context menu items for all types of objects that may appear in the tree. Note that the presence or absence of context menu items for an object depends on the database type and the object type.

Menu item|Description
---------|-----------
**Open folder**|Opens a folder in a separate view
**Create new connections / Create New Connection**|Opens the Create new connection wizard
**New Folder**|Opens a dialog box for creating a new folder
**Copy**|Copies an object to the clipboard 
**Paste**|Inserts the copied object into a selected folder - most convenient for copy-pasting connections
**Delete**|Deletes an object<br/> **WARNING!** The Delete menu item removes the object not only from the tree but from the database itself or the file system, and this action is irreversible. 
**Rename**|Opens the Rename [object] dialog box
