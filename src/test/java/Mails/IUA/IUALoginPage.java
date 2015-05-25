package Mails.IUA;

import Mails.Abstracts.Helpers.AbstractMailHelper;
import Mails.Abstracts.Login.AbstractLoginPage;
import Mails.Abstracts.Mail.AbstractMailPage;
import Mails.MailsInfo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IUALoginPage extends AbstractLoginPage {
    public IUALoginPage(WebDriver driver) {
        super(driver);
        setUsernameInpt(usernameInpt);
        setPasswordInpt(passwordInpt);
    }

    @FindBy(xpath = MailsInfo.IUaLoginPageInfo.USERNAME_INPUT_XPATH)
    private WebElement usernameInpt;

    @FindBy(xpath = MailsInfo.IUaLoginPageInfo.PASSWORD_INPUT_XPATH)
    private WebElement passwordInpt;

    @FindBy(xpath = MailsInfo.IUaLoginPageInfo.SUBMIT_XPATH)
    private WebElement submitBtn;

    public AbstractLoginPage goToIUALoginPage() {
        driver.get(MailsInfo.IUaLoginPageInfo.URL);
        return this;
    }

    @Override
    public AbstractMailPage submitLogin() {
        submitBtn.submit();
        return new IUAMailPage(driver);
    }


}
