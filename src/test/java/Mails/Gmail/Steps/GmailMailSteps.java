package Mails.Gmail.Steps;


import Mails.Gmail.GmailDraftsPage;
import Mails.Gmail.GmailMailForm;
import Mails.Gmail.GmailReceivedMailPage;
import Mails.Helpers.Waits;
import Mails.MailsInfo;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class GmailMailSteps {

    GmailReceivedMailPage mainPage;

    GmailMailForm mailForm;

    GmailDraftsPage draftsPage;



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

        mainPage.draftsTabClick();
        return null;
    }


}
