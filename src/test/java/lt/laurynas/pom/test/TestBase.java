package lt.laurynas.pom.test;

import lt.laurynas.pom.pages.Common;
import lt.laurynas.pom.utilities.TestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
public abstract class TestBase {

    @BeforeMethod
    public abstract void setUp();

    @AfterMethod
    public void tearDown(){
        Common.quitDriver();
    }
}
