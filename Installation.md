Installation process depends on distribution type and OS.

### ZIP archive
Extract archive and run “dbeaver” executable.  
Do not extract archive over the previous version. If you have previous version just remove it before install. All configurations, scripts, etc are stored in a separate place (usually in user home) so you won't loose anything.  
Java 1.7+ must be installed separately.

### Windows installer
Run installer executable. It will automatically upgrade version (if needed).  
Installer doesn’t change any system settings or Java installation.  
Included JRE will be accessible only for DBeaver.  
Windows installer distribution is the recommended way to install DBeaver. Besides other benefits it is the smallest (don't be surprised - this is because of advanced archiving technology which is not available in case of plain zip archive).

### Debian package
Run `sudo dpkg -i dbeaver-<version>.deb`.  
Then execute `dbeaver &`.  

### RPM package
Run `sudo rpm -ivh dbeaver-<version>.rpm`.  
Then execute `dbeaver &`.  
Note: to upgrade use `sudo rpm -Uvh dbeaver-<version>.rpm` parameter.

### MacOS
Just drag-and-drop dmg archive to your disk.  
Note: Recent MacOS versions may reject to install unsigned software.  DBeaver don’t have a signed certificate so you may need [this workaround](http://www.tech-recipes.com/rx/45404/mac-downloaded-app-is-damaged-and-cant-be-opened-error-solved/) to install.