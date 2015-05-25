package Mails.IUA;

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

    @Override
    public AbstractMailPage submitLogin() {
        submitBtn.submit();
        return new IUAMailPage(driver);
    }


}
