package Mails.Yandex.Steps;


import Mails.Gmail.Steps.GmailLoginSteps;
import Mails.Helpers.Waits;
import Mails.MailsInfo;
import Mails.Yandex.*;
import org.openqa.selenium.By;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class YandexMailSteps {

    YandexLoginPage loginPage;

    YandexReceivedMailPage mainPage;

    YandexMailForm mailForm;

    YandexDraftsPage draftsPage;

    YandexSentMailPage sentMailPage;

    YandexReceivedMailPage receivedMailPage;

    public YandexMailSteps(YandexReceivedMailPage mainPage) {
        this.mainPage = mainPage;
    }

    public YandexMailSteps composeMailAndSaveToDrafts() {
        assertThat(mainPage.getDriver().findElement(By.xpath(MailsInfo.YandexMailPageInfo.ACCOUNT_NAME_XPATH)).getText(), containsString(MailsInfo.YandexLoginPageInfo.USERNAME));

        mailForm = mainPage.composeMailBtnClick();

        Waits.waitForElementPresent(mainPage.getDriver(), MailsInfo.YandexMailPageInfo.COMPOSE_FORM_SAVE_AND_QUITBTN_XPATH);

        mailForm.fillInToField(MailsInfo.IUALoginPageInfo.USERNAME)
                .fillInSubjField(MailsInfo.YandexMailPageInfo.FORM_SUBJ)
                .fillInText(MailsInfo.YandexMailPageInfo.FORM_TEXT)
                .saveAndQuit();

        Waits.waitForElementPresent(mailForm.getDriver(), MailsInfo.YandexMailPageInfo.CONFIRM_CANCEL_BTN_XPATH);

        mailForm.confirmBtnClick();

        Waits.waitForElementPresent(mainPage.getDriver(), MailsInfo.YandexMailPageInfo.COMPOSE_BTN_XPATH);

        return this;
    }

    public YandexMailSteps openSameMailInDraftsAndSend() {

        assertThat(mainPage.getDriver().findElement(By.xpath(MailsInfo.YandexMailPageInfo.ACCOUNT_NAME_XPATH)).getText(), containsString(MailsInfo.YandexLoginPageInfo.USERNAME));

        draftsPage = mainPage.draftsTabClick();

        Waits.waitForElementPresent(draftsPage.getDriver(), MailsInfo.YandexMailPageInfo.COMPOSED_DRAFT_XPATH);

        mailForm = draftsPage.composedDraftClick();

        assertThat(mailForm.getDriver().findElement(By.xpath(MailsInfo.YandexMailPageInfo.DRAFT_FORM_TO_FIELD)).getAttribute("value"), containsString(MailsInfo.IUALoginPageInfo.USERNAME));
        assertThat(mailForm.getSubjField().getAttribute("value"), containsString(MailsInfo.YandexMailPageInfo.FORM_SUBJ));
        assertThat(mailForm.getTextField().getAttribute("value"), containsString(MailsInfo.YandexMailPageInfo.FORM_TEXT));

        receivedMailPage =  mailForm.sendMail();

        Waits.waitForElementPresent(receivedMailPage.getDriver(), MailsInfo.IUAMailPageInfo.SENT_MAIL_TAB_XPATH);

        sentMailPage = receivedMailPage.sentMailTabClick();

        Waits.waitForElementPresent(sentMailPage.getDriver(), MailsInfo.YandexMailPageInfo.COMPOSED_DRAFT_XPATH);

        return this;
    }

    public GmailLoginSteps logOut() {

        loginPage = sentMailPage.userLogoClick()
                .logoutBtnClick();

        Waits.waitForElementPresent(loginPage.getDriver(), MailsInfo.YANDEX_LOGO_XPATH);

        return new GmailLoginSteps(sentMailPage.getDriver());
    }
}
