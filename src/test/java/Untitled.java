
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;


public class Untitled {

    WebDriver driver;

    @BeforeMethod
    public void setUp() throws Exception {
        driver = new FirefoxDriver();


    }

    @Test
    public void test() throws Exception {
        driver.get("http://google.com");
        Thread.sleep(2000);
        driver.quit();
    }

    @AfterMethod
    public void tearDown() throws Exception {

    }
}
