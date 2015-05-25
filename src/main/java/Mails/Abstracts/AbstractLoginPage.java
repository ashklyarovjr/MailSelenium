package Mails.Abstracts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class AbstractLoginPage extends AbstractPage implements LoginPageInterface {

    public AbstractLoginPage(WebDriver driver) {
        super(driver);
    }

    public AbstractLoginPage typeUsername(String username, String usernameXPATH) {
        driver.findElement(By.xpath(usernameXPATH)).sendKeys(username);
        return this;
    }

    public AbstractLoginPage typePassword(String password, String passwordXPATH) {
        driver.findElement(By.xpath(passwordXPATH)).sendKeys(password);
        return this;
    }

}
