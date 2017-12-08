
**Value view panel**

If you work with complex types (structures, arrays) or long text data or BLOBs then it is convenient to toggle single cell value viewer/editor by pressing `F7`. This panel will also open if you will try to open inline editor for complex data type.

**Value inline edit**

To edit single cell value select it and press Enter or double-click on it.  
To open dialog with value editor press `SHIFT+Enter`. For LOB types special data editor will be opened instead of dialog.

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
Filters context menu can be activated with shortcut `CTRL+F11`.


**Data search**

`CTRL+F` shows standard search dialog. It will search only in already fetched rows. Also you can use find/replace feature.

**Copy/paste**

`CTRL+C` on selected cells will copy these cells into clipboard in TAB-delimited format. Then you can paste this selection in some spreadsheet editor (like Excel). `CTRL+SHIFT+C` shows “Advanced Copy” dialog where you can configure additional copy settings (copy with column names/row numbers, configure delimiter and choose values format). Pressing `CTRL+V` on a cell will set cell value (with appropriate data type conversion).


**SQL generation**

You can generate SQL statements (SELECT/INSERT/DELETE) based on selected rows. This feature available from results panel context menu. Generated SQL will be inserted in the active SQL editor and in the clipboard. 