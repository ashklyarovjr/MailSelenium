import Mails.Gmail.Steps.GmailLoginSteps;
import WebDriverFactory.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class  TestScenarios {

    GmailLoginSteps gmailLoginSteps;

    WebDriverFactory driverFactory;

    WebDriver driver;
    //@Parameters("browser")
    @BeforeMethod
    public void setUp() throws Exception {

        //driverFactory = new WebDriverFactory();

         driver = new FirefoxDriver();
        //gmailLoginSteps = new GmailLoginSteps(driverFactory.getDriver(browser));

        gmailLoginSteps = new GmailLoginSteps();
    }

    @Test()
    public void testGmail() throws Exception {

       // gmailLoginSteps.loginAs();

        // goToLoginPage(String url)
        // .logIn(String username, String password)
        // .createNewLetter();
        // .saveToDrafts();
        // .sendLetterFromDrafts();
        // .goToSentMail();
        // .checkThatMailHasBeenSent();
        // .logOut();
    }

    @Test
    public void testYandex() throws Exception {

    }

    @Test
    public void testIUA() throws Exception {


    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
        //driverFactory.getDriver(browser).quit();
    }
}
