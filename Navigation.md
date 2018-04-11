## Scrolling Results Page

If the result set has many rows, you can scroll the results page. To learn how many rows the data table contains, click the **Calculate total row count** button in the bottom toolbar. The number of rows appears in a status field next to the button: [[images/ug/Calculate-rows-button.png]]

By default, DBeaver limits the number of rows fetched to **200** (you can change this value in the main toolbar or in preferences). The maximum number of rows that DBeaver fetches to display in the Data tab is specified in the Maximum result-set size field in the main toolbar: [[images/ug/Max-result-set.png]]

Once you scroll to the last row of the current result portion, DBeaver fetches the next portion (next N rows). You can disable this behavior in preferences. 
You can also manually fetch the next portion of data equal to the maximum result set size. To do so, click the **Fetch next page of results** button ([[images/ug/Fetch-next-page-button.png]]) in the bottom toolbar or right-click the table and click **Navigate -> Fetch next page** on the context menu.

The number of rows fetched is visible in the status field under the data table: [[images/ug/Number-fetched-rows.png]]

To see the details, click the details button in the status field.

To fetch the whole result set, click the **Fetch all rows** button ([[images/ug/Fetch-all-rows-button.png]]) in the bottom toolbar or right-click the table and click **Navigate -> Fetch All Data** on the context menu.

NOTE: Be careful when fetching the whole result set. If it is huge, it might cause program hangup or out-of-memory errors.

You can navigate through the result set using standard shortcuts <kbd>Home</kbd>, <kbd>End</kbd>, <kbd>PgUp</kbd>, <kbd>PgDown</kbd>, <kbd>Ctrl+Home</kbd>, <kbd>Ctrl+End</kbd>.

## Data Rows
To jump to the first or last row or move one row forward or backward, use the navigation buttons in the bottom toolbar or on the context menu: [[images/ug/Navigation-buttons.png]] 

[[images/ug/Navigate-date-thru-context-menu.png]]

To jump to a specific line, right-click anywhere in the table and click **Navigate** -> **Go to Line** on the context menu. Then in the Go to Row dialog box, enter the row number and click **OK**.

## History
DBeaver remembers the history of such actions as applying filters to data, opening reference tables or other tables via links. You can navigate among such tables and filtered views using the forward and backward buttons in the top toolbar: <img src="https://www.dropbox.com/s/ch97i2oy3uytkz7/Backward%20button.png?raw=1"/> <img src="https://www.dropbox.com/s/1t87l4wthqoopnv/Forward%20button.png?raw=1"/>    

