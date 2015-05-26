package Mails.Gmail;


import Mails.Abstracts.AbstractPage;
import Mails.Abstracts.MailPageInterface;
import Mails.MailsInfo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailReceivedMailPage extends AbstractPage implements MailPageInterface {

    public GmailReceivedMailPage(WebDriver driver) {
        super(driver, driver.getCurrentUrl());
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = MailsInfo.GmailMailPageInfo.COMPOSE_BTN_XPATH)
    private WebElement composeBtn;

    @FindBy(xpath = MailsInfo.GmailMailPageInfo.DRAFTS_TAB_XPATH)
    private WebElement draftsTab;

    @FindBy(xpath = MailsInfo.GmailMailPageInfo.SENT_MAIL_TAB_XPATH)
    private WebElement sentMailTab;

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
        return new GmailSentMailPage(driver);
    }

}
