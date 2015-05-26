package Mails.Abstracts.SendMailForm;


import Mails.Abstracts.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class AbstractMailForm extends AbstractPage implements MailFormInterface{
    public AbstractMailForm(WebDriver driver, String url) {
        super(driver, url);
    }
}
