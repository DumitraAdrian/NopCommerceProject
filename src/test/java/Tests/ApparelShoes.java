package Tests;

import Pages.Apparel.ApparelAllPage;
import Pages.Apparel.ShoesPage;
import Pages.Forms.HomePage;
import ShareData.Hooks;
import org.testng.annotations.Test;

public class ApparelShoes extends Hooks {
    @Test

    public void metodatest() {

        HomePage homePage=new HomePage(getDriver());
        homePage.clickApparel();

        ApparelAllPage apparelAllPage=new ApparelAllPage(getDriver());
        apparelAllPage.clickShoes();

        ShoesPage shoesPage=new ShoesPage(getDriver());
        shoesPage.interractClickNike();
        shoesPage.interractClickSelectSize();
        shoesPage.interractClickAddToCartNike();
    }
}
