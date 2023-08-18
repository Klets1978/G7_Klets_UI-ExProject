package expansionCollectionBooks;

import data.TestData;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ExpansionCollectionBooksTest extends baseTest.BaseTest {

    @Before
    public void selectBookForCollection() {

        pageProvider.getLoginPage().loginWithValidCreds(TestData.LOGIN_DEFAULT, TestData.PASSWORD_DEFAULT);
        pageProvider.getProfilePage().checkIsElementsDisplayOnProfilePage();

        pageProvider.getProfilePage().clickOnButtonGoToStore();

        pageProvider.getBookStorePage().checkIsElementBookStoreDisplay();
        pageProvider.getBookStorePage().clickOnLinkGitPocketGuide();

        pageProvider.getBookDetailPage().checkIsElementBookDetailPageVisible();
        pageProvider.getBookStorePage().checkIsTableBookListNotVisible();

    }

    @Test
    public void expansionCollectionBook() {
        pageProvider.getBookDetailPage().clickOnButtonAddToYourCollection();
        pageProvider.getBookDetailPage().alertAccept();
        pageProvider.getBookDetailPage().clickOnButtonProfile();

        pageProvider.getProfilePage().checkIsLinkVisible();

        pageProvider.getBookDetailPage().checkIsButtonAddToYourCollectionNotVisible();
    }

    @After
    public void deleteBooksFromCollection() {
        pageProvider.getProfilePage().clickOnButtonDeleteAllBook();
        pageProvider.getProfilePage().checkIsModalDialogVisible();
        pageProvider.getProfilePage().acceptModalDialog();
        pageProvider.getProfilePage().alertAccept();
        pageProvider.getProfilePage().checkIsLinkNotVisible();
    }

}
