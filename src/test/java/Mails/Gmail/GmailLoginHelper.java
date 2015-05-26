package Mails.Gmail;


import Mails.Abstracts.Helpers.AbstractLoginHelper;
import Mails.Abstracts.Helpers.AbstractMailHelper;
import Mails.MailsInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GmailLoginHelper extends AbstractLoginHelper{

    public GmailLoginHelper(WebDriver driver) {
        super(new GmailLoginPage(driver));
    }

    @Override
    public AbstractMailHelper loginAs() {
        loginPage.goToPage();
        WebElement waitForPageLoad = (new WebDriverWait(loginPage.getDriver(),10)).until((WebDriver driver) -> driver.findElement(By.xpath(MailsInfo.GmailLoginPageInfo.USERNAME_INPUT_XPATH)));

        assertThat(loginPage.getDriver().getTitle(), is(loginPage.getTitle()));

        loginPage.typePassword(MailsInfo.GmailLoginPageInfo.USERNAME);
        loginPage.typePassword(MailsInfo.GmailLoginPageInfo.PASSWORD);

        WebElement wait = (new WebDriverWait(loginPage.getDriver(), 10)).until((WebDriver driver) -> driver.findElement(By.xpath(MailsInfo.GmailMailPageInfo.COMPOSE_BTN_XPATH)));
        return new GmailMailHelper(loginPage.getDriver());
    }
}
