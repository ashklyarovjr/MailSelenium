package Mails.Abstracts.Login;


import Mails.Abstracts.Mail.AbstractMailPage;

public interface LoginPageInterface {
    AbstractLoginPage typeUsername(String username);
    AbstractLoginPage typePassword(String password);
    AbstractMailPage submitLogin();

}
