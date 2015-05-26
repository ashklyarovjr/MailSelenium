package Mails.Yandex;

import Mails.Abstracts.AbstractPage;
import Mails.Abstracts.MailPageInterface;
import org.openqa.selenium.WebDriver;


public class YandexMailPage extends AbstractPage implements MailPageInterface {

    public YandexMailPage(WebDriver driver, String url) {
        super(driver, url);
    }

    public YandexMailPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public AbstractPage composeMailBtnClick() {
        return null;
    }

    @Override
    public AbstractPage draftsTabClick() {
        return null;
    }

    @Override
    public AbstractPage sentMailTabClick() {
        return null;
    }
}
