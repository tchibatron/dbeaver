# Projects

You might need to classify and group database connections into projects.  Projects store objects related not to a particular database but to all database connections. These are usually files stored on the file system.

The Projects view displays all projects created in the system and provides tools to manage them. To open the Projects view, on the **Window** menu, click **Projects** (or use ALT+W+P shortcut).

<img src="https://www.dropbox.com/s/v51mrexzl4a561z/Projects%20view.png?raw=1"/>

The projects are organized into a tree and all have the same high-level structure:
* **Connections** – repeat the content of the Database Navigator view for this project. You can perform the same actions over the objects of the databases as in Database Navigator.
* **Bookmarks** – contains bookmarks – links to a database object that you have added as a bookmark, see … 
* **ER Diagrams** - 
* **Scripts** – 

The Projects view provides a toolbar and View menu which contain generic items. Each object in the tree has its own context menu.

To open the view menu of the Projects view, click the View Menu button (<img src="https://www.dropbox.com/s/k4ut6zbp5apbcdo/View%20menu%20icon.png?raw=1"/>) in the upper-right corner of the window. The view menu contains the following items:

Icon|Item|Description
----|----|-----------
<img src="https://www.dropbox.com/s/jlswp7lf1fwijvy/Create%20project%20icon.png?raw=1"/>|Create Project|Opens the Create Project wizard
<img src="https://www.dropbox.com/s/t47ic11b7fxt36d/Refresh%20projects%20icon.png?raw=1"/>|Refresh Projects|Refreshes the projects tree to display changes caused by creating modifying or deleting projects 
<img src="https://www.dropbox.com/s/jg92vpaegfm8alz/Collapse%20All%20icon.png?raw=1"/>|Collapse All|	Collapses the tree to the root level
<img src="https://www.dropbox.com/s/8ctcn4vmkfex5zt/Link%20with%20editor%20icon.png?raw=1"/>|Link with editor|- Enabled when at least one editor is open, otherwise disabled<br/>- Highlights the object in the tree that has its editor open

The toolbar is located in the title bar of the window, its buttons duplicate the view menu items except for the **Refresh Projects** one.

## Filtering objects

Each database section  has an option to filter in or out specific objects. You can filter schemas, tables, views and procedures. The name of the section changes to include `(...)` marker if the filter is currently enabled.

To quickly filter out specific tables select them and use the option _Filter N objects_:

When defining the names of the objects to filter you can use SQL glob-like chars `%` and `_`.
