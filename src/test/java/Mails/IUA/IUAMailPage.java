package Mails.IUA;

import Mails.Abstracts.Mail.AbstractMailPage;
import Mails.Abstracts.SendMailForm.AbstractMailForm;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class IUAMailPage extends AbstractMailPage {
    public IUAMailPage(WebDriver driver) {
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
