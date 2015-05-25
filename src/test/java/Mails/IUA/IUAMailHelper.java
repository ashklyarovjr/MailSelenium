package Mails.IUA;


import Mails.Abstracts.Helpers.AbstractMailHelper;
import org.openqa.selenium.WebDriver;

public class IUAMailHelper extends AbstractMailHelper {



    public IUAMailHelper(WebDriver driver) {
        super(new IUAMailPage(driver));
    }
}
