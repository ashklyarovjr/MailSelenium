package Mails.IUA;

import Mails.Abstracts.AbstractLoginPage;
import Mails.Abstracts.AbstractMailPage;
import Mails.MailsInfo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IUALoginPage extends AbstractLoginPage {
    public IUALoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = MailsInfo.IUaLoginPageInfo.SUBMIT_XPATH)
    private WebElement submitBtn;

    @Override
    public AbstractMailPage submitLogin() {
        submitBtn.submit();
        return new IUAMailPage(driver);
    }

    @Override
    public AbstractMailPage loginAs(String username, String password) {
        typeUsername(username, MailsInfo.IUaLoginPageInfo.USERNAME_INPUT_XPATH);
        typePassword(username, MailsInfo.IUaLoginPageInfo.PASSWORD_INPUT_XPATH);
        return submitLogin();
    }
}
