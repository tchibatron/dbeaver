### Configure drivers with pre-installed jars

You can customize drivers configuration in `${HOME}/.dbeaver4/.metadata/.plugins/org.jkiss.dbeaver.core/drivers.xml` file.
If you have some pre-installed jar files you can reference them in drivers.xml. 
Example:
```xml
<library type="jar" path="absolute-jar-folder-path\driver-jar.jar" custom="true"/>
```
Also in drivers.xml you can use following variables to specify relative paths:

| Variable | Meaning |
-----------|-------------|
|drivers_home|Standard DBeaver drivers location (`${HOME}/.dbeaver-drivers` by default)|
|dbeaver_home|DBeaver installation folder|
|home|User home folder|
|workspace|DBeaver workspace path (`${HOME}/.dbeaver4` by default)|

For instance: 
```xml
<library type="jar" path="${dbeaver_home}\drivers\my-driver.jar" custom="true"/>
```