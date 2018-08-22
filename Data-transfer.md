You can perform data export/import or migration for database table(s).
We'll describe most typical use cases.

## Exporting table data to CSV format

1. Select a table(s) you want to export. In the context menu choose "Export Data":
<img src="images/dt/dt-export_menu.png" width="400"/>

2. Choose export format. DBeaver support many different output formats including CSV, HTML, XLSX, etc:
<img src="images/dt/dt-export-format.png" width="400"/>

3. Set data extraction options (how data will be read from tables). This may affect extraction performance:
<img src="images/dt/dt-options-extract.png" width="400"/>

4. Set export format option. They are specific to the data format you chose on step 2:
<img src="images/dt/dt-options-format.png" width="400"/>

5. Set options for output files or clipboard:
<img src="images/dt/dt-options-output.png" width="400"/>

6. Review what and to what format you will export:
<img src="images/dt/dt-export-final.png" width="400"/>

7. Press finish. See extraction progress. Actual data extraction will be performed in background, you can keep working with your database during export process.
Note: avoid changing data in tables you selected for export while export is running.
In the end you will see status message:
<img src="images/dt/dt_message-success.png" width="200"/>

