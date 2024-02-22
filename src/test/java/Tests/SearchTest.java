package Tests;

import Pages.Forms.HomePage;
import Pages.SearchPage.SearchPage;
import ShareData.Hooks;
import org.testng.Assert;
import org.testng.annotations.Test;



    public class SearchTest extends Hooks {
            SearchPage searchPage;
            @Test
            public void invalidSearchTest()  {
                HomePage homePage =new HomePage(getDriver());
                homePage.searchItem("");
                driver.switchTo().alert().accept();
            }
            @Test
            public void searchResultTest() {
                HomePage homePage=new HomePage(getDriver());
                homePage.searchItem("Apple ");
                searchPage=new SearchPage(getDriver());
                Assert.assertTrue(searchPage.isItemsDisplayed());
                Assert.assertTrue(searchPage.searchForItemName("Apple "));
            }

    }


