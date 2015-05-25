package Mails.Gmail;

import Mails.Abstracts.AbstractLoginPage;
import Mails.Abstracts.AbstractMailPage;
import Mails.MailsInfo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class GmailLoginPage extends AbstractLoginPage {

    public GmailLoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = MailsInfo.GmailLoginPageInfo.SUBMIT_XPATH)
    private WebElement submitBtn;


    @Override
    public AbstractMailPage submitLogin() {
        submitBtn.submit();
        return new GmailMailPage(driver);
    }

    @Override
    public AbstractMailPage loginAs(String username, String password) {
        typeUsername(username, MailsInfo.GmailLoginPageInfo.USERNAME_INPUT_XPATH);
        typePassword(password, MailsInfo.GmailLoginPageInfo.PASSWORD_INPUT_XPATH);
        return submitLogin();
    }
}
