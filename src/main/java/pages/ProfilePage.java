package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends ParentPage {

    @FindBy(xpath = "//div[@class=\"pattern-backgound playgound-header\"]")
    private WebElement profileHeader;

    @FindBy(xpath = "//label[@id='userName-value']")
    private WebElement userName;

    @FindBy(xpath = "//button[@id='submit' and text()='Log out']")
    private WebElement buttonLogOut;

    @FindBy(xpath = "//li[@class='btn btn-light active' and @id=\"item-3\"]")
    private WebElement elementProfile;

    @FindBy(xpath = "//div[@class='mb-3 input-group']//input[@id='searchBox']")
    private WebElement inputSearch;

    @FindBy(xpath = "//div[@class='mb-3 input-group']//div[@class='input-group-append']")
    private WebElement buttonSearch;

    @FindBy(xpath = "//div[@class='profile-wrapper']//div[@class='ReactTable -striped -highlight']")
    private WebElement tableBookList;

    @FindBy(xpath = "//span[@id='see-book-Git Pocket Guide']//a")
    private WebElement linkGitPocketGuide;

    @FindBy(xpath = "//button[@id='gotoStore']")
    private WebElement buttonGoToStore;

    @FindBy(xpath = "//button[@id='submit' and text()='Delete Account']")
    private WebElement buttonDeleteAccount;

    @FindBy(xpath = "//div[@class='text-right button di']//button[@id='submit' and text()='Delete All Books']")
    private WebElement buttonDeleteAllBooks;


    public ProfilePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void checkIsProfileHeaderVisible() {
        checkIsElementDisplayed(profileHeader);
    }

    public void checkIsUserNameVisible() {
        checkIsElementDisplayed(userName);
    }

    public void checkIsButtonLogOutVisible() {
        checkIsElementDisplayed(buttonLogOut);
    }

    public void checkIsElementProfileVisible() {
        checkIsElementDisplayed(elementProfile);
    }

    public void checkIsInputSearchVisible() {
        checkIsElementDisplayed(inputSearch);
    }

    public void checkIsButtonSearchVisible() {
        checkIsElementDisplayed(buttonSearch);
    }

    public void checkIsTableBookListVisible() {
        checkIsElementDisplayed(tableBookList);
    }

    public void checkIsButtonGoToStoreVisible() {
        checkIsElementDisplayed(buttonGoToStore);
    }

    public void checkIsButtonDeleteAccountVisible() {
        checkIsElementDisplayed(buttonDeleteAccount);
    }

    public void checkIsButtonDeleteAllBooksVisible() {
        checkIsElementDisplayed(buttonDeleteAllBooks);
    }

    public void checkIsLinkVisible() {
        checkIsElementDisplayed(linkGitPocketGuide);
    }

    public void clickOnButtonLogOut() {
        clickOnElement(buttonLogOut);
    }

    public void checkIsButtonLogOutNotVisible() {
        checkIsElementNotVisible(buttonLogOut);
    }

    private void checkIsElementNotVisible(WebElement buttonLogOut) {
        checkIsElementNotDisplayed(buttonLogOut);
    }

    public void checkIsElementProfileNotVisible() {
        checkIsElementNotDisplayed(elementProfile);
    }


    public void checkIsInputSearchNotVisible() {
        checkIsElementNotDisplayed(inputSearch);
    }

    public void checkIsTableBookListNotVisible() {
        checkIsElementNotDisplayed(tableBookList);
    }


    public void checkIsButtonGoToStoreNotVisible() {
        checkIsElementNotDisplayed(buttonGoToStore);
    }

    public void checkIsButtonDeleteAccountNotVisible() {
        checkIsElementNotDisplayed(buttonDeleteAccount);
    }

    public void checkIsButtonDeleteAllBooksNotVisible() {
        checkIsElementNotDisplayed(buttonDeleteAllBooks);
    }

    public void clickOnButtonGoToStore() {
        clickOnElement(buttonGoToStore);
    }

    public void clickOnButtonDeleteAllBook() {
        hoverAndClickOnElement(buttonDeleteAllBooks);
    }


    public void checkIsElementsDisplayOnProfilePage() {
        checkIsProfileHeaderVisible();
        checkIsUserNameVisible();
        checkIsButtonLogOutVisible();
        checkIsElementProfileVisible();
        checkIsInputSearchVisible();
        checkIsButtonSearchVisible();
        checkIsTableBookListVisible();
        checkIsButtonGoToStoreVisible();
        checkIsButtonDeleteAccountVisible();
        checkIsButtonDeleteAllBooksVisible();
    }

    public void checkIsLinkNotVisible() {
        checkIsElementNotDisplayed(linkGitPocketGuide);
    }

    public void acceptModalDialog() {
        PageProvider.getModalDialog(webDriver).clickOnButtonOk();
    }

    public void checkIsModalDialogVisible() {
        PageProvider.getModalDialog(webDriver).checkIsModalDialogVisible();
    }
}
