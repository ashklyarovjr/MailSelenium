package Mails.Abstracts.Helpers;


import Mails.Abstracts.Mail.AbstractMailPage;

public abstract class AbstractMailHelper implements MailHelperInterface {
    protected AbstractMailPage mailPage;

    public AbstractMailHelper(AbstractMailPage mailPage) {
        this.mailPage = mailPage;
    }
}
