DBeaver is an [Eclipse RCP](https://wiki.eclipse.org/Rich_Client_Platform) application.  
It consists from a set of Eclipse plugins, features and products.

##### Sources structure:
- `docs` - some documentations (mostly outdated)
- `features` - feature descriptors. Doesn't contains any source code. Used to structurize product plugins/dependencies.
- `modules` - very base plugins (like utils)
- `plugins` - main sources location
  - `org.jkiss.dbeaver.model` - model API and base classes. Doesn't contain any UI dependencies, just pure data model.
  - `org.jkiss.dbeaver.core` - main DBeaver module. Most of base UI classes are here.
  - `org.jkiss.dbeaver.core.application` - relatively small module which configures standalone DBeaver application.
  - `org.jkiss.dbeaver.core.eclipse` - main Eclipse plugin. Adds some extra menus/views to standard Eclipse IDE.
  - `org.jkiss.dbeaver.ext.*` - DBeaver extensions
- `product` - final products (standalone and Eclipse plugin) configuration.

##### Opening workspace in Eclipse

You will need to setup "Eclipse for RCP and RAP developers". Currently default Eclipse version is Mars (4.5). Build may fail on newer or older versions.  
Then you will need to install a few additional Eclipse plugins which DBeaver depends on (and which are not included in the standard Eclipse distribution):
- Open main menu Help -> Install New Software
- Copy `http://dbeaver.jkiss.org/eclipse-repo/` into "Work with" field and press enter
[[images/eclipse-deps-install.png]]
- Check all plugins and finish the installation process

Now you need to checkout DBeaver repository with `git clone https://github.com/serge-rider/dbeaver.git` command.  
In Eclipse create a new workspace and run Import wizard. Choose "General->Existing projects into Workspace".  
Select DBeaver checkout directory as root a directory. Check all plugins and features Eclipse will find and finish the wizard.  

Now you can build DBeaver (`Ctrl+B`).
To run the standalone version find file `DBeaver.product` (it is located in `product/standalone` directory). Open it and click on "Launch an Eclipse application" or "Launch an Eclipse application in Debug mode".
That's it.

##### Notes:
Everything above covers Community Edition version.  
EE version has extra sources which are not (yet?) open source.