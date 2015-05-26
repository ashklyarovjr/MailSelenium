package Mails.IUA;


import Mails.Abstracts.AbstractPage;
import Mails.Abstracts.MailFormInterface;
import Mails.MailsInfo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IUAMailForm extends AbstractPage implements MailFormInterface {
    public IUAMailForm(WebDriver driver) {
        super(driver, driver.getCurrentUrl());
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = MailsInfo.IUAMailPageInfo.COMPOSE_FORM_TO_XPATH)
    private WebElement toField;

    @FindBy(xpath = MailsInfo.IUAMailPageInfo.COMPOSE_FORM_SUBJ_XPATH)
    private WebElement subjField;

    @FindBy(xpath = MailsInfo.IUAMailPageInfo.COMPOSE_FORM_TEXT_XPATH)
    private WebElement textField;

    @FindBy(xpath = MailsInfo.IUAMailPageInfo.COMPOSE_FORM_SAVE_AND_QUITBTN_XPATH)
    private WebElement saveAndQuitBtn;

    @FindBy(xpath = MailsInfo.IUAMailPageInfo.COMPOSE_FORM_SENDBTN_XPATH)
    private WebElement sendBtn;

    @Override
    public IUAMailForm fillInToField(String email) {
        toField.sendKeys(email);
        return this;
    }

    @Override
    public IUAMailForm fillInSubjField(String subject) {
        subjField.sendKeys(subject);
        return this;
    }

    @Override
    public IUAMailForm fillInText(String text) {
        textField.sendKeys(text);
        return this;
    }

    @Override
    public IUAReceivedMailPage saveAndQuit() {
        saveAndQuitBtn.click();
        return new IUAReceivedMailPage(driver);
    }

    @Override
    public IUAReceivedMailPage sendMail() {
        sendBtn.click();
        return new IUAReceivedMailPage(driver);
    }
}
