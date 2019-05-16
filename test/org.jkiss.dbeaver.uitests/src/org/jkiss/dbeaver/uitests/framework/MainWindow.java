package org.jkiss.dbeaver.uitests.framework;

import org.eclipse.swtbot.swt.finder.waits.Conditions;

import static org.jkiss.dbeaver.uitests.framework.Constants.CONNECT_TO_DATABASE;
import static org.jkiss.dbeaver.uitests.framework.Constants.NEW_DATABASE_CONNECTION;
import static org.jkiss.dbeaver.uitests.framework.DBeaver.bot;

public class MainWindow{

    public void openConnectionDialog(){
        bot.toolbarButton(NEW_DATABASE_CONNECTION);
        bot.waitUntil(Conditions.shellIsActive(CONNECT_TO_DATABASE));
    }
}
