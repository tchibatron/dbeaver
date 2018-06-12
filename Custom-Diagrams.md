You can create custom ER diagrams that can contain any tables, relations and notes.  
However, even custom diagrams may contain only real existing database entities (tables). 

[[images/erd-custom-colors.png]]

You can create a custom diagram in one of the ways:
1. On the DBeaver main menu, click **File -> New**. Then in the new diagram wizard, click **DBeaver -> ER Diagram**, and then **Next**:

[[images/ug/ERD-Wizard.png]]  
   
2. In the [Project Explorer](https://github.com/dbeaver/dbeaver/wiki/Project-Explorer) view, right-click the **ER Diagrams** node and then click **Create New ER Diagram** on the context menu.

[[images/ug/ERD-Create-from-Project-Explorer.png]]

In both cases, in the Diagram Create Wizard, specify the diagram name and (optionally) choose initial diagram contents (set of tables):

[[images/ug/ERD-Create-custom-diagram.png]]

The new diagram appears in a separate editor. Now you can drag-n-drop any number of tables onto it. You can add tables from different connections and even different database type (for example, combine Oracle and MySQL tables in one and the same diagram).

You can also add notes and custom relations (associations) using the ERD palette on the left side of diagram tab, see details in [ER Diagrams](https://github.com/dbeaver/dbeaver/wiki/ER-Diagrams) article.

Undo/redo functions are fully supported in diagram editing.