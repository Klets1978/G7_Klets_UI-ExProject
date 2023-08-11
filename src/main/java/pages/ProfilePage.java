package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends ParentPage {

    @FindBy (xpath = "//div[@class=\"pattern-backgound playgound-header\"]")
    private WebElement profileHeader;

    @FindBy (xpath = "//label[@id='userName-value']")
    private WebElement userName;

    @FindBy (xpath = "//button[@id='submit' and text()='Log out']")
    private WebElement buttonLogOut;

    @FindBy (xpath = "//li[@class='btn btn-light active' and @id=\"item-3\"]")
    private WebElement elementProfile;

    @FindBy (xpath = "//div[@class='mb-3 input-group']//input[@id='searchBox']")
    private WebElement inputSearch;

    @FindBy (xpath = "//div[@class='mb-3 input-group']//div[@class='input-group-append']")
    private WebElement buttonSearch;

    @FindBy (xpath = "//div[@class='profile-wrapper']//div[@class='ReactTable -striped -highlight']")
    private WebElement tableBookList;

    @FindBy (xpath = "//button[@id='gotoStore']")
    private WebElement buttonGoToStore;

    @FindBy (xpath = "//button[@id='submit' and text()='Delete Account']")
    private WebElement buttonDeleteAccount;

    @FindBy (xpath = "//div[@class='text-right button di']//button[@id='submit' and text()='Delete All Books']")
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

    public void clickOnButtonLogOut() {
        clickOnElement(buttonLogOut);
    }

    public boolean isButtonLogOutVisible() {
        return isElementDisplayed(buttonLogOut);
    }


}

