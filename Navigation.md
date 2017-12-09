## Scrolling Results Page

If the result set has many rows, you can scroll the results page. By default, DBeaver limits the number of rows fetched to **200** (you can change this value in the main toolbar or in preferences).

The maximum number of rows that DBeaver fetches to display in the Data tab is specified in the Maximum result-set size field in the main toolbar: <img src="https://www.dropbox.com/s/7mj76k38u2ezzo6/Max%20result%20set%20size.png?raw=1"/>

Once you scroll to the last row of the current result portion, DBeaver fetches the next portion (next 200 rows). You can disable this behavior in preferences. 
You can also manually fetch the next portion of data equal to the maximum results set size. To do it, you need to click the Fetch next page of results button (<img src="https://www.dropbox.com/s/xekiqzxqgbsesjl/Fetch%20next%20page%20icon.png?raw=1"/>) in the bottom toolbar or right-click the table and click **Navigate -> Fetch next page** on the context menu.

To fetch the whole result set, click the **Fetch all rows** button (<img src="https://www.dropbox.com/s/uzna6o2q036m1ss/Fetch%20all%20rows%20icon.png?raw=1"/>) in the bottom toolbar or right-click the table and click **Navigate -> Fetch All Data** on the context menu.

NOTE: Be careful when fetching the whole result set. If it is huge, it might cause program hangup or out-of-memory errors.

You can navigate through the result set using standard shortcuts <kbd>Home</kbd>, <kbd>End</kbd>, <kbd>PgUp</kbd>, <kbd>PgDown</kbd>, <kbd>Ctrl+Home</kbd>, <kbd>Ctrl+End</kbd>.
