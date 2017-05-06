# Command line parameters

Command line parameters might be passed directly to dbeaver[.exe] executable.  
On Windows you also can use `dbeaver-cli.exe` executable (it doesn't spawn new window so you can see output messages).  

## DBeaver control
Name|Value|Example
----|-----|-------
-help|Prints help message|
-stop|Quits DBeaver|
-dump|Prints DBeaver thread dump|
-f|Opens file in DBeaver UI|`-f c:\some-path\some-file.sql`
-con|Opens database connection in DBeaver UI|See [connection parameters table](#connection-parameters)

## System parameters

Name|Value|Example
----|-----|-------
-nl|Locale|en_US
-data|Workspace path|c:\ProgramData\MyWorkspace
-nosplash|Omits splash screen|true
-vmargs|VM parameters|See [VM arguments table](#vm-arguments)

### VM arguments

### Connection parameters
All connection parameters must be supplied as a single command line argument, parameters are divided by pipe (`|`). Parameter name and value are divided by `=`.
Example: `-con driver=sqlite|database=C:\db\SQLite\Chinook.db|name=SQLiteChin|openConsole=true|folder=SQLite`

Name|Value|Example
----|-----|-------
name|Connection name|`Test connection`
driver|Driver name or ID|`driver=sqlite`, `driver=mysql`, etc
url|Connection URL. Optional (JDBC URL may be constructed by driver from other parameters)|`url=jdbc:sqlite:C:\db\SQLite\Chinook.db`
host|Database host name (optional)|`host=localhost`
port|Database port number (optional)|`port=1534`
server|Database server name (optional)|`server=myserver`
database|Database name or path (optional)|`database=db-name`
user|User name (optional)|`user=root`
password|User password (optional)|`password=mysecret`
savePassword|Do not ask use password on connect|`savePassword=true`
connect|Connect to this database|`connect=false`
openConsole|Open SQL console for this database (sets `connect` to true)|`openConsole=true`
folder|Put new connection in a folder|`folder=FolderName`
prop.propName|Advanced connection parameters (depend on driver)|`prop.connectTimeout=30`