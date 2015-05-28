package Mails.IUA.Steps;


import Mails.Helpers.Waits;
import Mails.IUA.*;
import Mails.MailsInfo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class IUAMailSteps {

    IUALoginPage loginPage;

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

        assertThat(mainPage.getDriver().getTitle(), containsString("I.UA"));

        draftsPage = mainPage.draftsTabClick();

        Waits.waitForElementPresent(draftsPage.getDriver(), MailsInfo.IUAMailPageInfo.COMPOSED_DRAFT_XPATH);

        mailForm = draftsPage.composedDraftClick();

        assertThat(mailForm.getToField().getText(), containsString(MailsInfo.YandexLoginPageInfo.USERNAME));
        assertThat(mailForm.getSubjField().getAttribute("value"), containsString(MailsInfo.IUAMailPageInfo.FORM_SUBJ));
        assertThat(mailForm.getTextField().getText(), containsString(MailsInfo.IUAMailPageInfo.FORM_TEXT));

        sentMailPage =  mailForm.sendMail()
                .sentMailTabClick();

        Waits.waitForElementPresent(sentMailPage.getDriver(), MailsInfo.IUAMailPageInfo.COMPOSED_DRAFT_XPATH);

        return this;
    }

    public IUALoginSteps logOut() {

        sentMailPage = sentMailPage.userMainPageLinkClick();

        Waits.waitForElementPresent(sentMailPage.getDriver(), MailsInfo.IUAMailPageInfo.LOGOUT_BTN_XPATH);

        loginPage = sentMailPage.logoutBtnClick();

        Waits.waitForElementPresent(loginPage.getDriver(), MailsInfo.IUA_LOGO_XPATH);

        return new IUALoginSteps(sentMailPage.getDriver());
    }
}
