package Mails.Gmail;

import Mails.Abstracts.AbstractPage;
import Mails.Abstracts.MailFormInterface;
import Mails.MailsInfo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class GmailMailForm extends AbstractPage implements MailFormInterface {

    public GmailMailForm(WebDriver driver) {
        super(driver, driver.getCurrentUrl());
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath = MailsInfo.GmailMailPageInfo.COMPOSE_FORM_TO_XPATH)
    private WebElement toField;
    
    @FindBy(xpath = MailsInfo.GmailMailPageInfo.COMPOSE_FORM_SUBJ_XPATH)
    private WebElement subjField;
    
    @FindBy(xpath = MailsInfo.GmailMailPageInfo.COMPOSE_FORM_TEXT_XPATH)
    private WebElement textField;
    
    @FindBy(xpath = MailsInfo.GmailMailPageInfo.COMPOSE_FORM_SAVE_AND_QUITBTN_XPATH)
    private WebElement saveAndQuitBtn;

    @FindBy(xpath = MailsInfo.GmailMailPageInfo.COMPOSE_FORM_SENDBTN_XPATH)
    private WebElement sendBtn;

    public WebElement getToField() {
        return toField;
    }

    public WebElement getSubjField() {
        return subjField;
    }

    public WebElement getTextField() {
        return textField;
    }

    @Override
    public GmailMailForm fillInToField(String email) {
        toField.sendKeys(email);
        return this;
    }

    @Override
    public GmailMailForm fillInSubjField(String subject) {
        subjField.sendKeys(subject);
        return this;
    }

    @Override
    public GmailMailForm fillInText(String text) {
        textField.sendKeys(text);
        return this;
    }

    @Override
    public GmailReceivedMailPage saveAndQuit() {
        saveAndQuitBtn.click();
        return new GmailReceivedMailPage(driver);
    }
    
    @Override
    public GmailReceivedMailPage sendMail() {
        sendBtn.click();
        return new GmailReceivedMailPage(driver);
    }
}
