package Mails.Gmail;


import Mails.Abstracts.Helpers.AbstractMailHelper;
import org.openqa.selenium.WebDriver;

public class GmailMailHelper extends AbstractMailHelper {

    public GmailMailHelper(WebDriver driver){
        super(new GmailMailPage(driver));
    }


}
