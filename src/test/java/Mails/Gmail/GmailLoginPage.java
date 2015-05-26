package Mails.Gmail;

import Mails.Abstracts.AbstractPage;
import Mails.Abstracts.LoginPageInterface;
import Mails.MailsInfo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class GmailLoginPage extends AbstractPage implements LoginPageInterface {


    public GmailLoginPage(WebDriver driver) {
        super(driver, MailsInfo.GmailLoginPageInfo.URL);
    }

    @FindBy(xpath = MailsInfo.GmailLoginPageInfo.USERNAME_INPUT_XPATH)
    private WebElement usernameInpt;

    @FindBy(xpath = MailsInfo.GmailLoginPageInfo.PASSWORD_INPUT_XPATH)
    private WebElement passwordInpt;

    @FindBy(xpath = MailsInfo.GmailLoginPageInfo.SUBMIT_XPATH)
    private WebElement submitBtn;

    @FindBy(xpath = MailsInfo.GmailLoginPageInfo.NEXT_BTN_XPATH)
    private WebElement nextBtn;


    @Override
    public AbstractPage typeUsername(String username) {
        usernameInpt.sendKeys(username);
        return this;
    }

    @Override
    public AbstractPage typePassword(String password) {
        passwordInpt.sendKeys(password);
        return this;
    }

    @Override
    public AbstractPage submitLogin() {
        submitBtn.submit();
        return new GmailReceivedMailPage(driver);
    }


}
