## Database Structure View

You can view a database structure in the standard ERD (Entity Relation Diagram) form. ER diagrams are available for all tables and schemas (databases).  

ER diagram for a table shows the table itself and its relations with other tables inside the schema. To view the ER diagram for a table or view, double-click the table or view in the [Database Navigator](https://github.com/serge-rider/dbeaver/wiki/Database-Navigator) and then, in the [Database Object Editor](https://github.com/serge-rider/dbeaver/wiki/Database-Object-Editor), switch to the **ER Diagram** tab:

<img src="https://www.dropbox.com/s/1na71z07tabmhos/ER%20diagram.png?raw=1"/>

To view the ER diagram for a full database schema, double-click the schema name or the **Tables** node:

<img src="https://www.dropbox.com/s/ndtttbnha3kf5eb/ER%20schema.png?raw=1"/>

NOTE: Table and schema diagrams are read-only. You can rearrange the layout, drag-n-drop elements inside a diagram but you canot save the changes state or delete/add anything. This is because the diagrams represent the actual state of databases.

## Custom ER Diagrams

You can create custom ER diagrams that can contain any tables, relations and notes.  
However even custom diagrams may contain only real existing database entities (tables).  
[[images/erd-custom-colors.png]]
To create custom diagram you can:
1. Main menu `File -> New -> DBeaver -> ER Diagram`. Then you need to set diagram name and (optionally) choose initial diagram contents (set of tables).
2. Right click on `ER Diagrams` node in project explorer view `-> Create New Diagram`

After diagram is created you can drag-n-drop any number of tables into it. You can add tables from different connections and even different database type (e.g. combine Oracle and MySQL tables in single diagram).

Also you can add notes and custom relations (associations) using ERD palette (on the left side of diagram pane).

Undo/redo functions are fully supported during diagram editing.

### Diagram controls
Any diagram view can be adjusted by following actions (from diagram toolbar and/or context menu):
- Automatic tables rearrange
- Enable/disable diagram grid
- Print diagram (<kbd>CTRL+P</kdb>)
- Modify attributes visibility and presentation
- Entities/notes coloring
- Bring element to front/send to back
- Zoom

Also custom diagram support:
- Notes creation
- Custom associations creation
- Adding/removing tables to/from diagram

### Diagram export
You can export (save) diagram as image (PNG, GIF, BMP formats) or as file in GraphML format.
