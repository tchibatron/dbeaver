[Eclipse Help](http://help.eclipse.org/juno/index.jsp?topic=%2Forg.eclipse.jdt.doc.user%2Fconcepts%2Fconcept-editor-templates.htm)

Templates can be activated by pressing `TAB` key.  
To see available templates press `CTRL+SHIFT+TAB`.  
To edit/add/remove tamplates got to preferences `General->Editor->SQL Editor->Templates`.  
[Standard Eclipse templates](http://help.eclipse.org/juno/topic/org.eclipse.jdt.doc.user/concepts/concept-template-variables.htm?cp=1_2_6_0)  
- ${cursor}
${year}
${date}
${time}
${dollar}
${user}
${word_selection}
${line_selection}

DBeaver-specific templates:  :
- ${schema} - schema name
- ${catalog} - catalog name
- ${table} - table name (from active catalog/schema)
- ${column} - column name (from current table)