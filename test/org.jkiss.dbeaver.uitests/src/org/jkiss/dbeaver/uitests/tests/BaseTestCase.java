package org.jkiss.dbeaver.uitests.tests;

import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.jkiss.dbeaver.uitests.framework.DBeaver;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(SWTBotJunit4ClassRunner.class)
public abstract class BaseTestCase {

    public static DBeaver dBeaver;

    @BeforeClass
    public static void  init(){
        dBeaver = new DBeaver();
    }

}
