package org.jkiss.dbeaver.uitests.tests.connection;

import org.jkiss.dbeaver.uitests.tests.BaseTestCase;
import org.junit.Test;



public class ConnectionDialogTest extends BaseTestCase {

    @Test
    public void connectionDialogHasAllDB(){
        dBeaver.mainWindow.openConnectionDialog();
    }
}
