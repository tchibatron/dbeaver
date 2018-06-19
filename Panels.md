Panels provide additional space on the Data editor in which you can manipulate with data. The panels are handy if you work with complex types (structures, arrays), or long text data, or BLOBs. Panels appear as tabs in an additional pane in the right part of the Data tab: 

[[images/ug/Panels.png]]

This additional pane appears only when you open one of the four panels:
* Calc
* Grouping
* Metadata
* Value viewer (default)

To open panels, click **Panels** in the bottom toolbar. By default, the Value viewer panel opens. Alternatively, you can open the Value panel by pressing <kbd>F7</kbd> on a cell.
To open the other two panels, click the down arrow next to the **Panels** button and click the name of the panel on the menu:

[[images/ug/Panels-menu.png]]

Panels also open if you try to inline-edit a cell with a complex data type.

To close panels, click the **Panels** button again or click the standard Close (cross) icon in the upper right corner of each panel.  
You can also show and hide panels by clicking the Configure button ([[images/ug/Configure-columns-visibility-icon.png]]) in the bottom toolbar and then **Toggle result panels** on the Configure dropdown menu.

## Value Viewer

The Value viewer panel displays just one value that is currently in focus and allows editing it.
 
[[images/ug/Value-Viewer.png]]

The **Apply cell value** ([[images/ug/Apply-cell-value-button.png]]) and **Auto-apply value** ([[images/ug/Auto-apply-value-button.png]]) buttons in the toolbar of the panel only affect the display of the changes made in the Value viewer back in the Data table but do not save them in the database. To save the changes in the database, you need to use the **Save** button in the bottom toolbar of the Data Editor.

The **Auto-save value** button enables automatic display of changes made in the Value viewer in the data table. When auto-saving is enabled, the changes appear in the data table at the same time when they are made in the Value viewer.

## Metadata Panel
The Metadata panel displays metadata for each cell in the row containing the cell currently in focus. You can just view the metadata.

[[images/ug/Metadata-panel.png]]

## Calc Panel

The Calc panel is useful for getting basic statistics across data in several columns and rows:

[[images/ug/Aggregate-panel.png]]

You can select several columns and rows in standard ways - by pressing and holding the left mouse button or by clicking cells while holding the <kbd>Ctrl</kbd> or <kbd>Shift</kbd> keys. The panel updates dynamically to shows statistics for the selected data.

To see data grouped by columns, click the Group by columns button ([[images/ug/Group-by-columns-button.png]]). To remove the grouping by columns and see summary values for all columns, click the same button again.

By default, the panel applies and displays results for two functions – **Count** and **Count Distinct**. To add other functions, click the **Add function** ([[images/ug/Add-function-button.png]]) button in the toolbar of the panel or right-click one of the rows in the Aggregate panel and click **Add function** on the context menu and then click the name of the function. The following functions are available:
* Sum
* Average
* Minimum
* Maximum
* Median
* Mode

To remove an individual function, click the function and then click **Remove function** ([[images/ug/Remove-function-button.png]]) in the toolbar of the panel, or right-click the function and click **Remove function** on the context menu. To remove all functions, click **Reset** ([[images/ug/Reset-function-button.png]]) in the toolbar or on the context menu.

You can copy the value of a particular function to the clipboard - right-click the row and click **Copy Value** on the context menu.  
You can also copy all functions with their values - right-click in the table and click **Copy All** on the context menu. 

## Grouping Panel

It allows to calculate statistics based on a table of custom SQL query.
It uses GROUP BY queries to extract values for COUNT, SUM, AVG, MIN, MAX and other analytics functions.

Open the panel and drag-n-drop results column(s) into it. By default COUNT function will be used.

