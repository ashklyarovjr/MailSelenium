package Mails.Gmail;

import Mails.Abstracts.AbstractPage;
import Mails.Abstracts.LoginPageInterface;
import Mails.MailsInfo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class GmailLoginPage extends AbstractPage implements LoginPageInterface {



    public GmailLoginPage(WebDriver driver) {
        super(driver, MailsInfo.GmailLoginPageInfo.URL);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = MailsInfo.GmailLoginPageInfo.USERNAME_INPUT_XPATH)
    private WebElement usernameInpt;

    @FindBy(xpath = MailsInfo.GmailLoginPageInfo.PASSWORD_INPUT_XPATH)
    private WebElement passwordInpt;

    @FindBy(xpath = MailsInfo.GmailLoginPageInfo.SUBMIT_XPATH)
    private WebElement submitBtn;

    @FindBy(xpath = MailsInfo.GmailLoginPageInfo.NEXT_BTN_XPATH)
    private WebElement nextBtn;

    public WebElement getUsernameInpt() {
        return usernameInpt;
    }

    public WebElement getPasswordInpt() {
        return passwordInpt;
    }

    public WebElement getSubmitBtn() {
        return submitBtn;
    }

    public WebElement getNextBtn() {
        return nextBtn;
    }

    public GmailLoginPage nextBtnClick() {
        nextBtn.click();
        return this;
    }

    @Override
    public GmailLoginPage typeUsername(String username) {
        usernameInpt.sendKeys(username);
        return this;
    }

    @Override
    public GmailLoginPage typePassword(String password) {
        passwordInpt.sendKeys(password);
        return this;
    }

    @Override
    public GmailReceivedMailPage submitLogin() {
        submitBtn.submit();
        return new GmailReceivedMailPage(driver);
    }

}
