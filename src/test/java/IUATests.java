import Mails.IUA.Steps.IUALoginSteps;
import WebDriverFactory.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IUATests {

    private IUALoginSteps iuaLoginSteps;

    private WebDriver driver;

    @BeforeMethod
    public void setUp() throws Exception {

        String browser = "ie";

        WebDriverFactory driverFactory = new WebDriverFactory();

        driver = driverFactory.getDriver(browser);

        iuaLoginSteps = new IUALoginSteps(driver);

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
        driver.quit();
    }
}
