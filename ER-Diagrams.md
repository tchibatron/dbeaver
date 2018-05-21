ER diagrams appear on the rightmost tab of the [Database Object Editor](https://github.com/dbeaver/dbeaver/wiki/Database-Object-Editor):

[[images/ug/ER-Diagrams-Editor.png]]

Entity Relation Diagrams (ERD) are graphic presentations of database entities and relations between them. DBeaver allows viewing diagrams of existing tables and whole database schemas, see [Database Structure Diagrams](https://github.com/dbeaver/dbeaver/wiki/Database-Structure-Diagrams), as well as create custom diagrams, see
[Custom Diagrams](https://github.com/dbeaver/dbeaver/wiki/Custom-Diagrams).

Both types of diagrams provide the same tools to adjust their view and structure. They can be printed and exported to image file formats.

## Structure Adjustment
NOTE: All changes to existing database schemas cannot be saved and are intended for exploration purposes only.  
You can do the following structure changes in diagrams.
*  Add new tables to a diagram by drag-n-dropping them onto the diagram field from the [Database Navigator](https://github.com/dbeaver/dbeaver/wiki/Database-Navigator).
*  Rearrange tables in the diagram by dragging them all over the space. You can select several tables and drag them to a new location.
*  Auto-arrange tables into a compact view after manual rearrangements: click the **Arrange Diagram** (<img src="https://www.dropbox.com/s/hh1xnkn22ow0tzf/Arrange%20diagram.png?raw=1"/>) in the toolbar or on the context menu (right-click anywhere on the diagram tab).
*  (Available for [Custom Diagrams](https://github.com/dbeaver/dbeaver/wiki/Custom-Diagrams) only) - connect tables with a connector: click the **Show Palette** button (<img src="https://www.dropbox.com/s/xsypnsxths50o8v/Show%20Palette%20button.png?raw=1"/>) in the upper-left corner of the diagram tab and then, in the Palette panel, click **Connection**. Now click the tables that you want to connect with each other in turn one by one, and then to stop the connection line double-clicking the last table.
*  (Available for [Custom Diagrams](https://github.com/dbeaver/dbeaver/wiki/Custom-Diagrams) only) - remove tables: right-click the table and click **Delete** on the context menu.

## View Adjustment
You can adjust the view of any diagram in the following ways:
* Enable/disable the diagram grid: Click **Toggle Grid** (<img src="https://www.dropbox.com/s/x7cfn62z6fsu06p/Toggle%20Grid.png?raw=1"/>) in the toolbar.
* Modify attributes visibility: Right-click the diagram and, on the context menu, click **Show Attributes** and then one of the options:
  - **All** - all attributes  
  - **Any keys** - primary and foreign keys  
  - **Primary key** - only primary keys  
  - **None** - no attributes  
* Modify attributes presentation: Right-click the diagram and, on the context menu, click **Attribute Styles** and then one of the options:
  - **Show Icons**
  - **Show Data Types**
  - **Show Nullability**
  - **Show Comments**
* Change the color of entities/notes: Right-click the header of the entity or comment and then click **Set color** on the context menu. Then you can select the color and click **OK**. 
* For elements located in front of/behind others, bring an element to front or send to back: Right-click the element and then click **Bring to front** / **Send to back** on the context menu.
* Zoom the diagram in/out: Click the **Zoom In**/**Zoom Out** buttons or choose the scaling value in the dropdown list in the toolbar: <img src="https://www.dropbox.com/s/3lh6zyt1gpdv79k/Zoom%20in%20diagram.png?raw=1"/>

## Refresh
To see changes made to the database schema by other users, you might need to refresh the diagram: click **Refresh Diagram** (<img src="https://www.dropbox.com/s/t47ic11b7fxt36d/Refresh%20projects%20icon.png?raw=1"/>) in the toolbar.

## Notes Creation
You can create notes only in [Custom Diagrams](https://github.com/dbeaver/dbeaver/wiki/Custom-Diagrams). To create a note, click the **Show Palette** button (<img src="https://www.dropbox.com/s/xsypnsxths50o8v/Show%20Palette%20button.png?raw=1"/>) in the upper-left corner of the diagram tab, then, in the Palette panel, click **Note** and then click anywhere in the diagram tab. Now you can double-click **Note** box to enter the note text.

## Search in Diagram Entities
To search among entities of a diagram, click the **Search items** button (<img src="https://www.dropbox.com/s/ymgrvdc9rizdxmo/search%20icon.png?raw=1"/>) in the toolbar, then type in the search combination. The entities that contain the search combination are highlighted in the diagram.  
To remove the filter, click the cross icon next to the search field.


## Diagram Export
You can export (save) a diagram as an image (PNG, GIF, BMP formats) or as a file in GraphML format. To export a diagram, click **Save diagram in external format** (<img src="https://www.dropbox.com/s/9haqosyhzuqfhqn/Export%20diagram.png?raw=1"/>) in the toolbar.

## Diagram Printing
To print a diagram, press <kbd>CTRL+P</kbd> or click **Print Diagram** (<img src="https://www.dropbox.com/s/gaxdk0q5lkqy6wa/Print%20diagram.png?raw=1"/>) in the toolbar.

## Settings
To modify the diagram settings, click **Configuration** (<img src="https://www.dropbox.com/s/h01225sper0kfjw/Configure%20columns%20icon.png?raw=1"/>) in the toolbar.