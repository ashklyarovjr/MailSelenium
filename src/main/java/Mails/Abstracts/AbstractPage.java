package Mails.Abstracts;

import org.openqa.selenium.WebDriver;


public abstract class AbstractPage {
    protected final WebDriver driver;

    protected String title;

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
        title = driver.getTitle();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
