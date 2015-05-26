package Mails.Abstracts;




public interface LoginPageInterface {

    AbstractPage typeUsername(String username);

    AbstractPage typePassword(String password);

    AbstractPage submitLogin();

}
