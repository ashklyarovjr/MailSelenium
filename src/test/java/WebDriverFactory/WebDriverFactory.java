package WebDriverFactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverFactory extends AbstractDriverFactory {
    @Override
    public WebDriver getDriver(String parameter) {
        switch (parameter) {
            case "firefox":
                return new FirefoxDriver();
            case "ie":
                System.setProperty("webdriver.ie.driver","D:\\HomeTask_Java\\MailSelenium\\WebDrivers\\IEDriverServer.exe");
                return new InternetExplorerDriver();
            case "opera":
                System.setProperty("webdriver.opera.driver")
        }
        return null;
    }
}
