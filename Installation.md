The installation process depends on the distribution type and your Operational System - see [https://dbeaver.jkiss.org/download/](https://dbeaver.jkiss.org/download/)

### ZIP Archive
When installing DBeaver manually, without using an installer:
1. Install <a href="http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html">Java 1.8+</a> as a separate step.
3. Extract the contents of the archive.  
NOTE: Do not unzip the archive over a previous DBeaver version. 
If you already have any version of DBeaver extracted in the same location - remove it before unzipping the new version.  
NOTE: All configurations, scripts and other necessary data are stored in a separate location (usually in the user`s home directory) so the program deinstallation will not affect them.

4. Run the **dbeaver** executable.

### Windows / MacOS Installer
The installer distribution is the recommended way to install DBeaver on Windows and MacOS X. It is the most lightweight due to an advanced archiving technology that is uses and that is not available in the case of the ZIP archive. Besides this, the installer automatically upgrades DBeaver to the new version, if a previous version is already installed.
To install DBeaver, run the installer executable and follow the instructions in its screens.

NOTE:
* The installer does not change any system settings or the Java installation. 
* The Included JRE will be accessible only for DBeaver.  

### Debian Package
To install DBeaver using a Debian package:
1. Run `sudo dpkg -i dbeaver-<version>.deb`.  
2. Execute `dbeaver &`.  

### RPM Package
To install DBeaver using an RPM package:
1. Run `sudo rpm -ivh dbeaver-<version>.rpm`.  
2. Execute `dbeaver &`.  

NOTE: To upgrade DBeaver to the next version, use `sudo rpm -Uvh dbeaver-<version>.rpm` parameter.

### MacOS
To install DBeaver on MacOS, just drag-and-drop the dmg archive to your disk.  
NOTE: DBeaver requires Java 1.8 to be installed, so you need to install [JDK 1.8+](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) prior to installing DBeaver.

You can also use [brew](http://macappstore.org/dbeaver-community/): 
```sh
brew install Caskroom/cask/java
```