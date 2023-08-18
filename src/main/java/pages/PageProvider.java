package pages;

import org.openqa.selenium.WebDriver;
import pages.elements.ModalDialog;

public class PageProvider {
    WebDriver webDriver;

    public PageProvider(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public static ModalDialog getModalDialog(WebDriver webDriver) {
        return new ModalDialog(webDriver);
    }

    public LoginPage getLoginPage() {
        return new LoginPage(webDriver);
    }

    public ProfilePage getProfilePage() {
        return new ProfilePage(webDriver);
    }

    public BookStorePage getBookStorePage() { return new BookStorePage(webDriver);
    }

    public BookDetailPage getBookDetailPage() {
        return new BookDetailPage(webDriver);
    }
}
