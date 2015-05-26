package Mails.Yandex;


import Mails.Abstracts.Helpers.AbstractMailHelper;
import Mails.Abstracts.Login.AbstractLoginPage;
import Mails.Abstracts.Mail.AbstractMailPage;
import Mails.MailsInfo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YandexLoginPage extends AbstractLoginPage {
    public YandexLoginPage(WebDriver driver) {
        super(driver, MailsInfo.YandexLoginPageInfo.URL);
    }

    @FindBy(xpath = MailsInfo.YandexLoginPageInfo.SUBMIT_XPATH)
    private WebElement submitBtn;



    @Override
    public AbstractMailPage submitLogin() {
        submitBtn.submit();
        return new YandexMailPage(driver);
    }


}
