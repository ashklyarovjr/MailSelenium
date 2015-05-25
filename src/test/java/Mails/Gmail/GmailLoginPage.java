package Mails.Gmail;

import Mails.Abstracts.Helpers.AbstractMailHelper;
import Mails.Abstracts.Login.AbstractLoginPage;
import Mails.Abstracts.Mail.AbstractMailPage;
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

    public AbstractLoginPage goToGmailLoginPage() {
        driver.get(MailsInfo.GmailLoginPageInfo.URL);
        return this;
    }

    @Override
    public AbstractMailPage submitLogin() {
        submitBtn.submit();
        return new GmailMailPage(driver);
    }


}
