Sometimes (especially after multiple DBeaver version upgrade) workspace become messy. 
Some keyboard shortcuts may stop working, toolbars layout may be broken, etc, etc.
To reset all UI settings (this includes menus, shortcuts, view and toolbar layouts):
- Shutdown DBeaver
- Go to directory to `%HOMEPATH%\.dbeaver\.metadata\.plugins\org.eclipse.e4.workbench\`
  - Windows: `Win+R`, enter `%HOMEPATH%\.dbeaver\.metadata\.plugins\org.eclipse.e4.workbench\`
  - Linux: `cd $HOME/.dbeaver/.metadata/.plugins/org.eclipse.e4.workbench/`
- Delete file `workbench.xmi`
- Start DBeaver

That's it.