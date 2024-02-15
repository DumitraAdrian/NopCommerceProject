package Tests;

import Pages.Apparel.ApparelAllPage;
import Pages.Apparel.ClothingPage;
import Pages.Forms.HomePage;
import ShareData.Hooks;
import org.testng.annotations.Test;

public class ApparelClothing extends Hooks {

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
        apparelAllPage.clickClothing();

//        WebElement Clothing= driver.findElement(By.linkText("Clothing"));
//        Clothing.click();

        ClothingPage clothingPage=new ClothingPage(getDriver());
        clothingPage.interractClickJeans();

//        WebElement Jeans= driver.findElement(By.cssSelector("a[href='/levis-511-jeans']"));
//        Jeans.click();

        clothingPage.interractAddToCartJeans();
//        WebElement AddToCartJeans= driver.findElement(By.cssSelector("button[id='add-to-cart-button-30']"));
//        AddToCartJeans.click();
    }
}
