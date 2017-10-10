The installation process depends on the distribution type and your Operational System - see [https://dbeaver.jkiss.org/download/](https://dbeaver.jkiss.org/download/)

### ZIP Archive
When installing DBeaver manually, without using an installer:
1. Install Java 1.8+ as a separate step.
2. If you already have any version of DBeaver installed, remove it before installing the new version. All configurations, scripts and other necessary data are stored in a separate location (usually in the user`s home directory) so the program deinstallation will not affect them.
3. Extract the contents of the archive.
NOTE: Do not unzip the archive over a previous DBeaver version.
4. Run the **dbeaver** executable.

### Windows installer
Run installer executable. It will automatically upgrade version (if needed).  
Installer doesn’t change any system settings or Java installation.  
Included JRE will be accessible only for DBeaver.  
Windows installer distribution is the recommended way to install DBeaver. Besides other benefits it is the smallest (because of advanced archiving technology which is not available in case of plain zip archive).

### Debian package
Run `sudo dpkg -i dbeaver-<version>.deb`.  
Then execute `dbeaver &`.  

### RPM package
Run `sudo rpm -ivh dbeaver-<version>.rpm`.  
Then execute `dbeaver &`.  
Note: to upgrade use `sudo rpm -Uvh dbeaver-<version>.rpm` parameter.

### MacOS
Just drag-and-drop dmg archive to your disk.  
Note: DBeaver requires Java 1.8 so you need to install [JDK 1.8+](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) before.

Also you can use [brew](http://macappstore.org/dbeaver-community/): 
```sh
brew install Caskroom/cask/java
```