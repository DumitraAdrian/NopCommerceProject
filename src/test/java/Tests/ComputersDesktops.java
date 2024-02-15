package Tests;

import Pages.Computers.ComputersPages;
import Pages.Computers.DesktopsPage;
import Pages.Forms.HomePage;
import ShareData.Hooks;
import org.testng.annotations.Test;

public class ComputersDesktops extends Hooks {

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
        homePage.clickComputers();
//
//        WebElement Computers=driver.findElement(By.cssSelector("a[href='/computers']"));
//        Computers.click();

        ComputersPages computersPages=new ComputersPages(getDriver());
        computersPages.clickDesktops();

//        WebElement Desktops= driver.findElement(By.linkText("Desktops"));
//        Desktops.click();

//        WebElement Build_your_own_computer= driver.findElement(By.cssSelector("a[href='/build-your-own-computer']"));
//        Build_your_own_computer.click();

        DesktopsPage desktopsPage=new DesktopsPage(getDriver());
        desktopsPage.interractClickDigitalCustomPerformancePC();

//        WebElement DigitalCustomPerformancePC= driver.findElement(By.cssSelector("a[href='/digital-storm-vanquish-3-custom-performance-pc']"));
//        DigitalCustomPerformancePC.click();

        desktopsPage.interractClickAddToCartPc();

//        WebElement AddToCartPC= driver.findElement(By.cssSelector("button[id='add-to-cart-button-2']"));
//        AddToCartPC.click();


    }
}
