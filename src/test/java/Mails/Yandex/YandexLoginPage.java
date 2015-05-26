package Mails.Yandex;


import Mails.Abstracts.AbstractPage;
import Mails.Abstracts.LoginPageInterface;
import Mails.MailsInfo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YandexLoginPage extends AbstractPage implements LoginPageInterface {


    public YandexLoginPage(WebDriver driver) {
        super(driver, MailsInfo.IUALoginPageInfo.URL);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = MailsInfo.YandexLoginPageInfo.USERNAME_INPUT_XPATH)
    private WebElement usernameInpt;

    @FindBy(xpath = MailsInfo.YandexLoginPageInfo.PASSWORD_INPUT_XPATH)
    private WebElement passwordInpt;

    @FindBy(xpath = MailsInfo.YandexLoginPageInfo.SUBMIT_XPATH)
    private WebElement submitBtn;

    public WebElement getUsernameInpt() {
        return usernameInpt;
    }

    public WebElement getPasswordInpt() {
        return passwordInpt;
    }

    public WebElement getSubmitBtn() {
        return submitBtn;
    }

    @Override
    public YandexLoginPage typeUsername(String username) {
        usernameInpt.sendKeys(username);
        return this;
    }

    @Override
    public YandexLoginPage typePassword(String password) {
        passwordInpt.sendKeys(password);
        return this;
    }

    @Override
    public YandexReceivedMailPage submitLogin() {
        submitBtn.submit();
        return new YandexReceivedMailPage(driver);
    }
}
