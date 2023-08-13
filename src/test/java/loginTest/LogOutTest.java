package loginTest;

import org.junit.Test;

import static data.TestData.LOGIN_DEFAULT;
import static data.TestData.PASSWORD_DEFAULT;

public class LogOutTest extends baseTest.BaseTest {

    @Test
    public void logOut() {
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

        pageProvider.getProfilePage().clickOnButtonLogOut();

        pageProvider.getLoginPage().checkIsButtonSignInVisible();

        pageProvider.getProfilePage().checkIsButtonLogOutNotVisible();
        pageProvider.getProfilePage().checkIsElementProfileNotVisible();
        pageProvider.getProfilePage().checkIsInputSearchNotVisible();
        pageProvider.getProfilePage().checkIsTableBookListNotVisible();
        pageProvider.getProfilePage().checkIsButtonGoToStoreNotVisible();
        pageProvider.getProfilePage().checkIsButtonDeleteAccountNotVisible();
        pageProvider.getProfilePage().checkIsButtonDeleteAllBooksNotVisible();
    }
}
