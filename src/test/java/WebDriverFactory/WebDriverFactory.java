package WebDriverFactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class WebDriverFactory extends AbstractDriverFactory {
    @Override
    public WebDriver getDriver(String parameter) {
        switch (parameter) {
            case "firefox":
                return new FirefoxDriver();
            case "ie":
                System.setProperty("webdriver.ie.driver", "..\\MailSelenium\\WebDrivers\\IEDriverServer32.exe");
                return new InternetExplorerDriver();
            case "opera":
                System.setProperty("webdriver.opera.driver", "..\\MailSelenium\\WebDrivers\\operadriver64.exe");
                return new OperaDriver();
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "..\\MailSelenium\\WebDrivers\\chromedriver.exe");
                return new ChromeDriver();
            default:
                throw new IllegalArgumentException("This browser is undefined!");
        }
    }
}
