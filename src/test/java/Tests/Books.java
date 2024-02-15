package Tests;

import Pages.Books.BooksPage;
import Pages.Forms.HomePage;
import ShareData.Hooks;
import org.testng.annotations.Test;

public class Books extends Hooks {

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
        homePage.clickBooks();

//        WebElement Books= driver.findElement(By.cssSelector("a[href='/books']"));
//        Books.click();

        BooksPage booksPage=new BooksPage(getDriver());
        booksPage.interractClickPrideAndPrejudice();

//        WebElement PrideAndPrejudice= driver.findElement(By.cssSelector("a[href='/pride-and-prejudice']"));
//        PrideAndPrejudice.click();

        booksPage.interractClickAddToCartBook();

//        WebElement AddToCartBook= driver.findElement(By.cssSelector("button[id='add-to-cart-button-39']"));
//        AddToCartBook.click();
    }
}
