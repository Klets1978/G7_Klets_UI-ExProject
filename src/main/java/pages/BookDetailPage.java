package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class BookDetailPage extends ParentPage {
    public BookDetailPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//div[@id='ISBN-wrapper']//label[@class='form-label' and @id='userName-value']")
    private WebElement bookISBN;

    @FindBy(xpath = "//div[@id='title-wrapper']//label[@class=\"form-label\" and @id=\"userName-value\"]")
    private WebElement bookTitle;

    @FindBy(xpath = "//div[@id='subtitle-wrapper']//label[@class=\"form-label\" and @id=\"userName-value\"]")
    private WebElement bookSubtitle;

    @FindBy(xpath = "//div[@id='author-wrapper']//label[@class=\"form-label\" and @id=\"userName-value\"]")
    private WebElement bookAuthor;

    @FindBy(xpath = "//div[@id='publisher-wrapper']//label[@class=\"form-label\" and @id=\"userName-value\"]")
    private WebElement bookPublisher;

    @FindBy(xpath = "//div[@id='pages-wrapper']//label[@class=\"form-label\" and @id=\"userName-value\"]")
    private WebElement bookPages;

    @FindBy(xpath = "//div[@id='description-wrapper']//label[@class=\"form-label\" and @id=\"userName-value\"]")
    private WebElement bookDescription;

    @FindBy(xpath = "//div[@id='website-wrapper']//label[@class=\"form-label\" and @id=\"userName-value\"]")
    private WebElement bookWebsite;

    @FindBy(xpath = "//div[@id=\"website-wrapper\"]//label[@class=\"form-label\" and @id=\"userName-value\"]")
    private WebElement bookWebsiteLink;

    @FindBy(xpath = "//button[@id='addNewRecordButton' and text()='Back To Book Store']")
    private WebElement buttonBackToBookStore;

    @FindBy(xpath = "//button[@id='addNewRecordButton' and text()='Add To Your Collection']")
    private WebElement buttonAddToYourCollection;

    public void checkIsBookISBNVisible() {
        checkIsElementDisplayed(bookISBN);
    }

    public void checkIsBookTitleVisible() {
        checkIsElementDisplayed(bookTitle);
    }

    public void checkIsBookSubTitleVisible() {
        checkIsElementDisplayed(bookSubtitle);
    }

    public void checkIsBookAuthorVisible() {
        checkIsElementDisplayed(bookAuthor);
    }

    public void checkIsBookPublisherVisible() {
        checkIsElementDisplayed(bookPublisher);
    }

    public void checkIsBookTotalPagesVisible() {
        checkIsElementDisplayed(bookPages);
    }

    public void checkIsBookDescriptionVisible() {
        checkIsElementDisplayed(bookDescription);
    }

    public void checkIsBookWebsiteVisible() {
        checkIsElementDisplayed(bookWebsite);
    }

    public void checkIsBookWebsiteLinkVisible() {
        checkIsElementDisplayed(bookWebsiteLink);
    }

    public void checkIsButtonBackToBookStoreVisible() {
        checkIsElementDisplayed(buttonBackToBookStore);
    }

    public void checkIsButtonAddToYourCollectionVisible() {
        checkIsElementDisplayed(buttonAddToYourCollection);
    }

    public void clickOnButtonBackToBookStore() {
        clickOnElement(buttonBackToBookStore);
    }


    public void clickOnButtonAddToYourCollection() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        hoverOnElement(buttonAddToYourCollection);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        clickOnElementByJS(buttonAddToYourCollection);  //click on button by JS
    }

    public void checkIsElementBookDetailPageVisible() {
        checkIsElementDisplayed(bookISBN);
        checkIsElementDisplayed(bookTitle);
        checkIsElementDisplayed(bookSubtitle);
        checkIsElementDisplayed(bookAuthor);
        checkIsElementDisplayed(bookPublisher);
        checkIsElementDisplayed(bookPages);
        checkIsElementDisplayed(bookDescription);
        checkIsElementDisplayed(bookWebsite);
        checkIsElementDisplayed(bookWebsiteLink);
        checkIsElementDisplayed(buttonBackToBookStore);
        checkIsElementDisplayed(buttonAddToYourCollection);
    }

}
