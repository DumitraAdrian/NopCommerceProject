package Pages.Computers;
import Logger.LoggerUtility;
import Pages.Forms.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SoftwarePage extends BasePage {
    public SoftwarePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "a[href='/windows-8-pro']")
    public WebElement Windwos;
    @FindBy(css = "button[id='add-to-cart-button-11']")
    public WebElement AddToCartWindows;

    public void interractClickWindows(){
//        Windwos.click();
        computersMethods.clickElement(Windwos);
        LoggerUtility.info("The user click Windwos");
    }
    public void interractClickAAddToCartWindows(){
        computersMethods.clickElement(AddToCartWindows);
        LoggerUtility.info("The user click add to cart Windwos");
    }
}
