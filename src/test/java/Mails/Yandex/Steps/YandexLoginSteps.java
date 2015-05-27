package Mails.Yandex.Steps;

import Mails.Helpers.Waits;
import Mails.MailsInfo;
import Mails.Yandex.YandexLoginPage;
import Mails.Yandex.YandexReceivedMailPage;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;


public class YandexLoginSteps {

    YandexLoginPage loginPage;

    YandexReceivedMailPage receivedMailPage;

    public YandexLoginSteps(WebDriver driver) {
        loginPage = new YandexLoginPage(driver);
    }

    public YandexMailSteps loginAs() {
        loginPage.goToPage();

        Waits.waitForElementPresent(loginPage.getDriver(), MailsInfo.YandexLoginPageInfo.USERNAME_INPUT_XPATH);

        assertThat(loginPage.getTitle(), containsString("Yandex.Mail"));

        receivedMailPage = loginPage.typeUsername(MailsInfo.YandexLoginPageInfo.USERNAME)
                .typePassword(MailsInfo.YandexLoginPageInfo.PASSWORD)
                .submitLogin();

        Waits.waitForElementPresent(loginPage.getDriver(), MailsInfo.YandexMailPageInfo.COMPOSE_BTN_XPATH);

        return new YandexMailSteps(receivedMailPage);
    }


}
