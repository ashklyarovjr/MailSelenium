package Mails;


public abstract class AbstractLoginPage implements Page {
    protected String loginLocator;
    protected String passwordLocator;
    protected String submitLocator;

    public AbstractLoginPage(String loginLocator, String passwordLocator, String submitLocator) {
        this.loginLocator = loginLocator;
        this.passwordLocator = passwordLocator;
        this.submitLocator = submitLocator;
    }


}
