Templates can be activated by pressing `TAB` key.  
To see available templates press `CTRL+SHIFT+TAB`.  
To edit/add/remove tamplates got to preferences `General->Editor->SQL Editor->Templates`.  
Additional information can be found on the [Eclipse Website](http://help.eclipse.org/juno/index.jsp?topic=%2Forg.eclipse.jdt.doc.user%2Fconcepts%2Fconcept-editor-templates.htm)

#### [Standard Eclipse templates](http://help.eclipse.org/juno/topic/org.eclipse.jdt.doc.user/concepts/concept-template-variables.htm?cp=1_2_6_0):  

| Variable | Description |
-----------|-------------|
|${cursor} | Specifies the cursor position when the template edit mode is left. This is useful when the cursor should jump to another place than to the end of the template on leaving template edit mode. |
|${year} | Evaluates to the current year. |
|${date} | Evaluates to the current date. |
|${time} | Evaluates to the current time. |
|${dollar} | Evaluates to the dollar symbol $. Alternatively, two dollars can be used: $$. |
|${user} | Evaluates to the user name. |
|${word_selection} | Evaluates to the content of the current text selection. |
|${line_selection} | Evaluates to content of all currently selected lines.

#### DBeaver-specific templates:  

| Variable | Description |
-----------|-------------|
|${schema} | Evaluates to the current schema name |
|${catalog} | Evaluates to the catalog name |
|${table} | Evaluates to the current table name (from the active catalog/schema) |
|${column} | Evaluates to the column name (from the current table) |
