import Mails.Gmail.Steps.GmailLoginSteps;
import Mails.IUA.Steps.IUALoginSteps;
import Mails.Yandex.Steps.YandexLoginSteps;
import WebDriverFactory.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class  TestScenarios {

    GmailLoginSteps gmailLoginSteps;

    IUALoginSteps iuaLoginSteps;

    YandexLoginSteps yandexLoginSteps;

    WebDriverFactory driverFactory;

    WebDriver driver;
    //@Parameters("browser")
    @BeforeMethod
    public void setUp() throws Exception {

        //driverFactory = new WebDriverFactory();

        driver = new FirefoxDriver();
        //gmailLoginSteps = new GmailLoginSteps(driverFactory.getDriver(browser));

        gmailLoginSteps = new GmailLoginSteps(driver);

        iuaLoginSteps = new IUALoginSteps(driver);

        yandexLoginSteps = new YandexLoginSteps(driver);
    }

    @Test(enabled = false)
    public void testGmail() throws Exception {

        gmailLoginSteps.loginAs()
                .composeMailAndSaveToDrafts()
                .openSameMailInDraftsAndSend()
                .logOut();
    }

    @Test(enabled = true)
    public void testYandex() throws Exception {

        yandexLoginSteps.loginAs()
                .composeMailAndSaveToDrafts()
                .openSameMailInDraftsAndSend()
                .logOut();
    }

    @Test(enabled = false)
    public void testIUA() throws Exception {
        iuaLoginSteps.loginAs()
                .composeMailAndSaveToDrafts();

    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
        //driverFactory.getDriver(browser).quit();
    }
}
