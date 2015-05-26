package Mails.Gmail;


import Mails.Abstracts.AbstractPage;
import Mails.Abstracts.MailPageInterface;
import org.openqa.selenium.WebDriver;

public class GmailDraftsPage extends AbstractPage implements MailPageInterface {

    public GmailDraftsPage(WebDriver driver) {
        super(driver);
    }

    public GmailDraftsPage(WebDriver driver, String url) {
        super(driver, driver.getCurrentUrl());
    }



    @Override
    public GmailMailForm composeMailBtnClick() {
        return null;
    }

    @Override
    public GmailDraftsPage draftsTabClick() {
        return null;
    }

    @Override
    public GmailSentMailPage sentMailTabClick() {
        return null;
    }

}
