package expansionCollectionBooks;

import data.TestData;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static data.TestData.LOGIN_DEFAULT;
import static data.TestData.PASSWORD_DEFAULT;

public class ExpansionCollectionBooksTest extends baseTest.BaseTest {

    @Before
    public void selectBookForCollection() {

        pageProvider.getLoginPage().loginWithValidCreds(TestData.LOGIN_DEFAULT,TestData.PASSWORD_DEFAULT);
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
      //  pageProvider.getBookDetailPage().alertAccept();

        //pageProvider.getProfilePage().checkIsTableBookListVisible();

    }

//    @After
//    public void deleteBooksFromCollection() {
//        pageProvider.getProfilePage().clickOnButtonDeleteBook();
//        pageProvider.getProfilePage().modalWindowAccept();
//        pageProvider.getProfilePage().checkIsTableBookListNotVisible();
//    }

}
