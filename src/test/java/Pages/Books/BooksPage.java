package Pages.Books;
import Logger.LoggerUtility;
import Pages.Forms.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksPage extends BasePage {
    public BooksPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "a[href='/pride-and-prejudice']")
    public WebElement PrideAndPrejudice;
    @FindBy(css = "button[id='add-to-cart-button-39']")
    public WebElement AddToCartBook;

    public void interractClickPrideAndPrejudice(){
        booksMethods.clickElement(PrideAndPrejudice);
        LoggerUtility.info("The user click Pride And Prejudice book");
    }
    public void interractClickAddToCartBook(){
        booksMethods.clickElement(AddToCartBook);
        LoggerUtility.info("The user click add to cart book");
    }
}
