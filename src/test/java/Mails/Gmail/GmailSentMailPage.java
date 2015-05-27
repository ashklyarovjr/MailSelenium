package Mails.Gmail;

import Mails.Abstracts.AbstractPage;
import Mails.Abstracts.MailPageInterface;
import Mails.MailsInfo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class GmailSentMailPage extends AbstractPage implements MailPageInterface {

    public GmailSentMailPage(WebDriver driver) {
        super(driver, driver.getCurrentUrl());
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = MailsInfo.GmailMailPageInfo.COMPOSE_BTN_XPATH)
    private WebElement composeBtn;

    @FindBy(xpath = MailsInfo.GmailMailPageInfo.DRAFTS_TAB_XPATH)
    private WebElement draftsTab;

    @FindBy(xpath = MailsInfo.GmailMailPageInfo.SENT_MAIL_TAB_XPATH)
    private WebElement sentMailTab;

    @FindBy(xpath = MailsInfo.GmailMailPageInfo.USER_LOGO_PIC_XPATH)
    private WebElement userLogo;

    @FindBy(xpath = MailsInfo.GmailMailPageInfo.LOGOUT_BTN_XPATH)
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

    public GmailSentMailPage userLogoClick() {
        userLogo.click();
        return this;
    }

    @Override
    public GmailMailForm composeMailBtnClick() {
        composeBtn.click();
        return new GmailMailForm(driver);
    }

    @Override
    public GmailDraftsPage draftsTabClick() {
        draftsTab.click();
        return new GmailDraftsPage(driver);
    }

    @Override
    public GmailSentMailPage sentMailTabClick() {
        sentMailTab.click();
        return this;
    }

    @Override
    public GmailLoginPage logoutBtnClick() {
        logOutBtn.click();
        return new GmailLoginPage(driver);
    }


}
