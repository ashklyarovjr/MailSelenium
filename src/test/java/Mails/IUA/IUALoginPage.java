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
    }

    @FindBy(xpath = MailsInfo.IUaLoginPageInfo.SUBMIT_XPATH)
    private WebElement submitBtn;

    public AbstractLoginPage goToIUALoginPage() {
        driver.get(MailsInfo.IUaLoginPageInfo.URL);
        return this;
    }

    @Override
    public AbstractMailHelper submitLogin() {
        submitBtn.submit();
        return new IUAMailPage(driver);
    }


}
