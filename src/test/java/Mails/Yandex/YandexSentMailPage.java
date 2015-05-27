package Mails.Yandex;


import Mails.Abstracts.AbstractPage;
import Mails.Abstracts.MailPageInterface;
import Mails.MailsInfo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YandexSentMailPage extends AbstractPage implements MailPageInterface {


    public YandexSentMailPage(WebDriver driver) {
        super(driver, driver.getCurrentUrl());
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = MailsInfo.YandexMailPageInfo.COMPOSE_BTN_XPATH)
    private WebElement composeBtn;

    @FindBy(xpath = MailsInfo.YandexMailPageInfo.DRAFTS_TAB_XPATH)
    private WebElement draftsTab;

    @FindBy(xpath = MailsInfo.YandexMailPageInfo.SENT_MAIL_TAB_XPATH)
    private WebElement sentMailTab;

    @FindBy(xpath = MailsInfo.YandexMailPageInfo.USER_LOGO_PIC_XPATH)
    private WebElement userLogo;

    @FindBy(xpath = MailsInfo.YandexMailPageInfo.LOGOUT_BTN_XPATH)
    private WebElement logOutBtn;

    public WebElement getComposeBtn() {
        return composeBtn;
    }

    public WebElement getDraftsTab() {
        return draftsTab;
    }

    public WebElement getSentMailTab() {
        return sentMailTab;
    }

    public YandexSentMailPage userLogoClick() {
        userLogo.click();
        return this;
    }

    @Override
    public YandexMailForm composeMailBtnClick() {
        composeBtn.click();
        return new YandexMailForm(driver);
    }

    @Override
    public YandexDraftsPage draftsTabClick() {
        draftsTab.click();
        return new YandexDraftsPage(driver);
    }

    @Override
    public YandexSentMailPage sentMailTabClick() {
        sentMailTab.click();
        return this;
    }

    @Override
    public YandexLoginPage logoutBtnClick() {
        logOutBtn.click();
        return new YandexLoginPage(driver);
    }
}
