package Mails.Yandex;


import Mails.Abstracts.Login.AbstractLoginPage;
import Mails.Abstracts.Mail.AbstractMailPage;
import Mails.MailsInfo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YandexLoginPage extends AbstractLoginPage {
    public YandexLoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = MailsInfo.YandexLoginPageInfo.SUBMIT_XPATH)
    private WebElement submitBtn;

    @Override
    public AbstractMailPage submitLogin() {
        return null;
    }


}
