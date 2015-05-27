package Mails.Yandex;


import Mails.Abstracts.AbstractPage;
import Mails.Abstracts.MailFormInterface;
import Mails.MailsInfo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YandexMailForm extends AbstractPage implements MailFormInterface {
    public YandexMailForm(WebDriver driver) {
        super(driver, driver.getCurrentUrl());
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = MailsInfo.YandexMailPageInfo.COMPOSE_FORM_TO_XPATH)
    private WebElement toField;

    @FindBy(xpath = MailsInfo.YandexMailPageInfo.COMPOSE_FORM_SUBJ_XPATH)
    private WebElement subjField;

    @FindBy(xpath = MailsInfo.YandexMailPageInfo.COMPOSE_FORM_TEXT_XPATH)
    private WebElement textField;

    @FindBy(xpath = MailsInfo.YandexMailPageInfo.COMPOSE_FORM_SAVE_AND_QUITBTN_XPATH)
    private WebElement saveAndQuitBtn;

    @FindBy(xpath = MailsInfo.YandexMailPageInfo.COMPOSE_FORM_SENDBTN_XPATH)
    private WebElement sendBtn;

    @FindBy(xpath = MailsInfo.YandexMailPageInfo.CONFIRM_CANCEL_BTN_XPATH)
    private WebElement confirmBtn;

    public WebElement getToField() {
        return toField;
    }

    public WebElement getSubjField() {
        return subjField;
    }

    public WebElement getTextField() {
        return textField;
    }

    public YandexReceivedMailPage confirmBtnClick() {
        confirmBtn.click();
        return new YandexReceivedMailPage(driver);
    }

    @Override
    public YandexMailForm fillInToField(String email) {
        toField.sendKeys(email);
        return this;
    }

    @Override
    public YandexMailForm fillInSubjField(String subject) {
        subjField.sendKeys(subject);
        return this;
    }

    @Override
    public YandexMailForm fillInText(String text) {
        textField.sendKeys(text);
        return this;
    }

    @Override
    public YandexReceivedMailPage saveAndQuit() {
        saveAndQuitBtn.click();
        return new YandexReceivedMailPage(driver);
    }

    @Override
    public YandexReceivedMailPage sendMail() {
        sendBtn.click();
        return new YandexReceivedMailPage(driver);
    }
}
