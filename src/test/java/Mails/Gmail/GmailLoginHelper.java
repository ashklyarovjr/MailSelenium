package Mails.Gmail;


import Mails.Abstracts.Helpers.AbstractLoginHelper;
import Mails.Abstracts.Helpers.AbstractMailHelper;
import Mails.Abstracts.Mail.AbstractMailPage;
import Mails.MailsInfo;
import org.openqa.selenium.WebDriver;

public class GmailLoginHelper extends AbstractLoginHelper{

    public GmailLoginHelper(WebDriver driver) {
        super(new GmailLoginPage(driver));
    }

    @Override
    public AbstractMailHelper loginAs() {
        loginPage.typeUsername(MailsInfo.GmailLoginPageInfo.USERNAME, MailsInfo.GmailLoginPageInfo.USERNAME_INPUT_XPATH);
        loginPage.typePassword(MailsInfo.GmailLoginPageInfo.PASSWORD, MailsInfo.GmailLoginPageInfo.PASSWORD_INPUT_XPATH);
        return new GmailMailHelper(loginPage.getDriver());
    }
}
