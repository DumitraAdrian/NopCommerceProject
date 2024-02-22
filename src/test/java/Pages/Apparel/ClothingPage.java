package Pages.Apparel;
import Logger.LoggerUtility;
import Pages.Forms.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClothingPage extends BasePage {
    public ClothingPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "a[href='/levis-511-jeans']")
    private WebElement Jeans;
    @FindBy(css = "button[id='add-to-cart-button-30']")
    private WebElement AddToCartJeans;
    public void interractClickJeans(){
        apparelMethods.clickElement(Jeans);
        LoggerUtility.info("The user click Jeans");
    }
    public void interractAddToCartJeans(){
        apparelMethods.clickElement(AddToCartJeans);
        LoggerUtility.info("The user click add to cart Jeans");
    }
}
