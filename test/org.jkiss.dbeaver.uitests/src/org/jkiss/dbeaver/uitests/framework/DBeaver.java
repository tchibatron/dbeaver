package org.jkiss.dbeaver.uitests.framework;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;

public class DBeaver {
    public static SWTWorkbenchBot bot;
    public MainWindow mainWindow;


    public DBeaver() {
        bot = new SWTWorkbenchBot();
        this.mainWindow = new MainWindow();
    }


}
