import Mails.Gmail.Steps.GmailLoginSteps;
import WebDriverFactory.WebDriverFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GmailTest {
    GmailLoginSteps gmailLoginSteps;

    WebDriverFactory driverFactory;

    String browser;

    @BeforeMethod
    public void setUp() throws Exception {
        browser = "chrome";

        driverFactory = new WebDriverFactory();

        gmailLoginSteps = new GmailLoginSteps(driverFactory.getDriver(browser));

    }

    @Test(enabled = true)
    public void testGmail() throws Exception {

        gmailLoginSteps
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
