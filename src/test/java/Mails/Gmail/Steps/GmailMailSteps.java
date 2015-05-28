package Mails.Gmail.Steps;


import Mails.Gmail.*;
import Mails.Helpers.Waits;
import Mails.MailsInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


import static org.openqa.selenium.lift.Finders.*;
import static org.openqa.selenium.lift.Matchers.*;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class GmailMailSteps {

    GmailLoginPage loginPage;

    GmailReceivedMailPage mainPage;

    GmailMailForm mailForm;

    GmailDraftsPage draftsPage;

    GmailSentMailPage sentMailPage;



    public GmailMailSteps(GmailReceivedMailPage mainPage) {
        this.mainPage = mainPage;
    }


    public GmailMailSteps composeMailAndSaveToDrafts() {
        assertThat(mainPage.getDriver().getTitle(), containsString(MailsInfo.GmailLoginPageInfo.USERNAME));

        mainPage.composeMailBtnClick().fillInToField(MailsInfo.YandexLoginPageInfo.USERNAME)
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

        assertThat(mailForm.getDriver().findElement(By.xpath(MailsInfo.GmailMailPageInfo.DRAFT_FORM_TO_FIELD)).getText(), containsString(MailsInfo.YandexLoginPageInfo.USERNAME));
        assertThat(mailForm.getSubjField().getAttribute("value"), containsString(MailsInfo.GmailMailPageInfo.FORM_SUBJ));
        assertThat(mailForm.getTextField().getText(), containsString(MailsInfo.GmailMailPageInfo.FORM_TEXT));

        sentMailPage =  mailForm.sendMail()
                                .sentMailTabClick();

        Waits.waitForElementPresent(sentMailPage.getDriver(), MailsInfo.GmailMailPageInfo.COMPOSED_DRAFT_XPATH);

        return this;
    }

    public GmailLoginSteps logOut() {

        loginPage = sentMailPage.userLogoClick()
                    .logoutBtnClick();

        Waits.waitForElementPresent(loginPage.getDriver(), MailsInfo.GmailLoginPageInfo.PASSWORD_INPUT_XPATH);

        return new GmailLoginSteps(sentMailPage.getDriver());
    }

}
