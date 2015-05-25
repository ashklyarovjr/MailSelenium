package Mails.Abstracts.Helpers;

import Mails.Abstracts.Login.AbstractLoginPage;


public abstract class AbstractLoginHelper implements LoginHelperInterface {

    protected AbstractLoginPage loginPage;

    public AbstractLoginHelper(AbstractLoginPage loginPage) {
        this.loginPage = loginPage;
    }

}
