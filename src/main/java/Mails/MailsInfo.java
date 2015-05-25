package Mails;


public final class MailsInfo {
    public static final class YandexLoginPageInfo {
        public static final String URL = "https://mail.yandex.ua/";
        public static final String USERNAME = "test.petrov.123@yandex.com";
        public static final String PASSWORD = "123an123";
        public static final String USERNAME_INPUT_XPATH = "//input[@name='login']";
        public static final String PASSWORD_INPUT_XPATH = "//input[@name='passwd']";
        public static final String SUBMIT_XPATH = "//div[@class='new-left']//button[@type='submit']";
    }

    public static final class GmailLoginPageInfo {
        public static final String URL = "https://mail.google.com/";
        public static final String USERNAME = "petrov.vas123321123@gmail.com";
        public static final String PASSWORD = "123an123";
        public static final String USERNAME_INPUT_XPATH = "//input[@name='Email']";
        public static final String PASSWORD_INPUT_XPATH = "//input[@name='Passwd']";
        public static final String SUBMIT_XPATH = "//input[@id='signIn']";
    }

    public static final class IUaLoginPageInfo {
        public static final String URL = "https://mail.google.com/";
        public static final String USERNAME = "petrov.vas123321123@gmail.com";
        public static final String PASSWORD = "123an123";
        public static final String USERNAME_INPUT_XPATH = "//input[@name='login']";
        public static final String PASSWORD_INPUT_XPATH = "//input[@name='passwd']";
        public static final String SUBMIT_XPATH = "//div[@class='Right']//input[@type='submit']";

    }
}
