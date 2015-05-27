package Mails.IUA;


import Mails.Abstracts.AbstractPage;
import Mails.Abstracts.MailPageInterface;
import Mails.MailsInfo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IUASentMailPage extends AbstractPage implements MailPageInterface {

    public IUASentMailPage(WebDriver driver) {
        super(driver, driver.getCurrentUrl());
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = MailsInfo.IUAMailPageInfo.COMPOSE_BTN_XPATH)
    private WebElement composeBtn;

    @FindBy(xpath = MailsInfo.IUAMailPageInfo.DRAFTS_TAB_XPATH)
    private WebElement draftsTab;

    @FindBy(xpath = MailsInfo.IUAMailPageInfo.SENT_MAIL_TAB_XPATH)
    private WebElement sentMailTab;

    @FindBy(xpath = MailsInfo.IUAMailPageInfo.USER_OPTIONS_BUTTON_XPATH)
    private WebElement userOptions;

    @FindBy(xpath = MailsInfo.IUAMailPageInfo.LOGOUT_BTN_XPATH)
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

    public IUASentMailPage userLogoClick() {
        userOptions.click();
        return this;
    }

    @Override
    public IUAMailForm composeMailBtnClick() {
        composeBtn.click();
        return new IUAMailForm(driver);
    }

    @Override
    public IUADraftsPage draftsTabClick() {
        draftsTab.click();
        return new IUADraftsPage(driver);
    }

    @Override
    public IUASentMailPage sentMailTabClick() {
        sentMailTab.click();
        return this;
    }

    @Override
    public IUALoginPage logoutBtnClick() {
        logOutBtn.click();
        return new IUALoginPage(driver);
    }
}
