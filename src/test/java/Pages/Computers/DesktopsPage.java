package Pages.Computers;
import Logger.LoggerUtility;
import Pages.Forms.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopsPage extends BasePage {
    public DesktopsPage(WebDriver driver) {
        super(driver);
    }
   @FindBy(css = "a[href='/digital-storm-vanquish-3-custom-performance-pc']")
    public WebElement DigitalCustomPerformancePC;
    @FindBy(css = "button[id='add-to-cart-button-2']")
    public  WebElement AddToCartPc;

    public void interractClickDigitalCustomPerformancePC(){
//        DigitalCustomPerformancePC.click();
        computersMethods.clickElement(DigitalCustomPerformancePC);
        LoggerUtility.info("The user click Digital Custom  Performance PC");
    }
    public void interractClickAddToCartPc(){
        computersMethods.clickElement(AddToCartPc);
        LoggerUtility.info("The user click add to cart Pc");

    }
}
