package Mails.Abstracts.Mail;

import Mails.Abstracts.SendMailForm.AbstractMailForm;
import org.openqa.selenium.WebElement;

public interface MailPageInterface {
    AbstractMailForm composeMailBtnClick(WebElement mailBtn);
    AbstractMailPage draftsTabClick(WebElement draftsTab);
    AbstractMailPage sentMailTabClick(WebElement sentMailTab);

}
