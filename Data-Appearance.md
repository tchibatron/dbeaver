The main tool for managing the appearance of the data table is the Result Set Order/Filter Settings window.

[[images/ug/Result-Set-Settings-window.png]]

To open this window, click the Custom Filters button ([[images/ug/Filter-button.png]]) in the top toolbar or click the Configure button ([[images/ug/Configure-columns-visibility-icon.png]]) and then click **Order/Filter** on the dropdown menu.

This window provides instruments to:
* Order data inside columns
* Manage the display of columns in the table
* Manage the order of columns in the table
* Filter data in the table using an SQL expression, see … below

Another tool for managing data appearance are column headers. In the data table, every column header contains three elements each having its own function: Data (column) type icon, column name, filter icon, and ordering icon.

[[images/ug/Column-header.png]]

* Simply clicking the column name or column type icon highlights the whole column.
* You can click the column type icon and then drag and drop the column to a different position in the table.
* You can click the column name and then drag the cursor right or left to highlight multiple columns. 
* Clicking the ordering icon allows ordering the data in the column in ascending or descending order - see 'Ordering Data in Columns' section further in this article
* Clicking the filter icon allows filtering the data by a cell value, see [TBA]

## Ordering Data in Columns
You can order data in columns in one of the ways:
1. Click the ordering icon  (<img src="https://www.dropbox.com/s/0dfzmn77oko7s9v/Ordering%20icon.png?raw=1"/>) in the header of the column. The icon has three states:
   * Clicking once establishes ascending order (<img src="https://www.dropbox.com/s/pcxcudkktb9ewkv/Ascending%20order%20icon.png?raw=1"/>) 
   * Clicking a second time changes the order to descending (<img src="https://www.dropbox.com/s/uu9hzcjbtwxfozw/Descending%20order%20icon.png?raw=1"/>)  
   * Clicking a third time removes the ordering from the column (<img src="https://www.dropbox.com/s/0dfzmn77oko7s9v/Ordering%20icon.png?raw=1"/>)  

To order data by several columns, go column by column, setting the order with the Ordering icon, starting from the column by which you want to order data first.
  
2. Click the Custom Filters icon (<img src="https://www.dropbox.com/s/c49v6wtsr4w7tin/Filter%20settings%20icon.png?raw=1"/>) to open the Result Set Order/Filter Settings window (see above):

   a) Next to the column by which you want to order data in the first turn, set the ascending or descending order using the same three-state principle as described above.  
   b) Set the ordering in other columns by which you want to sort data in the second, third, etc. turn. The **Order** column indicates the order in which the sorting will happen.  
   NOTE: The number (**#**) column indicates the initial order of columns.  
   c) To easily move the ordering setting from column to column, you can use the Move up/down/to top/to bottom/ buttons: <img src="https://www.dropbox.com/s/vmn35r0pjv0pjde/Up-Down%20buttons.png?raw=1"/>   

To reset the data ordering to its initial state, click the Reset button (<img src="https://www.dropbox.com/s/djtedg8jjid1udm/Reset%20button.png?raw=1"/>).

Also, to remove all ordering settings, click the Remove All Filters/Orderings button (<img src="https://www.dropbox.com/s/vvqyaz3blha7wf2/Remove%20all%20filters%20button.png?raw=1"/>)
in the top toolbar.

## Managing Display of Columns in Data Table

To hide a single column, right-click the column or any cell in it and click **Hide column** on the context menu. To unhide a hidden column, open the Result Set Order/Filter Settings window (see the image earlier in this section) and select the checkbox next to the column name or click the Reset button (<img src="https://www.dropbox.com/s/djtedg8jjid1udm/Reset%20button.png?raw=1"/>).

To display or hide columns in the data table, in the Result Set Order/Filter Settings window:
1. Select the checkboxes next to the columns that you want to see in the table and clear the checkboxes next to those that you want to hide.
2. Use the Show All (<img src="https://www.dropbox.com/s/6k7iamq60gdhyto/Show%20All%20button.png?raw=1"/>)  and Show None (<img src="https://www.dropbox.com/s/ffll7ftbdmdmy8v/Show%20None%20button.png?raw=1"/>) buttons at the bottom of the window.

## Sorting Columns in Data Table

You can modify the order of columns in the data table in two ways:
1.	Click the icon in the column header and drag-and-drop the column to a new position.
2.	To sort column alphabetically, in the Result Set Order/Filter Settings window, click the Sort button (<img src="https://www.dropbox.com/s/4p154wspfs60pwv/Sort%20button.png?raw=1"/>)
3.	In the Result Set Order/Filter Settings window, click the column to set focus to it and then move it using the navigation buttons: (<img src="https://www.dropbox.com/s/vmn35r0pjv0pjde/Up-Down%20buttons.png?raw=1"/>)

## Data Presentation

You can switch between two data presentations in SE version and four presentations in EE version. Pressing <kbd>CTRL+~</kbd> switches available presentations in turn.
* To see data in a grid view, similar to Excel spreadsheet, click the **Grid** button in the bottom toolbar.
* To switch to the plain text view, click **Text** in the bottom toolbar.
* To switch to JSON view (available in EE version only for MongoDB documents and JSON tables), click **JSON** in the toolbar.
* To switch to XML view (available in EE version only for XML tables), click **XML** in the toolbar.

## Table vs. Record Views

The table view is a standard table (Excel-like) in which columns are vertical and rows are horizontal. This view is the default one. If you click the **Record** button in the bottom toolbar or press <kbd>Tab</kbd>, the rows and columns switch positions – columns appear as rows, and rows hide in one **Value** column which now shows only one row of data.  The Record view is useful if the table contains a big number of columns. To navigate from row to row of data, use the navigation buttons in the bottom toolbar: <img src="https://www.dropbox.com/s/hng62ypf43elz5s/Navigation%20buttons.png?raw=1"/>

To return back to the standard table view, click the **Record** button again.

## Rows Coloring
TBA