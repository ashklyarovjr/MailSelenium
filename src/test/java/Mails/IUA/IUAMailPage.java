package Mails.IUA;

import Mails.Abstracts.AbstractPage;
import Mails.Abstracts.MailPageInterface;
import org.openqa.selenium.WebDriver;


public class IUAMailPage extends AbstractPage implements MailPageInterface {

    public IUAMailPage(WebDriver driver, String url) {
        super(driver, url);
    }

    public IUAMailPage(WebDriver driver) {
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
