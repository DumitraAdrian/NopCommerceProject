package Tests;

import Pages.Computers.ComputersPages;
import Pages.Computers.NotebooksPage;
import Pages.Forms.HomePage;
import ShareData.Hooks;
import org.testng.annotations.Test;

public class ComputersNotebooks extends Hooks {

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

//        WebElement Computers=driver.findElement(By.cssSelector("a[href='/computers']"));
//        Computers.click();

        ComputersPages computersPages=new ComputersPages(getDriver());
        computersPages.clickNotebook();

//        WebElement Notebooks = driver.findElement(By.linkText("Notebooks"));
//        Notebooks.click();

        NotebooksPage notebooksPage=new NotebooksPage(getDriver());
        notebooksPage.interractClickAppleMacBook();

//        WebElement AppleMacBook= driver.findElement(By.cssSelector("a[href='/apple-macbook-pro-13-inch']"));
//        AppleMacBook.click();

        notebooksPage.interractClickAddToCartApple();

//        WebElement AddToCartApple= driver.findElement(By.cssSelector("button[id='add-to-cart-button-4']"));
//        AddToCartApple.click();

        notebooksPage.interractClickAsusLaptop();

//        WebElement AsusLaptop=driver.findElement(By.cssSelector("a[href='/asus-n551jk-xo076h-laptop']"));
//        AsusLaptop.click();

        notebooksPage.interractClickAddToCartAsus();

//        WebElement AddToCartAsus= driver.findElement(By.cssSelector("button[id='add-to-cart-button-5']"));
//        AddToCartAsus.click();

    }
}