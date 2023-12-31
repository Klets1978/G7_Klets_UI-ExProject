package loginTest;

import org.junit.Test;

import static data.TestData.*;

public class LoginTestWithPageObject extends baseTest.BaseTest {

    @Test
    public void validLogin() {
        pageProvider.getLoginPage().openLoginPage();
        pageProvider.getLoginPage().enterTextIntoInputUsername(LOGIN_DEFAULT);
        pageProvider.getLoginPage().enterTextIntoInputPassword(PASSWORD_DEFAULT);
        pageProvider.getLoginPage().clickOnButtonSignIn();

        pageProvider.getProfilePage().checkIsButtonLogOutVisible();
        pageProvider.getProfilePage().checkIsElementProfileVisible();
        pageProvider.getProfilePage().checkIsInputSearchVisible();
        pageProvider.getProfilePage().checkIsTableBookListVisible();
        pageProvider.getProfilePage().checkIsButtonGoToStoreVisible();
        pageProvider.getProfilePage().checkIsButtonDeleteAccountVisible();
        pageProvider.getProfilePage().checkIsButtonDeleteAllBooksVisible();

        pageProvider.getLoginPage().checkIsButtonSignInNotVisible();

    }

    @Test
    public void invalidLogin() {
        pageProvider.getLoginPage().openLoginPage();
        pageProvider.getLoginPage().enterTextIntoInputUsername(LOGIN_INVALID);
        pageProvider.getLoginPage().enterTextIntoInputPassword(PASSWORD_DEFAULT);
        pageProvider.getLoginPage().clickOnButtonSignIn();

        pageProvider.getLoginPage().checkIsErrorMessageDisplayed();
        pageProvider.getLoginPage().checkSignInButtonDisplayed();

        pageProvider.getProfilePage().checkIsButtonLogOutNotVisible();
        pageProvider.getProfilePage().checkIsElementProfileNotVisible();
        pageProvider.getProfilePage().checkIsInputSearchNotVisible();
        pageProvider.getProfilePage().checkIsTableBookListNotVisible();
        pageProvider.getProfilePage().checkIsButtonGoToStoreNotVisible();
        pageProvider.getProfilePage().checkIsButtonDeleteAccountNotVisible();
        pageProvider.getProfilePage().checkIsButtonDeleteAllBooksNotVisible();

    }
}
