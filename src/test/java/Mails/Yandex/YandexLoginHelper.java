package Mails.Yandex;

import Mails.Abstracts.Helpers.AbstractLoginHelper;
import Mails.Abstracts.Helpers.AbstractMailHelper;
import Mails.Abstracts.Mail.AbstractMailPage;
import Mails.MailsInfo;
import org.openqa.selenium.WebDriver;


public class YandexLoginHelper extends AbstractLoginHelper {
    public YandexLoginHelper(WebDriver driver) {
        super(new YandexLoginPage(driver));
    }

    @Override
    public AbstractMailHelper loginAs() {
        loginPage.typeUsername(MailsInfo.YandexLoginPageInfo.USERNAME);
        loginPage.typePassword(MailsInfo.YandexLoginPageInfo.PASSWORD);
        return new YandexMailHelper(loginPage.getDriver());
    }
}
