Sometimes (especially after multiple DBeaver versions upgrade) workspace become messy.  
Some keyboard shortcuts may stop working, toolbars layout may be broken, etc, etc.  
To reset all UI settings (this includes menus, shortcuts, view and toolbar layouts):

1. Shutdown DBeaver
2. Go to directory to `%HOMEPATH%\.dbeaver\.metadata\.plugins\org.eclipse.e4.workbench\`
  - Windows: `Win+R`, enter `%HOMEPATH%\.dbeaver\.metadata\.plugins\org.eclipse.e4.workbench\`
  - Linux: `cd $HOME/.dbeaver/.metadata/.plugins/org.eclipse.e4.workbench/`
3. Delete file `workbench.xmi`
4. Start DBeaver

That's it.