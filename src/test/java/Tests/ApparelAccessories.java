package Tests;

import Pages.Apparel.AccessoriesPage;
import Pages.Apparel.ApparelAllPage;
import Pages.Forms.HomePage;
import ShareData.Hooks;
import org.testng.annotations.Test;

public class ApparelAccessories extends Hooks {


    @Test

    public void metodatest() {
//        EdgeOptions options = new EdgeOptions();
//        options.addArguments("--window-size=1920,1080");
//        driver = new EdgeDriver(options);
//
//        driver.get("https://demo.nopcommerce.com/");
//        driver.manage().window().maximize();
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript("window.scrollBy(0,450)");

        HomePage homePage=new HomePage(getDriver());
        homePage.clickApparel();

//        WebElement Apparel = driver.findElement(By.cssSelector("a[href='/apparel']"));
//        Apparel.click();

        ApparelAllPage apparelAllPage=new ApparelAllPage(getDriver());
        apparelAllPage.clickAccessories();

//        WebElement Accessories= driver.findElement(By.linkText("Accessories"));
//        Accessories.click();

        AccessoriesPage accessoriesPage=new AccessoriesPage(getDriver());
        accessoriesPage.InterractClickSunglass();

//        WebElement Sunglass= driver.findElement(By.cssSelector("a[href='/ray-ban-aviator-sunglasses']"));
//        Sunglass.click();
        accessoriesPage.InterractAddToCartSunglass();

//        WebElement AddToCartSunglass= driver.findElement(By.cssSelector("button[id='add-to-cart-button-33']"));
//        AddToCartSunglass.click();
    }
}
