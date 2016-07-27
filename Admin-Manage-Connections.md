This guide describes how to manage/secure DBeaver database connections.
It is designed for System administrators. Regular users should check [[this|Connect-to-database]] guide.

### Provide predefined connections
DBeaver keep information about project connections in file `.dbeaver-data-sources.xml`. You can find it in project folder (by default all projects reside in workspace, default workspace location is `%HOMEPATH%\.dbeaver` (or ${HOME}/.dbeaver).  

DBeaver can load multiple connection files. Any files matching `.dbeaver-data-sources*.xml` pattern will be loaded on startup. So you can create a file, say, `.dbeaver-data-sources-2.xml` in the project and DBeaver will see it.

### Importing connections from CSV/XML
You can import connection from CSV or XML files.

CSV file must have a header row (first line of file) with column names (see list of supported columns below).
XML file should contain top-level element and a set of nested elements. Connections config must be specified in attributes of nested elements. Attribute names are the same as CSV column names.

#### Supported names:
| Name | Meaning |
-----------|-------------|
|name|Connection name|
|url|JDBC URL|
|host|Database server host name|
|port|Database server port|
|Database|Database name|
|user|User name|
|password|User password|

### Secure connections from editing
