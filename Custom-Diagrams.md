You can create custom ER diagrams that can contain any tables, relations and notes.  
However, even custom diagrams may contain only real existing database entities (tables). 

[[images/erd-custom-colors.png]]

You can create a custom diagram in one of the ways:
1. On the DBeaver main menu, click **File -> New**. In the new diagram wizard, click **DBeaver -> ER Diagram**:

   <img src="https://www.dropbox.com/s/s0yj0smmk55a06u/New%20diagram%20wizard.png?raw=1"/>  
   
   Then specify the diagram name and (optionally) choose initial diagram contents (set of tables).

2. Right click on `ER Diagrams` node in project explorer view `-> Create New Diagram`

   
  
After diagram is created you can drag-n-drop any number of tables into it. You can add tables from different connections and even different database type (e.g. combine Oracle and MySQL tables in single diagram).

Also you can add notes and custom relations (associations) using ERD palette (on the left side of diagram pane).

Undo/redo functions are fully supported during diagram editing.