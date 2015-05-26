package Mails.IUA.Steps;


import Mails.Helpers.Waits;
import Mails.IUA.IUAReceivedMailPage;
import Mails.MailsInfo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class IUAMailSteps {

    IUAReceivedMailPage mainPage;

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
}
