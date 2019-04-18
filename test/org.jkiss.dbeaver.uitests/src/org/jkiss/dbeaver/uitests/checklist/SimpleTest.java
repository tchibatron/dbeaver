package org.jkiss.dbeaver.uitests.checklist;


import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SWTBotJunit4ClassRunner.class)
public class SimpleTest {
    private static SWTWorkbenchBot bot;

    public SimpleTest() {
    }

    @BeforeClass
    public static void beforeClass() throws Exception {
        bot = new SWTWorkbenchBot();
    }

    @Test
    public void canCreateANewJavaProject() throws Exception {
        bot.menu("File").menu("New").click();
        Assert.assertTrue(false);
    }

    @AfterClass
    public static void sleep() {
        bot.sleep(2000L);
    }
}
