Entity Relation Diagrams (ERD) are graphic presentations of database entities and relations between them. DBeaver allows viewing diagrams of existing tables and whole database schemas, see [Database Structure Diagrams](https://github.com/serge-rider/dbeaver/wiki/Database-Structure-Diagrams), as well as create custom diagrams, see 
[Custom Diagrams](https://github.com/serge-rider/dbeaver/wiki/Custom-Diagrams)

Both types of diagrams provide the same tools to adjust their view and structure. They can be printed and exported to image file formats.

## Structure Adjustment
You can do the following structure changes in diagrams:
*  Add new tables to a diagram by drag-n-dropping them onto the diagram field from the [Database Navigator](https://github.com/serge-rider/dbeaver/wiki/Database-Navigator).
*  Rearrange tables in the diagram by dragging them all over the space. You can select several tables and drag them to a new location.
*  Auto-arrange tables into a compact view after manual rearrangements: click the **Arrange Diagram** (<img src="https://www.dropbox.com/s/hh1xnkn22ow0tzf/Arrange%20diagram.png?raw=1"/>) in the toolbar or on the context menu (right-click anywhere on the diagram tab).
*  (Available for [Custom Diagrams](https://github.com/serge-rider/dbeaver/wiki/Custom-Diagrams) only) You can connect tables with a connector: click the **Show Palette** button (<img src="https://www.dropbox.com/s/xsypnsxths50o8v/Show%20Palette%20button.png?raw=1"/>) in the upper-left corner of the diagram tab and then, in the Palette panel, click **Connection**. Now click the tables that you want to connect with each other in turn one by one, and then to stop the connection line double-clicking the last table.

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
* Entities/notes coloring: Right-click the header of the entity or comment and then click **Set color** on the context menu. Then you can select the color and click **OK**. 
* For elements located in front of/behind others, bring an element to front or send to back: Right-click the element and then click **Bring to front** / **Send to back** on the context menu.
* Zoom

## Notes Creation

## Search in Diagram Entities

Also custom diagram support:
- Notes creation
- Custom associations creation
- Adding/removing tables to/from diagram

## Diagram Export
You can export (save) diagram as image (PNG, GIF, BMP formats) or as file in GraphML format.

## Diagram Printing
To print a diagram, press (<kbd>CTRL+P</kdb>) or click 