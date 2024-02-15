package Tests;

import Pages.Computers.ComputersPages;
import Pages.Computers.SoftwarePage;
import Pages.Forms.HomePage;
import ShareData.Hooks;
import org.testng.annotations.Test;

public class ComputersSoftware extends Hooks {

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

//        WebElement Computers = driver.findElement(By.cssSelector("a[href='/computers']"));
//        Computers.click();

        ComputersPages computersPages=new ComputersPages(getDriver());
        computersPages.clickSoftware();

//        WebElement Software = driver.findElement(By.linkText("Software"));
//        Software.click();

        SoftwarePage softwarePage=new SoftwarePage(getDriver());
        softwarePage.interractClickWindows();

//        WebElement Windwos= driver.findElement(By.cssSelector("a[href='/windows-8-pro']"));
//        Windwos.click();

        softwarePage.interractClickAAddToCartWindows();

//        WebElement AddToCartWindows=driver.findElement(By.cssSelector("button[id='add-to-cart-button-11']"));
//       AddToCartWindows.click();

    }
}