package Mails.IUA;

import Mails.Abstracts.AbstractPage;
import Mails.Abstracts.LoginPageInterface;
import Mails.MailsInfo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IUALoginPage extends AbstractPage implements LoginPageInterface {


    public IUALoginPage(WebDriver driver) {
        super(driver, MailsInfo.IUALoginPageInfo.URL);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = MailsInfo.IUALoginPageInfo.USERNAME_INPUT_XPATH)
    private WebElement usernameInpt;

    @FindBy(xpath = MailsInfo.IUALoginPageInfo.PASSWORD_INPUT_XPATH)
    private WebElement passwordInpt;

    @FindBy(xpath = MailsInfo.IUALoginPageInfo.SUBMIT_XPATH)
    private WebElement submitBtn;


    public WebElement getUsernameInpt() {
        return usernameInpt;
    }

    public WebElement getPasswordInpt() {
        return passwordInpt;
    }

    public WebElement getSubmitBtn() {
        return submitBtn;
    }


    @Override
    public IUALoginPage typeUsername(String username) {
        usernameInpt.sendKeys(username);
        return this;
    }

    @Override
    public IUALoginPage typePassword(String password) {
        passwordInpt.sendKeys(password);
        return this;
    }

    @Override
    public IUAReceivedMailPage submitLogin() {
        submitBtn.submit();
        return new IUAReceivedMailPage(driver);
    }
}
