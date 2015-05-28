import Mails.Gmail.Steps.GmailLoginSteps;
import Mails.IUA.Steps.IUALoginSteps;
import Mails.Yandex.Steps.YandexLoginSteps;
import WebDriverFactory.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class YandexTests {

    private YandexLoginSteps yandexLoginSteps;

    private WebDriver driver;

    @BeforeMethod
    public void setUp() throws Exception {

        String browser = "firefox";

        WebDriverFactory driverFactory = new WebDriverFactory();

        driver = driverFactory.getDriver(browser);

        yandexLoginSteps = new YandexLoginSteps(driver);

    }

    @Test(enabled = true)
    public void testYandex() throws Exception {

        yandexLoginSteps
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
