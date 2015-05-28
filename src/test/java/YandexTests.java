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

    YandexLoginSteps yandexLoginSteps;

    WebDriverFactory driverFactory;

    String browser;

    @BeforeMethod
    public void setUp() throws Exception {

        browser = "firefox";

        driverFactory = new WebDriverFactory();

        yandexLoginSteps = new YandexLoginSteps(driverFactory.getDriver(browser));

        driverFactory.getDriver("opera").manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
        driverFactory.getDriver(browser).quit();
    }
}
