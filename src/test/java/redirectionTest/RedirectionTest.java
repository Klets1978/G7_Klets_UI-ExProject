package redirectionTest;

import data.TestData;
import org.junit.Test;

import javax.xml.crypto.Data;

import static data.TestData.LOGIN_DEFAULT;
import static data.TestData.PASSWORD_DEFAULT;

public class RedirectionTest extends baseTest.BaseTest {

    @Test
    public void redirectionToBookStorePage() {

        pageProvider.getLoginPage().loginWithValidCreds(TestData.LOGIN_DEFAULT, TestData.PASSWORD_DEFAULT);

        pageProvider.getProfilePage().checkIsElementsDisplayOnProfilePage();
        pageProvider.getProfilePage().clickOnButtonGoToStore();

        pageProvider.getBookStorePage().checkIsElementBookStoreVisible();

    }

    @Test
    public void redirectionToBookDetailPage() {

        pageProvider.getLoginPage().loginWithValidCreds(TestData.LOGIN_DEFAULT, TestData.PASSWORD_DEFAULT);

        pageProvider.getProfilePage().checkIsElementsDisplayOnProfilePage();
        pageProvider.getProfilePage().clickOnButtonGoToStore();

        pageProvider.getBookStorePage().checkIsElementBookStoreDisplay();
        pageProvider.getBookStorePage().clickOnLinkGitPocketGuide();

        pageProvider.getBookDetailPage().checkIsElementBookDetailPageVisible();
        pageProvider.getBookStorePage().checkIsTableBookListNotVisible();

    }


}


