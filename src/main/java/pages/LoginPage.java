package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends ParentPage {

    @FindBy(xpath = "//form")
    private WebElement userForm;

    @FindBy(xpath = "//input[@id='userName']")
    private WebElement inputUsername;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement inputPassword;

    @FindBy(xpath = "//button[@id='login']")
    private WebElement buttonSignIn;

    @FindBy(xpath = "//div[@class=\"login-form\"]")
    private WebElement loginForm;

    @FindBy(xpath = "//p[@id=\"name\" and text()='Invalid username or password!']")
    private WebElement errorMessage;

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void openLoginPage() {
        openPage(BASE_URL);
    }

    public void enterTextIntoInputUsername(String username) {
        enterTextIntoInput(inputUsername, username);
    }

    public void enterTextIntoInputPassword(String password) {
        enterTextIntoInput(inputPassword, password);
    }

    public void clickOnButtonSignIn() {
        clickOnElement(buttonSignIn);
    }

    public void checkSignInButtonDisplayed() {
        checkIsElementVisible(buttonSignIn);
    }

    public void checkLoginFormDisplayed() {
        checkIsElementVisible(loginForm);
    }

    private void checkIsElementVisible(WebElement loginForm) {
        checkIsElementDisplayed(loginForm);
    }

    public void checkIsErrorMessageDisplayed() {
        checkIsElementVisible(errorMessage);
    }

    public void checkIsUserFormDisplayed() {
        checkIsElementVisible(userForm);
    }

    public void checkIsUserFormNotDisplayed() {
        checkIsElementNotVisible(userForm);
    }

    private void checkIsElementNotVisible(WebElement userForm) {
        checkIsElementNotDisplayed(userForm);
    }

    public LoginPage checkErrorMessages(String expectedMessage) {
        checkIsElementVisible(errorMessage);
        String actualMessage = errorMessage.getText();
        if (actualMessage.equals(expectedMessage)) {
            logger.info("Error message is correct");
        } else {
            logger.error("Error message is not correct");
        }
        return this;
    }

    public void checkIsButtonSignInNotVisible() {
        checkIsElementNotVisible(buttonSignIn);
    }
}
