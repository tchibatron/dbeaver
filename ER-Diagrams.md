### Database structure view
You can view database structure in standard ERD (Entity Relation Diagram) form.  
ER diagrams are available for all tables and schemas (databases).  
Find a table in database navigator, double click on it and switch to `Diagram` tab:
[[images/erd-table.png]]
Double click on schema name or on `Tables` node to see full schema diagram:
[[images/erd-schema.png]]

<b>Note:</b> table and schema diagrams are read-only. You can rearrange layout, drag-n-drop elements inside diagram but you can't save it's state and/or delete/add anything. This is because diagram represents actual state of database.

### Custom ER diagrams
You can create custom ER diagrams which may contain any tables, relations and notes.  
However even custom diagrams may contain only real existing database entities (tables).  
[[images/erd-custom-colors.png]]
To create custom diagram you can:
1. Main menu `File -> New -> DBeaver -> ER Diagram`. Then you need to set diagram name and (optionally) choose initial diagram contents (set of tables).
2. Right click on `ER Diagrams` node in project explorer view `-> Create New Diagram`

After diagram is created you can drag-n-drop any number of tables into it. You can add tables from different connections and even different database type (e.g. combine Oracle and MySQL tables in single diagram).

Also you can add notes and custom relations (associations) using ERD palette (on the left side of diagram pane).

### Diagram controls

### Diagram export