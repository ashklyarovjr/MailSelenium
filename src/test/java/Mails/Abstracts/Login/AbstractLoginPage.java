package Mails.Abstracts.Login;


import Mails.Abstracts.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class AbstractLoginPage extends AbstractPage implements LoginPageInterface {


    public AbstractLoginPage(WebDriver driver, String url) {
        super(driver, url);
    }

    protected WebElement usernameInpt;
    protected WebElement passwordInpt;

    protected WebElement getUsernameInpt() {
        return usernameInpt;
    }

    protected WebElement getPasswordInpt() {
        return passwordInpt;
    }

    protected void setUsernameInpt(WebElement usernameInpt) {
        this.usernameInpt = usernameInpt;
    }

    protected void setPasswordInpt(WebElement passwordInpt) {
        this.passwordInpt = passwordInpt;
    }

    @Override
    public AbstractLoginPage typeUsername(String username) {
        usernameInpt.sendKeys(username);
        return this;
    }

    @Override
    public AbstractLoginPage typePassword(String password) {
       passwordInpt.sendKeys(password);
        return this;
    }


}
