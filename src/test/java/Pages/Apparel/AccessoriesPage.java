package Pages.Apparel;
import Logger.LoggerUtility;
import Pages.Forms.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccessoriesPage extends BasePage {
    public AccessoriesPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "a[href='/ray-ban-aviator-sunglasses']")
    private WebElement Sunglass;
    @FindBy(css = "button[id='add-to-cart-button-33']")
    private  WebElement AddToCartSunglass;
    public void InterractClickSunglass(){
        apparelMethods.clickElement(Sunglass);
        LoggerUtility.info("The user click Sunglass");
    }
    public void InterractAddToCartSunglass(){
        apparelMethods.clickElement(AddToCartSunglass);
        LoggerUtility.info("The user click add to cart Sunglass");
    }
}
