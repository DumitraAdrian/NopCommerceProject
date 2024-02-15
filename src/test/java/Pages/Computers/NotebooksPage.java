package Pages.Computers;

import Logger.LoggerUtility;
import Pages.Forms.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotebooksPage extends BasePage {
public NotebooksPage(WebDriver driver) {
    super(driver);
}
    @FindBy(css = "a[href='/apple-macbook-pro-13-inch']")
    public WebElement AppleMacBook;
    @FindBy(css = "button[id='add-to-cart-button-4']")
    public WebElement AddToCartApple;
    @FindBy(css = "a[href='/asus-n551jk-xo076h-laptop']")
    public WebElement AsusLaptop;
    @FindBy(css = "button[id='add-to-cart-button-5']")
    public   WebElement AddToCartAsus;

    public void interractClickAppleMacBook(){
//        AppleMacBook.click();
        computersMethods.clickElement(AppleMacBook);
        LoggerUtility.info("The user click AppleMacBook");
    }
    public void interractClickAddToCartApple(){
        computersMethods.clickElement(AddToCartApple);
        LoggerUtility.info("The user click add to cart AppleMacBook");
    }
    public void interractClickAsusLaptop(){
        computersMethods.clickElement(AsusLaptop);
        LoggerUtility.info("The user click Asus Laptop");
    }
    public void interractClickAddToCartAsus(){
        computersMethods.clickElement(AddToCartAsus);
        LoggerUtility.info("The user click add to cart Asus Laptop");
    }
}
