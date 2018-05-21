You can create custom ER diagrams that can contain any tables, relations and notes.  
However, even custom diagrams may contain only real existing database entities (tables). 

[[images/erd-custom-colors.png]]

You can create a custom diagram in one of the ways:
1. On the DBeaver main menu, click **File -> New**. Then in the new diagram wizard, click **DBeaver -> ER Diagram**:

   <img src="https://www.dropbox.com/s/s0yj0smmk55a06u/New%20diagram%20wizard.png?raw=1"/>  
   
   Then specify the diagram name and (optionally) choose initial diagram contents (set of tables).

2. In the [Project Explorer](https://github.com/dbeaver/dbeaver/wiki/Project-Explorer) view, right-click the **ER Diagrams** node and then click **Create New ER Diagram** on the context menu. Then in the new diagram wizard, specify the diagram name and (optionally) choose initial diagram contents (set of tables).

The new diagram appears in a separate window or tab. Now you can drag-n-drop any number of tables into it. You can add tables from different connections and even different database type (for example, combine Oracle and MySQL tables in one and the same diagram).

Also you can add notes and custom relations (associations) using the ERD palette on the left side of diagram tab, see details in [ER Diagrams](https://github.com/dbeaver/dbeaver/wiki/ER-Diagrams) article.

Undo/redo functions are fully supported during diagram editing.