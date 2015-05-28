package Mails.Gmail.Steps;


import Mails.Gmail.*;
import Mails.Helpers.Waits;
import Mails.MailsInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;


public class GmailMailSteps {

    GmailLoginPage loginPage;

    GmailReceivedMailPage mainPage;

    GmailMailForm mailForm;

    GmailDraftsPage draftsPage;

    GmailSentMailPage sentMailPage;

    GmailReceivedMailPage receivedMailPage;



    public GmailMailSteps(GmailReceivedMailPage mainPage) {
        this.mainPage = mainPage;
    }


    public GmailMailSteps composeMailAndSaveToDrafts() {

        (new WebDriverWait(mainPage.getDriver(), 10)).until(ExpectedConditions.elementToBeClickable(By.xpath(MailsInfo.GmailMailPageInfo.COMPOSE_BTN_XPATH)));

        assertThat(mainPage.getDriver().getTitle(), containsString(MailsInfo.GmailLoginPageInfo.USERNAME));

        mailForm = mainPage.composeMailBtnClick();

        Waits.waitForElementPresent(mailForm.getDriver(), MailsInfo.GmailMailPageInfo.COMPOSE_FORM_TO_XPATH);

        mailForm.fillInToField(MailsInfo.YandexLoginPageInfo.USERNAME)
                .fillInSubjField(MailsInfo.GmailMailPageInfo.FORM_SUBJ)
                .fillInText(MailsInfo.GmailMailPageInfo.FORM_TEXT)
                .saveAndQuit();

        Waits.waitForElementPresent(mainPage.getDriver(), MailsInfo.GmailMailPageInfo.COMPOSE_BTN_XPATH);

        return this;
    }

    public GmailMailSteps openSameMailInDraftsAndSend() {

        assertThat(mainPage.getDriver().getTitle(), containsString(MailsInfo.GmailLoginPageInfo.USERNAME));

        draftsPage = mainPage.draftsTabClick();

        Waits.waitForElementPresent(draftsPage.getDriver(), MailsInfo.GmailMailPageInfo.COMPOSED_DRAFT_XPATH);

        mailForm = draftsPage.composedDraftClick();

        Waits.waitForElementPresent(draftsPage.getDriver(), MailsInfo.GmailMailPageInfo.DRAFT_FORM_TO_FIELD);

        assertThat(mailForm.getDriver().findElement(By.xpath(MailsInfo.GmailMailPageInfo.DRAFT_FORM_TO_FIELD)).getText(), containsString(MailsInfo.YandexLoginPageInfo.USERNAME));
        assertThat(mailForm.getSubjField().getAttribute("value"), containsString(MailsInfo.GmailMailPageInfo.FORM_SUBJ));
        assertThat(mailForm.getTextField().getText(), containsString(MailsInfo.GmailMailPageInfo.FORM_TEXT));

        receivedMailPage =  mailForm.sendMail();

        Waits.waitForElementPresent(receivedMailPage.getDriver(), MailsInfo.GmailMailPageInfo.SENT_MAIL_TAB_XPATH);

        sentMailPage = receivedMailPage.sentMailTabClick();

        (new WebDriverWait(sentMailPage.getDriver(), 10)).until(ExpectedConditions.elementToBeClickable(By.xpath(MailsInfo.GmailMailPageInfo.COMPOSED_DRAFT_XPATH)));

        return this;
    }

    public GmailLoginSteps logOut() {

        sentMailPage = sentMailPage.userLogoClick();

        (new WebDriverWait(sentMailPage.getDriver(), 10)).until(ExpectedConditions.elementToBeClickable(By.xpath(MailsInfo.GmailMailPageInfo.LOGOUT_BTN_XPATH)));

        try {

            loginPage = sentMailPage.logoutBtnClick();

        } catch (UnhandledAlertException e) {

            Actions action = new Actions(sentMailPage.getDriver());
            action.sendKeys(Keys.ENTER).build().perform();

        }

        Waits.waitForElementPresent(loginPage.getDriver(), MailsInfo.GmailLoginPageInfo.PASSWORD_INPUT_XPATH);

        return new GmailLoginSteps(sentMailPage.getDriver());
    }

}
