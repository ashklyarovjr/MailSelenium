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
        public static final String URL = "https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&hl";
        public static final String USERNAME = "petrov.vas123321123@gmail.com";
        public static final String PASSWORD = "123an123";
        public static final String USERNAME_INPUT_XPATH = "//input[@type='email']";
        public static final String NEXT_BTN_XPATH = "//input[@id='next']";
        public static final String PASSWORD_INPUT_XPATH = "//input[@type='password']";
        public static final String SUBMIT_XPATH = "//input[@id='signIn']";
    }

    public static final class IUALoginPageInfo {
        public static final String URL = "http://mail.i.ua/";
        public static final String USERNAME = "test.iua.123@i.ua";
        public static final String PASSWORD = "123an123";
        public static final String USERNAME_INPUT_XPATH = "//input[@name='login']";
        public static final String PASSWORD_INPUT_XPATH = "//input[@name='pass']";
        public static final String SUBMIT_XPATH = "//div[@class='Right']//input[@type='submit']";

    }

    public static final class GmailMailPageInfo {
        public static final String FORM_SUBJ = "Test";
        public static final String FORM_TEXT = "TEST";
        public static final String COMPOSE_BTN_XPATH = "//div[@class='z0']/div";
        public static final String SENT_MAIL_TAB_XPATH = "//a[contains(@href, 'https://mail.google.com/mail/?pli=1#sent')]";
        public static final String DRAFTS_TAB_XPATH = "//a[contains(@href, 'https://mail.google.com/mail/?pli=1#drafts')]";
        public static final String COMPOSE_FORM_TO_XPATH = "//textarea[@name='to']";
        public static final String COMPOSE_FORM_SUBJ_XPATH = "//input[@name='subjectbox']";
        public static final String COMPOSE_FORM_TEXT_XPATH = "//div[@role='textbox']";
        public static final String COMPOSE_FORM_SENDBTN_XPATH = "//div[@id=':7p']";
        public static final String COMPOSE_FORM_SAVE_AND_QUITBTN_XPATH = "//*[@id=':55']/div/div[1]/span/a";
        public static final String COMPOSED_DRAFT_XPATH = "//tr//span[text()='" + GmailMailPageInfo.FORM_SUBJ + "']";

    }

    public static final class YandexMailPageInfo {
        public static final String FORM_SUBJ = "Test";
        public static final String FORM_TEXT = "TEST";
        public static final String COMPOSE_BTN_XPATH = "";
        public static final String SENT_MAIL_TAB_XPATH = "";
        public static final String DRAFTS_TAB_XPATH = "";
        public static final String COMPOSE_FORM_TO_XPATH = "";
        public static final String COMPOSE_FORM_SUBJ_XPATH = "";
        public static final String COMPOSE_FORM_TEXT_XPATH = "";
        public static final String COMPOSE_FORM_SENDBTN_XPATH = "";
        public static final String COMPOSE_FORM_SAVE_AND_QUITBTN_XPATH = "";
    }

    public static final class IUAMailPageInfo {
        public static final String FORM_SUBJ = "Test";
        public static final String FORM_TEXT = "TEST";
        public static final String COMPOSE_BTN_XPATH = "//p[@class='make_message']/a";
        public static final String SENT_MAIL_TAB_XPATH = "//a[contains(@href, 'sent-mail')]";
        public static final String DRAFTS_TAB_XPATH = "//a[contains(@href, 'drafts')]";
        public static final String COMPOSE_FORM_TO_XPATH = "//textarea[@id='to']";
        public static final String COMPOSE_FORM_SUBJ_XPATH = "//input[@name='subject']";
        public static final String COMPOSE_FORM_TEXT_XPATH = "//textarea[@id='text']";
        public static final String COMPOSE_FORM_SENDBTN_XPATH = "//div[@class='Left']/p[1]/input[@name='send']";
        public static final String COMPOSE_FORM_SAVE_AND_QUITBTN_XPATH = "//div[@class='Left']/p[1]/input[@name='save_in_drafts']";
    }
}
