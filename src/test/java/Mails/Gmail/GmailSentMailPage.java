package Mails.Gmail;

import Mails.Abstracts.AbstractPage;
import Mails.Abstracts.MailPageInterface;
import org.openqa.selenium.WebDriver;


public class GmailSentMailPage extends AbstractPage implements MailPageInterface {

    public GmailSentMailPage(WebDriver driver, String url) {
        super(driver, url);
    }

    public GmailSentMailPage(WebDriver driver) {
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
