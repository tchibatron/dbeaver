Panels provide additional space on the Data editor in which you can manipulate with data. The panels are handy if you work with complex types (structures, arrays) or long text data or BLOBs. Panels appear as tabs in an additional pane in the right part of the Data tab. This additional pane appears only when you open one of the three panels:
* Aggregate columns
* Metadata
* Value viewer (default)

To open panels, click **Panels** in the bottom toolbar. By default, the Value viewer panel opens. Alternatively, you can open the Value panel by pressing <kbd>F7</kbd> on a cell.
To open the other two panels, click the down arrow next to the **Panels** button and click the name of the panel on the menu:

<img src="https://www.dropbox.com/s/fkegrn16hs01h7o/Panels%20menu.png?raw=1"/>

Panels also open if you try to inline-edit a cell with a complex data type.

To close panels, click the **Panels** button again or click the standard Close (cross) icon in the upper right corner of each panel.

## Value Viewer

The Value viewer panel displays just one value that is currently in focus and allows editing it.
 
<img src="https://www.dropbox.com/s/3w3f5zhngmc4pqw/Value%20viewer%20panel.png?raw=1"/>

The **Apply** (<img src="https://www.dropbox.com/s/0fzio9bh4rwcxu9/Apply%20button.png?raw=1"/>) and **Auto-apply value** (<img src="https://www.dropbox.com/s/cqooq6d6yhywd8z/Auto-save%20value%20button.png?raw=1"/>) buttons in the toolbar of the panel only affect the display of the changes made in the Value viewer back in the Data table but do not save them in the database. To save the changes in the database, you need to use the **Save** button in the bottom toolbar of the Data Editor.

The **Auto-save value** button enables automatic display of changes made in the Value viewer in the data table. When auto-saving is enabled, the changes appear in the data table at the same time when they are made in the Value viewer.

## Metadata Panel
The Metadata panel displays metadata for each cell in the row containing the cell currently in focus. You can just view the metadata.

<img src="https://www.dropbox.com/s/v4ng1dbwjhd1fla/Panels.png?raw=1"/>

## Aggregate Panel

The Aggregate panel is useful for getting basic statistics across data in several columns and rows:

<img src="https://www.dropbox.com/s/riedr4jrpquxw1j/Aggregate%20panel.png?raw=1"/>

You can select several columns and rows in standard ways - by pressing and holding the left mouse button or by clicking cells while holding the <kbd>Ctrl</kbd> or <kbd>Shift</kbd> keys. The panel updates dynamically to shows statistics for the selected data.

To see data grouped by columns, click the Group by columns button (<img src="https://www.dropbox.com/s/ni41161hr00mwok/Group%20by%20columns%20button.png?raw=1"/>). To remove the grouping by columns and see summary values for all columns, click the same button again.

By default, the panel applies and displays results for two functions – **Count** and **Count Distinct**. To add other functions, click the **Add function** (<img src="https://www.dropbox.com/s/8w4oqr674np45wy/Add%20function%20button.png?raw=1"/>) button in the toolbar of the panel or right-click one of the rows in the Aggregate panel and click **Add function** on the context menu and then click the name of the function. The following functions are available:
* Sum
* Average
* Minimum
* Maximum
* Median
* Mode

To remove an individual function, click the function and then click **Remove function** (<img src="https://www.dropbox.com/s/lih3rda6cs1qrhw/Remove%20function%20button.png?raw=1"/>) in the toolbar of the panel, or right-click the function and click **Remove function** on the context menu. To remove all functions, click **Reset** (<img src="https://www.dropbox.com/s/t325eq1s9wbv3y8/Reset%20button1.png?raw=1"/>) in the toolbar or on the context menu.
