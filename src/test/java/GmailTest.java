import Mails.Gmail.Steps.GmailLoginSteps;
import WebDriverFactory.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GmailTest {

    private GmailLoginSteps gmailLoginSteps;

    private WebDriver driver;

    @BeforeMethod
    public void setUp() throws Exception {

        String browser = "ie";

        WebDriverFactory driverFactory = new WebDriverFactory();

        driver = driverFactory.getDriver(browser);

        gmailLoginSteps = new GmailLoginSteps(driver);

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
        driver.quit();
    }
}
