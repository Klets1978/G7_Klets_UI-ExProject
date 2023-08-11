package loginTest;

import org.junit.Test;

import static data.TestData.LOGIN_DEFAULT;
import static data.TestData.PASSWORD_DEFAULT;

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
}
