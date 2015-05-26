package Mails.IUA;

import Mails.Abstracts.AbstractPage;
import Mails.Abstracts.LoginPageInterface;
import Mails.MailsInfo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IUALoginPage extends AbstractPage implements LoginPageInterface {


    public IUALoginPage(WebDriver driver, String url) {
        super(driver, url);
    }

    public IUALoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = MailsInfo.IUaLoginPageInfo.USERNAME_INPUT_XPATH)
    private WebElement usernameInpt;

    @FindBy(xpath = MailsInfo.IUaLoginPageInfo.PASSWORD_INPUT_XPATH)
    private WebElement passwordInpt;

    @FindBy(xpath = MailsInfo.IUaLoginPageInfo.SUBMIT_XPATH)
    private WebElement submitBtn;


    @Override
    public AbstractPage typeUsername(String username) {
        return null;
    }

    @Override
    public AbstractPage typePassword(String password) {
        return null;
    }

    @Override
    public AbstractPage submitLogin() {
        return null;
    }
}
