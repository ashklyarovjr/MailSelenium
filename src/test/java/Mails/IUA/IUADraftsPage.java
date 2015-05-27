package Mails.IUA;


import Mails.Abstracts.AbstractPage;
import Mails.Abstracts.MailPageInterface;
import Mails.Gmail.GmailMailForm;
import Mails.MailsInfo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IUADraftsPage extends AbstractPage implements MailPageInterface {

    public IUADraftsPage(WebDriver driver) {
        super(driver, driver.getCurrentUrl());
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = MailsInfo.IUAMailPageInfo.COMPOSE_BTN_XPATH)
    private WebElement composeBtn;

    @FindBy(xpath = MailsInfo.IUAMailPageInfo.DRAFTS_TAB_XPATH)
    private WebElement draftsTab;

    @FindBy(xpath = MailsInfo.IUAMailPageInfo.SENT_MAIL_TAB_XPATH)
    private WebElement sentMailTab;

    @FindBy(xpath = MailsInfo.IUAMailPageInfo.COMPOSED_DRAFT_XPATH)
    private WebElement composedDraft;

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

    public IUAMailForm composedDraftClick() {
        composedDraft.click();
        return new IUAMailForm(driver);
    }

    @Override
    public IUAMailForm composeMailBtnClick() {
        composeBtn.click();
        return new IUAMailForm(driver);
    }

    @Override
    public IUADraftsPage draftsTabClick() {
        draftsTab.click();
        return this;
    }

    @Override
    public IUASentMailPage sentMailTabClick() {
        sentMailTab.click();
        return new IUASentMailPage(driver);
    }

    @Override
    public IUALoginPage logoutBtnClick() {
        logOutBtn.click();
        return new IUALoginPage(driver);
    }
}
