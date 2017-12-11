You can do inline editing (see the **Inline Editing** section below) as well as open the content of a cell in a separate editor (see the **Cell Editor** section below). 

When you make any changes to the data and save them using steps described in this section, the changes apply to the database itself. Prior to saving the changes, you can preview the SQL script that the system sends to the database to apply the changes there. To see the SQL script, after making changes and before saving or discarding them, click **Script** on the bottom toolbar. The Preview Changes window opens, in which you can only view the SQL script and copy it, if necessary.

## Inline Editing

Inline editing is when you modify the content right in the cell. To edit a cell inline, in the table:
* Double-click the cell.
* Click the cell to set focus to it and press <kbd>Enter</kbd>.
* Right-click the cell and click **Inline edit** on the context menu.

The cell becomes editable, now you can change its value.

To set the cell value to NULL, right-click the cell and click **Set to NULL** on the context menu.

To save the changes, click the **Save** button (<img src="https://www.dropbox.com/s/j3diu0m22x9wuof/Save%20button%20in%20Data%20tab.png?raw=1"/>) in the bottom toolbar. To discard the changes, click the **Cancel** button (<img src="https://www.dropbox.com/s/w34nc4noeyhm1at/Cancel%20button%20in%20Data%20tab.png?raw=1"/>) in the bottom toolbar.

NOTE: Both the **Save** and **Cance**l buttons become editable only when you make changes in a cell and then jump to another cell.

## Cell Editor

To edit data in a cell using a separate editor:
* Right-click the cell and click **Edit cell** on the context menu.
* Click the cell to set focus to it and press <kbd>Shift+Enter</kbd> or click the **Edit cell value in separate dialog/editor** button (<img src="https://www.dropbox.com/s/8lxyg1ui5vknfef/Edit%20call%20value%20button.png?raw=1"/>) in the bottom toolbar.

For cells of CLOB/BLOB data format, this action opens the contents of the cell in a new tab.
For all other formats except CLOB/BLOB, this action opens a properties window for the cell:

<img src="https://www.dropbox.com/s/mbshj10ec86y9ch/Cell%20properties%20window.png?raw=1"/>
 
The window displays properties of the column in the **Column Info** section and provides the **Value** section where you can modify the value of the cell. Edit the value as required and click **Save**. To set the value to NULL, click **Set NULL**.

NOTE: DBeaver has full support of CLOB/BLOB data types. You can view values, edit them and save back to the database. You can open CLOB/BLOB value in a separate editor (press <kbd>Shift+Enter</kbd> on a selected cell). You can save/load LOB value to/from regular files. DBeaver can recognize that some BLOB column keeps images (gif, png, jpeg, bmp). In this case DBeaver shows LOB contents as image. It is convenient to open value view panel (press <kbd>F7</kbd>) and browse images.

## Adding, Copying and Deleting Rows

You can add an empty below the row in focus. To add an empty row, click the **Add new row** button (<img src="https://www.dropbox.com/s/kjnaoldqr29k7tn/Add%20new%20row%20button.png?raw=1"/>) in the bottom toolbar. Use inline editing or open cell values in a separate editor to populate them with data.

You can copy any row that is in focus. To copy a row, click the **Duplicate current row** button (<img src="https://www.dropbox.com/s/svqjl6uctcdx4in/Duplicate%20current%20row%20button.png?raw=1"/>) in the bottom toolbar. The duplicate row appears below the row in focus.

To delete a row, click the row to set focus to it and click the **Delete current row** button (<img src="https://www.dropbox.com/s/vfhsu6etpzleo73/Delete%20current%20row%20button.png?raw=1"/>) in the bottom toolbar.

To save any of such changes, click the **Save** button (<img src="https://www.dropbox.com/s/j3diu0m22x9wuof/Save%20button%20in%20Data%20tab.png?raw=1"/>) in the bottom toolbar. To discard the changes, click the **Cancel** button (<img src="https://www.dropbox.com/s/w34nc4noeyhm1at/Cancel%20button%20in%20Data%20tab.png?raw=1"/>) in the bottom toolbar.

## Copying/Pasting Cells

To copy the content of one or several cells to the clipboard in TAB-delimited format, press <kbd>Ctrl+C</kbd> or right-click the cell or cell selection and click **Copy** on the context menu.  Then you can paste the copied selection into some spreadsheet editor (like Excel).

DBeaver provides the advanced copy option that allows configuring additional copy settings (copy with column names/row numbers, configure delimiter and choose value format). To copy cells with additional settings, press <kbd>Ctrl+Shift+C</kbd> or right click the cell(s) and click **Advanced Copy** on the context menu.

Pressing <kbd>Ctrl+V</kbd> on a cell pastes the copied content into the cell applying appropriate data type conversion. The **Advanced Paste** option on the context menu or pressing <kbd>Ctrl+Shift+V</kbd> pastes several cells.

