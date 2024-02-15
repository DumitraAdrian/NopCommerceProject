package Tests;

import Pages.Books.BooksPage;
import Pages.Forms.HomePage;
import ShareData.Hooks;
import org.testng.annotations.Test;

public class Books extends Hooks {
    @Test

    public void metodatest() {

        HomePage homePage=new HomePage(getDriver());
        homePage.clickBooks();

        BooksPage booksPage=new BooksPage(getDriver());
        booksPage.interractClickPrideAndPrejudice();
        booksPage.interractClickAddToCartBook();
    }
}
