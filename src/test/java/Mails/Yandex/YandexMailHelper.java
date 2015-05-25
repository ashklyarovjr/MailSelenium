package Mails.Yandex;


import Mails.Abstracts.Helpers.AbstractMailHelper;
import Mails.Abstracts.Mail.AbstractMailPage;
import org.openqa.selenium.WebDriver;

public class YandexMailHelper extends AbstractMailHelper {
    public YandexMailHelper(WebDriver driver) {
        super(new YandexMailPage(driver));
    }
}
