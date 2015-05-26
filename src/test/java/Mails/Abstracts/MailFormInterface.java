package Mails.Abstracts;


public interface MailFormInterface {
    AbstractPage fillInToField(String email);

    AbstractPage fillInSubjField(String subject);

    AbstractPage fillInText(String text);
    
    AbstractPage saveAndQuit();
    
    AbstractPage sendMail();
}
