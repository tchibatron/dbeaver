In results viewer you can view and edit data. Results are produced by some custom SQL query in SQL editor. Or you can open Data tab in table editor to see table contents.

**Record mode**

To toggle record/grid mode press `TAB` key. In record model columns becomes rows and you see just on record. Convenient if your table has big number of columns.

**Data presentations**

To switch between different presentation use combo box in status bar or press `CTRL+TAB`.
- Grid: standard presentation. Looks like a spreadsheet.
- Plain-text: similar to Grid but all values are presented as plain-text (like in console applications).
- JSON: represents documents in JSON format (available in EE version for document-oriented tables).
- XML: represents documents in XML format (available in EE version for document-oriented tables). 

**Value view panel**

If you work with complex types (structures, arrays) or long text data or BLOBs then it is convenient to toggle single cell value viewer/editor by pressing `F7`. This panel will also open if you will try to open inline editor for complex data type.

**Value inline edit**

To edit single cell value select it and press Enter or double-click on it.  
To open dialog with value editor press `SHIFT+Enter`. For LOB types special data editor will be opened instead of dialog.

**Scrolling**

If resultset has many rows then you can scroll it. 
By default DBeaver limits number of fetched rows by 200 (you can change this value in main toolbar or in preferences). Once you scroll to the last row of results DBeaver will fetch next segment (next 200 rows). 
You can disable this behaviour in preferences. Also you can manually fetch next segment or fetch whole resultset (be careful, in case of huge resultset it may lead to program hanging or out-of-memory errors).
You can navigate thru resultset using standard shortcuts `HOME`, `END`, `PgUp`, `PgDown`, `CTRL+HOME`, `CTRL+END`.

**BLOB/CLOB support**

DBeaver has full support of CLOB/BLOB data types. You view values, edit them and save back to database. You can open CLOB/BLOB value in a separate editor (`SHIFT+ENTER` on selected cell value). You can save/load LOB value to/from regular files.

**Images**

DBeaver can recognize that some BLOB column keeps images (gif, png, jpeg, bmp). In that case DBeaver will show LOB contents as image. It is convenient to open value view panel (`F7`) and browse images.

**Virtual keys**

To be able to persist column value change table must have some unique key (primary key or unique index). Some databases (Oracle, DB2, PsotgreSQL) supports special virtual unique column which DBeaver can use to save changes. In other cases you can define a virtual key – a set of columns which forms unique combination of values. DBeaver asks user about virtual key definition when you try to save changes in a table without unique key.

**Foreign Key Navigation**

**Rows coloring**

**Data filtering**

You can apply custom filters to any table contents or query results. Type filter criteria in the input field above results panel. Criteria could be any SQL expression operating with any number of columns/values. Also you can apply per-field filters in filter settings dialog. Or you can make filter from cell value – choose Order/Filter in the context menu and then some field criteria.

**Data ordering**

You can order results by some column(s) – just click on the arrows icon after column name. By default DBeaver uses server-side ordering (i.e. query will be re-executed on server) but you can reconfigure it and make only client-side orderings.

**Data search**

`CTRL+F` shows standard search dialog. It will search only in already fetched rows. Also you can use find/replace feature.

**Copy/paste**

`CTRL+C` on selected cells will copy these cells into clipboard in TAB-delimited format. Then you can paste this selection in some spreadsheet editor (like Excel). `CTRL+SHIFT+C` shows “Advanced Copy” dialog where you can configure additional copy settings (copy with column names/row numbers, configure delimiter and choose values format). Pressing `CTRL+V` on a cell will set cell value (with appropriate data type conversion).

**Data export**

In the context menu you can choose “Export ResultSet” – it will show standard data transfer wizard (see below). Data will be exported with all applied filters and orderings.

**SQL generation**

You can generate SQL statements (SELECT/INSERT/DELETE) based on selected rows. This feature available from results panel context menu. Generated SQL will be inserted in the active SQL editor and in the clipboard. 