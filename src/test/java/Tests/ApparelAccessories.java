package Tests;

import Pages.Apparel.AccessoriesPage;
import Pages.Apparel.ApparelAllPage;
import Pages.Forms.HomePage;
import ShareData.Hooks;
import org.testng.annotations.Test;

public class ApparelAccessories extends Hooks {


    @Test

    public void metodatest() {

        HomePage homePage=new HomePage(getDriver());
        homePage.clickApparel();

        ApparelAllPage apparelAllPage=new ApparelAllPage(getDriver());
        apparelAllPage.clickAccessories();

        AccessoriesPage accessoriesPage=new AccessoriesPage(getDriver());
        accessoriesPage.InterractClickSunglass();
        accessoriesPage.InterractAddToCartSunglass();
    }
}
