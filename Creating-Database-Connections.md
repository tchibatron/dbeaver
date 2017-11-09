DBeaver provides a wizard that guides you through the steps to create a connection.
If you run DBeaver for the first time (standalone version), the new connection wizard appears automatically.
In other cases, to create a connection, click:
* Either the **New Connection** button in the application toolbar or in the Database Navigator view toolbar:

  [[images/connect-wizard-item.png]]

* Or **Database -> New Connection** in the menu bar:

  <img src="https://www.dropbox.com/s/g2g9hatjs1c8chx/new%20connection%20on%20menu.png?raw=1"/>

Then, in the new connection wizard:
1. Choose a driver for the new connection: click the suitable database type in the list. Then click **Next**.
   
   [[images/connect-wizard-driver.png]]  

To quickly find the needed driver, you can type a hint in the text field above the list of drivers.
If you cannot find a driver for your database then probably there is no suitable and you need to create one. Please see [[Create database driver|Create-database-driver]] article.

NOTE: The list of database drivers diaplays the number of exising connections next to each driver. No number is displayed if there are no connections.

2. In the Connection Settings screen, on the General tab, set all primary connection settings:

   [[images/connect-wizard-settings.png]]  

For most drivers required settings include:
- Host
- Port
- Database name 
- User name and password

However, the number and type of connection properties are very dependent on the driver.
Embedded drivers requires only the path to a database.

#### Finish
On the final page you may set connection name, type and initial settings (such as bootstrap queries, transaction state, global filters, etc).
[[images/connect-wizard-general.png]]  

#### Extra configuration
For advanced users.

##### Driver properties
Each driver has it's own set of additional properties. Refer to the driver documentation to get information about available properties and their values.  
[[images/connect-wizard-settings-driver.png]]  

##### Network settings (SSH, SOCKS, SSL)
If your database cannot be accessed directly you can use SSH tunnel.  
[[images/connect-wizard-ssh.png]]  
