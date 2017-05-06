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
-con|Opens database connection in DBeaver UI. See [connection parameters table](#connection-parameters)|`-con driver=sqlite\|database=C:\db\SQLite\Chinook.db\|name=SQLiteChin\|openConsole=true\|folder=SQLite`

## System parameters

Name|Value|Example
----|-----|-------
-nl|Locale|en_US
-data|Workspace path|c:\ProgramData\MyWorkspace
-nosplash|Omits splash screen|true
-vmargs|VM parameters|

### VM arguments

### Connection parameters
Name|Value|Example
----|-----|-------
name|Connection name|`Test connection`
driver|Driver name or ID|`sqlite`, `mysql`, etc
