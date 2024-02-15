package Tests;

import Pages.Computers.ComputersPages;
import Pages.Computers.NotebooksPage;
import Pages.Forms.HomePage;
import ShareData.Hooks;
import org.testng.annotations.Test;

public class ComputersNotebooks extends Hooks {
    @Test

    public void metodatest() {

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