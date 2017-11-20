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
<img src="|Create new [items]|Creates a new item of the same type as currently displayed in the open view, for example, a column
<img src="|Delete database object|Deletes the item currently in focus
<img src="|Save the current contents|- Same as the Save button on the application main toolbar<br/>- Same as <kbd>Ctrl+S</kbd><br/>- Opens the Persist Changes window that allows saving changes in the currently open sub-entity<br/>NOTE: DBeaver recommends saving work after each change. 
<img src="|Revert to the last saved state|Reverts all changes made to the whole database object to the last saved state 

Items in the tabbed editors have context menus which provide the same commands as those in the [Database Navigator](https://github.com/serge-rider/dbeaver/wiki/Database-Navigator). To open a context menu for an item, right-click the item. 
