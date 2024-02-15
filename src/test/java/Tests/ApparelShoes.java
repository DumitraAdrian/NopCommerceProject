package Tests;

import Pages.Apparel.ApparelAllPage;
import Pages.Apparel.ShoesPage;
import Pages.Forms.HomePage;
import ShareData.Hooks;
import org.testng.annotations.Test;

public class ApparelShoes extends Hooks {

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

//        WebElement Apparel= driver.findElement(By.cssSelector("a[href='/apparel']"));
//        Apparel.click();

        ApparelAllPage apparelAllPage=new ApparelAllPage(getDriver());
        apparelAllPage.clickShoes();

//        WebElement Shoes= driver.findElement(By.linkText("Shoes"));
//        Shoes.click();

        ShoesPage shoesPage=new ShoesPage(getDriver());
        shoesPage.interractClickNike();

//        WebElement Nike= driver.findElement(By.cssSelector("a[href='/nike-floral-roshe-customized-running-shoes']"));
//        Nike.click();

        shoesPage.interractClickSelectSize();

//        WebElement SelectSize= driver.findElement(By.cssSelector("select[id='product_attribute_6']"));
//        SelectSize.click();

        shoesPage.interractClickAddToCartNike();

//        WebElement AddToCartNike= driver.findElement(By.cssSelector("button[id='add-to-cart-button-24']"));
//        AddToCartNike.click();
    }
}
