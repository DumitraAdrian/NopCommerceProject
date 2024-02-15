package Tests;

import Pages.Apparel.ApparelAllPage;
import Pages.Apparel.ClothingPage;
import Pages.Forms.HomePage;
import ShareData.Hooks;
import org.testng.annotations.Test;

public class ApparelClothing extends Hooks {
    @Test

    public void metodatest() {

        HomePage homePage=new HomePage(getDriver());
        homePage.clickApparel();

        ApparelAllPage apparelAllPage=new ApparelAllPage(getDriver());
        apparelAllPage.clickClothing();

        ClothingPage clothingPage=new ClothingPage(getDriver());
        clothingPage.interractClickJeans();
        clothingPage.interractAddToCartJeans();
    }
}
