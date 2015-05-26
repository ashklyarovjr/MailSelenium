package Mails.Gmail;


import Mails.Abstracts.Mail.AbstractMailPage;
import Mails.MailsInfo;
import org.openqa.selenium.WebDriver;

public class GmailMailPage extends AbstractMailPage {

    public GmailMailPage(WebDriver driver) {
        super(driver, MailsInfo.GmailMailPageInfo.URL);
    }


}
