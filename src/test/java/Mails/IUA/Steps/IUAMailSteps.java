package Mails.IUA.Steps;


import Mails.Gmail.GmailDraftsPage;
import Mails.Gmail.GmailMailForm;
import Mails.Gmail.GmailReceivedMailPage;
import Mails.Gmail.GmailSentMailPage;
import Mails.Helpers.Waits;
import Mails.IUA.IUADraftsPage;
import Mails.IUA.IUAMailForm;
import Mails.IUA.IUAReceivedMailPage;
import Mails.IUA.IUASentMailPage;
import Mails.MailsInfo;
import org.openqa.selenium.By;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class IUAMailSteps {

    IUAReceivedMailPage mainPage;

    IUAMailForm mailForm;

    IUADraftsPage draftsPage;

    IUASentMailPage sentMailPage;

    public IUAMailSteps(IUAReceivedMailPage mainPage) {
        this.mainPage = mainPage;
    }


    public IUAMailSteps composeMailAndSaveToDrafts() {
        assertThat(mainPage.getDriver().getTitle(), containsString("I.UA"));


        mainPage.composeMailBtnClick().fillInToField(MailsInfo.YandexLoginPageInfo.USERNAME)
                .fillInSubjField(MailsInfo.GmailMailPageInfo.FORM_SUBJ)
                .fillInText(MailsInfo.GmailMailPageInfo.FORM_TEXT)
                .saveAndQuit();

        Waits.waitForElementPresent(mainPage.getDriver(), MailsInfo.IUAMailPageInfo.COMPOSE_BTN_XPATH);

        return this;
    }

    public IUAMailSteps openSameMailInDraftsAndSend() {
        assertThat(mainPage.getDriver().getTitle(), containsString(MailsInfo.IUALoginPageInfo.USERNAME));

        draftsPage = mainPage.draftsTabClick();

        Waits.waitForElementPresent(draftsPage.getDriver(), MailsInfo.IUAMailPageInfo.COMPOSED_DRAFT_XPATH);

        mailForm = draftsPage.composedDraftClick();

        assertThat(mailForm.getToField().getText(), containsString(MailsInfo.YandexLoginPageInfo.USERNAME));
        assertThat(mailForm.getSubjField().getText(), containsString(MailsInfo.IUAMailPageInfo.FORM_SUBJ));
        assertThat(mailForm.getTextField().getText(), containsString(MailsInfo.IUAMailPageInfo.FORM_TEXT));

        sentMailPage =  mailForm.sendMail()
                .sentMailTabClick();

        Waits.waitForElementPresent(sentMailPage.getDriver(), MailsInfo.GmailMailPageInfo.COMPOSED_DRAFT_XPATH);

        return this;
    }
}
