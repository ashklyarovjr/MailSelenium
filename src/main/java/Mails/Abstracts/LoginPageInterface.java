package Mails.Abstracts;

/**
 * Created by Anton on 5/25/2015.
 */
public interface LoginPageInterface {
    AbstractMailPage submitLogin();
    AbstractMailPage loginAs(String username, String password);
}
