package Tests;

import Pages.Electronics.CellphonesPage;
import Pages.Electronics.ElectronicsPages;
import Pages.Forms.HomePage;
import ShareData.Hooks;
import org.testng.annotations.Test;

public class ElectronicsCellphones extends Hooks {

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
        homePage.clickElectronics();

//        WebElement Electronics = driver.findElement(By.cssSelector("a[href='/electronics']"));
//        Electronics.click();

        ElectronicsPages electronicsPages=new ElectronicsPages(getDriver());
        electronicsPages.clickCellPhones();

//        WebElement CellPhones= driver.findElement(By.linkText("Cell phones"));
//        CellPhones.click();

        CellphonesPage cellphonesPage=new CellphonesPage(getDriver());
        cellphonesPage.interractClickHtcPhone();

//        WebElement HtcPhone= driver.findElement(By.cssSelector("a[href='/htc-one-m8-android-l-50-lollipop']"));
//        HtcPhone.click();

        cellphonesPage.interractClickAddToCartHtcPhone();

//        WebElement AddToCartHtcPhone= driver.findElement(By.cssSelector("button[id='add-to-cart-button-18']"));
//        AddToCartHtcPhone.click();
    }
}
