package Mails.Yandex;


import Mails.Abstracts.AbstractPage;
import Mails.Abstracts.LoginPageInterface;
import Mails.MailsInfo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YandexLoginPage extends AbstractPage implements LoginPageInterface {

    public YandexLoginPage(WebDriver driver, String url) {
        super(driver, url);
    }

    public YandexLoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = MailsInfo.YandexLoginPageInfo.USERNAME_INPUT_XPATH)
    private WebElement usernameInpt;

    @FindBy(xpath = MailsInfo.YandexLoginPageInfo.PASSWORD_INPUT_XPATH)
    private WebElement passwordInpt;

    @FindBy(xpath = MailsInfo.YandexLoginPageInfo.SUBMIT_XPATH)
    private WebElement submitBtn;


    @Override
    public AbstractPage typeUsername(String username) {
        return null;
    }

    @Override
    public AbstractPage typePassword(String password) {
        return null;
    }

    @Override
    public AbstractPage submitLogin() {
        return null;
    }
}
