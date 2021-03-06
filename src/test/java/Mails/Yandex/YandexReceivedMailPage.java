package Mails.Yandex;

import Mails.Abstracts.AbstractPage;
import Mails.Abstracts.MailPageInterface;
import Mails.MailsInfo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class YandexReceivedMailPage extends AbstractPage implements MailPageInterface {

    public YandexReceivedMailPage(WebDriver driver) {
        super(driver, driver.getCurrentUrl());
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = MailsInfo.YandexMailPageInfo.COMPOSE_BTN_XPATH)
    private WebElement composeBtn;

    @FindBy(xpath = MailsInfo.YandexMailPageInfo.DRAFTS_TAB_XPATH)
    private WebElement draftsTab;

    @FindBy(xpath = MailsInfo.YandexMailPageInfo.SENT_MAIL_TAB_XPATH)
    private WebElement sentMailTab;

    @FindBy(xpath = "")
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
        return new YandexSentMailPage(driver);
    }

    @Override
    public YandexLoginPage logoutBtnClick() {
        logOutBtn.click();
        return new YandexLoginPage(driver);
    }
}
