package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookStorePage extends ParentPage {
    public BookStorePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//div[@class='pattern-backgound playgound-header']")
    private WebElement bookStoreHeader;

    @FindBy(xpath = "//li[@class='btn btn-light active' and @id=\"item-2\"]")
    private WebElement elementBookStore;

    @FindBy(xpath = "//div[@class=\"ReactTable -striped -highlight\"]//div[@class=\"rt-tbody\"]")
    private WebElement tableBookList;

    @FindBy(xpath = "//span[@id='see-book-Git Pocket Guide']//a")
    private WebElement linkGitPocketGuide;


    public void checkIsBookStoreHeaderVisible() {
        checkIsElementDisplayed(bookStoreHeader);
    }

    public void checkIsElementBookStoreVisible() {
        checkIsElementDisplayed(elementBookStore);
    }

    public void checkIsTableBookListVisible() {
        checkIsElementDisplayed(tableBookList);
    }

    public void clickOnLinkGitPocketGuide() {
        clickOnElement(linkGitPocketGuide);
    }

    public void checkIsTableBookListNotVisible() {
        checkIsElementNotDisplayed(tableBookList);
    }

    public void checkIsElementBookStoreDisplay() {
        checkIsBookStoreHeaderVisible();
        checkIsElementBookStoreVisible();
        checkIsTableBookListVisible();

    }
}
