package Pages.Apparel;
import Logger.LoggerUtility;
import Pages.Forms.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoesPage extends BasePage {
    public ShoesPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "a[href='/nike-floral-roshe-customized-running-shoes']")
    private WebElement Nike;
    @FindBy(css = "select[id='product_attribute_6']")
    private  WebElement SelectSize;
    @FindBy(css = "button[id='add-to-cart-button-24']")
    private WebElement AddToCartNike;
    public void interractClickNike(){
        apparelMethods.clickElement(Nike);
        LoggerUtility.info("The user click Nike");
    }
    public void interractClickSelectSize(){
        apparelMethods.clickElement(SelectSize);
        LoggerUtility.info("The user click select size");
    }
    public void interractClickAddToCartNike(){
        apparelMethods.clickElement(AddToCartNike);
        LoggerUtility.info("The user click add to cart Nike");
    }
}
