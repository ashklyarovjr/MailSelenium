package Mails.Yandex;


import Mails.Abstracts.AbstractLoginPage;
import Mails.Abstracts.AbstractMailPage;
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

    @Override
    public AbstractMailPage loginAs(String username, String password) {
        return null;
    }
}
