
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
