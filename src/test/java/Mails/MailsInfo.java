package Mails;


public final class MailsInfo {
    public static final String YANDEX_LOGO_XPATH = "//div[contains(@class, 'logo')]";
    public static final String IUA_LOGO_XPATH = "//img[@alt = 'I.UA']";

    public static final class YandexLoginPageInfo {
        public static final String URL = "https://mail.yandex.com/";
        public static final String USERNAME = "test.petrov.123@yandex.ru";
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
        public static final String COMPOSE_FORM_SENDBTN_XPATH = "//tbody//div[count(div) = 2]/div[@role='button' and @data-tooltip]";
        public static final String COMPOSE_FORM_SAVE_AND_QUITBTN_XPATH = ".//img[3]";
        public static final String COMPOSED_DRAFT_XPATH = "//tr//span[text()='" + FORM_SUBJ + "']";
        public static final String DRAFT_FORM_TO_FIELD = "//form/div/div/span";
        public static final String USER_LOGO_PIC_XPATH = "(//a[contains(@href, 'plus.google.com')]/span)[3]";
        public static final String LOGOUT_BTN_XPATH = "//a[contains(@href, 'logout')]";
    }

    public static final class YandexMailPageInfo {
        public static final String FORM_SUBJ = "Test";
        public static final String FORM_TEXT = "TEST";
        public static final String ACCOUNT_NAME_XPATH = "//span[contains(@class, 'header-user-name')]";
        public static final String COMPOSE_BTN_XPATH = "//a[contains(@href, 'compose')]/img";
        public static final String SENT_MAIL_TAB_XPATH = "//div[@class='block-app']//a[contains(@href, 'sent')]";
        public static final String DRAFTS_TAB_XPATH = "//div[@class='block-app']//a[contains(@href, 'draft')]";
        public static final String COMPOSE_FORM_TO_XPATH = "//div[contains(@class, 'mail-input')]//input[@type = 'text' and @data-nb]";
        public static final String COMPOSE_FORM_SUBJ_XPATH = ".//input[@id='compose-subj']";
        public static final String COMPOSE_FORM_TEXT_XPATH = "//textarea[@id='compose-send']";
        public static final String COMPOSE_FORM_SENDBTN_XPATH = "//table[@class='b-compose-head']//button[@type='submit']";
        public static final String COMPOSE_FORM_SAVE_AND_QUITBTN_XPATH = "//div[contains(@class, 'message__left')]//button[contains(@data-action, 'close')]";
        public static final String CONFIRM_CANCEL_BTN_XPATH = "//button[contains(@data-action, 'dialog.save')]";
        public static final String COMPOSED_DRAFT_XPATH = "//div[@class='b-messages']/div[1]//span/span[contains(@class, 'firstline-wrapper')]";
        public static final String DRAFT_FORM_TO_FIELD = "//div[@draggable]/input";
        public static final String USER_LOGO_PIC_XPATH = "//span[contains(@class, 'user-pic')]";
        public static final String LOGOUT_BTN_XPATH = "(//a[contains(@href, 'passport.yandex.com')])[6]";
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
        public static final String COMPOSED_DRAFT_XPATH = ".//*[@id='mesgList']//div[1]//span[3]/span";
        public static final String USER_OPTIONS_BUTTON_XPATH = "//div[@class='ho_nav']//li[@class = 'ho_menu_item']/span";
        public static final String LOGOUT_BTN_XPATH = "//a[contains(@href, 'logout.php')]";
    }
}
