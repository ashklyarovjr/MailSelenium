package Mails.Abstracts.Mail;


import Mails.Abstracts.AbstractPage;
import Mails.Abstracts.SendMailForm.AbstractMailForm;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class AbstractMailPage extends AbstractPage implements MailPageInterface {

    public AbstractMailPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public AbstractMailForm composeMailBtnClick(WebElement mailBtn) {
        return null;
    }

    @Override
    public AbstractMailPage draftsTabClick(WebElement draftsTab) {
        return null;
    }

    @Override
    public AbstractMailPage sentMailTabClick(WebElement sentMailTab) {
        return null;
    }
}
