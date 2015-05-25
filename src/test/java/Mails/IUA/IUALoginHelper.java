package Mails.IUA;

import Mails.Abstracts.Helpers.AbstractLoginHelper;
import Mails.Abstracts.Helpers.AbstractMailHelper;
import Mails.Abstracts.Mail.AbstractMailPage;
import Mails.MailsInfo;
import org.openqa.selenium.WebDriver;


public class IUALoginHelper  extends AbstractLoginHelper {


    public IUALoginHelper(WebDriver driver) {
        super(new IUALoginPage(driver));
    }

    @Override
    public AbstractMailHelper loginAs() {
        loginPage.typeUsername(MailsInfo.IUaLoginPageInfo.USERNAME, MailsInfo.IUaLoginPageInfo.USERNAME_INPUT_XPATH);
        loginPage.typePassword(MailsInfo.IUaLoginPageInfo.PASSWORD, MailsInfo.IUaLoginPageInfo.PASSWORD_INPUT_XPATH);
        return loginPage.submitLogin();
    }
}
