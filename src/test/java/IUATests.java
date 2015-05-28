import Mails.IUA.Steps.IUALoginSteps;
import WebDriverFactory.WebDriverFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IUATests {

    IUALoginSteps iuaLoginSteps;

    WebDriverFactory driverFactory;

    String browser;

    @BeforeMethod
    public void setUp() throws Exception {

        browser = "firefox";

        driverFactory = new WebDriverFactory();

        iuaLoginSteps = new IUALoginSteps(driverFactory.getDriver(browser));

    }

    @Test(enabled = true)
    public void testIUA() throws Exception {

        iuaLoginSteps
                .loginAs()
                .composeMailAndSaveToDrafts()
                .openSameMailInDraftsAndSend()
                .logOut();

    }

    @AfterMethod
    public void tearDown() throws Exception {
        driverFactory.getDriver(browser).quit();
    }
}
