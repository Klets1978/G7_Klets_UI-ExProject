package expansionCollectionBooks;

import org.junit.Test;

import static data.TestData.LOGIN_DEFAULT;
import static data.TestData.PASSWORD_DEFAULT;

public class ExpansionCollectionBooksTest extends baseTest.BaseTest {

    @Test
    public void expansionCollectionBook() {
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

        pageProvider.getProfilePage().clickOnButtonGoToStore();

        pageProvider.getBookStorePage().checkIsBookStoreHeaderVisible();
        pageProvider.getBookStorePage().checkIsElementBookStoreVisible();
        pageProvider.getBookStorePage().checkIsTableBookListVisible();

        pageProvider.getBookStorePage().clickOnLinkGitPocketGuide();

        pageProvider.getBookDetailPage().checkIsBookISBNVisible();
        pageProvider.getBookDetailPage().checkIsBookTitleVisible();
        pageProvider.getBookDetailPage().checkIsBookSubTitleVisible();
        pageProvider.getBookDetailPage().checkIsBookAuthorVisible();
        pageProvider.getBookDetailPage().checkIsBookPublisherVisible();
        pageProvider.getBookDetailPage().checkIsBookTotalPagesVisible();
        pageProvider.getBookDetailPage().checkIsBookDescriptionVisible();
        pageProvider.getBookDetailPage().checkIsBookWebsiteVisible();
        pageProvider.getBookDetailPage().checkIsBookWebsiteLinkVisible();
        pageProvider.getBookDetailPage().checkIsButtonBackToBookStoreVisible();
        pageProvider.getBookDetailPage().checkIsButtonAddToYourCollectionVisible();

        pageProvider.getBookStorePage().checkIsTableBookListNotVisible();

        pageProvider.getBookDetailPage().clickOnButtonAddToYourCollection();

        pageProvider.getProfilePage().checkIsTableBookListVisible();

    }

}
