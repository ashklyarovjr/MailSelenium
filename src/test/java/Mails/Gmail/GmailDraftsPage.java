package Mails.Gmail;


import Mails.Abstracts.AbstractPage;
import Mails.Abstracts.MailPageInterface;
import Mails.MailsInfo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailDraftsPage extends AbstractPage implements MailPageInterface {

    public GmailDraftsPage(WebDriver driver) {
        super(driver, driver.getCurrentUrl());
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = MailsInfo.GmailMailPageInfo.COMPOSE_BTN_XPATH)
    private WebElement composeBtn;

    @FindBy(xpath = MailsInfo.GmailMailPageInfo.DRAFTS_TAB_XPATH)
    private WebElement draftsTab;

    @FindBy(xpath = MailsInfo.GmailMailPageInfo.SENT_MAIL_TAB_XPATH)
    private WebElement sentMailTab;

    @FindBy(xpath = MailsInfo.GmailMailPageInfo.COMPOSED_DRAFT_XPATH)
    private WebElement composedDraft;

    public WebElement getComposeBtn() {
        return composeBtn;
    }

    public WebElement getDraftsTab() {
        return draftsTab;
    }

    public WebElement getSentMailTab() {
        return sentMailTab;
    }

    public GmailMailForm composedDraftClick() {
        composedDraft.click();
        return new GmailMailForm(driver);
    }

    @Override
    public GmailMailForm composeMailBtnClick() {
        composeBtn.click();
        return new GmailMailForm(driver);
    }

    @Override
    public GmailDraftsPage draftsTabClick() {
        draftsTab.click();
        return this;
    }

    @Override
    public GmailSentMailPage sentMailTabClick() {
        sentMailTab.click();
        return new GmailSentMailPage(driver);
    }

}
