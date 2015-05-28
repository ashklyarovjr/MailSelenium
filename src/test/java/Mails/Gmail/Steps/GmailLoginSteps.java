package Mails.Gmail.Steps;


import Mails.Gmail.GmailLoginPage;
import Mails.Gmail.GmailReceivedMailPage;
import Mails.Helpers.Waits;
import Mails.MailsInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class GmailLoginSteps {

    GmailLoginPage loginPage;

    GmailReceivedMailPage receivedMailPage;

    public GmailLoginSteps(WebDriver driver) {
        loginPage = new GmailLoginPage(driver);
    }

    public GmailMailSteps loginAs() {
        loginPage.goToPage();

        Waits.waitForElementPresent(loginPage.getDriver(), MailsInfo.GmailLoginPageInfo.USERNAME_INPUT_XPATH);

        assertThat(loginPage.getTitle(), containsString("Google"));

        try {

            receivedMailPage = loginPage.typeUsername(MailsInfo.GmailLoginPageInfo.USERNAME)
                                        .typePassword(MailsInfo.GmailLoginPageInfo.PASSWORD)
                                        .submitLogin();

        } catch (ElementNotVisibleException e) {

            try {

                loginPage = loginPage.nextBtnClick();

            } catch (NoSuchElementException e1) {

                System.out.println("OK Then..");

            } finally {

                (new WebDriverWait(loginPage.getDriver(), 20)).until(ExpectedConditions.elementToBeClickable(By.xpath(MailsInfo.GmailLoginPageInfo.PASSWORD_INPUT_XPATH)));

                receivedMailPage = loginPage.typePassword(MailsInfo.GmailLoginPageInfo.PASSWORD)
                                            .submitLogin();
            }

        }

        Waits.waitForElementPresent(loginPage.getDriver(), MailsInfo.GmailMailPageInfo.COMPOSE_BTN_XPATH);

        return new GmailMailSteps(receivedMailPage);
    }
}
