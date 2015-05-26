package Mails.IUA.Steps;

import Mails.Gmail.GmailLoginPage;
import Mails.Gmail.GmailReceivedMailPage;
import Mails.Gmail.Steps.GmailMailSteps;
import Mails.Helpers.Waits;
import Mails.IUA.IUALoginPage;
import Mails.IUA.IUAReceivedMailPage;
import Mails.MailsInfo;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;


public class IUALoginSteps {


    IUALoginPage loginPage;

    IUAReceivedMailPage receivedMailPage;

    public IUALoginSteps(WebDriver driver) {
        loginPage = new IUALoginPage(driver);
    }

    public IUAMailSteps loginAs() {
        loginPage.goToPage();

        Waits.waitForElementPresent(loginPage.getDriver(), MailsInfo.IUALoginPageInfo.USERNAME_INPUT_XPATH);

        assertThat(loginPage.getTitle(), containsString("i.ua"));


        receivedMailPage = loginPage.typeUsername(MailsInfo.IUALoginPageInfo.USERNAME).
                typePassword(MailsInfo.IUALoginPageInfo.PASSWORD).
                submitLogin();

        Waits.waitForElementPresent(loginPage.getDriver(), MailsInfo.IUAMailPageInfo.COMPOSE_BTN_XPATH);

        return new IUAMailSteps(receivedMailPage);
    }

}
