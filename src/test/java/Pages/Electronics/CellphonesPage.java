package Pages.Electronics;
import Logger.LoggerUtility;
import Pages.Forms.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellphonesPage extends BasePage {
public CellphonesPage(WebDriver driver) {
    super(driver);
}
    @FindBy(css = "a[href='/htc-one-m8-android-l-50-lollipop']")
    public WebElement HtcPhone;
    @FindBy(css = "button[id='add-to-cart-button-18']")
    public  WebElement AddToCartHtcPhone;

    public void interractClickHtcPhone(){
        electronicsMethods.clickElectronics(HtcPhone);
//        HtcPhone.click();
        LoggerUtility.info("The user click HtcPhone ");
    }
    public void interractClickAddToCartHtcPhone(){
//        AddToCartHtcPhone.click();
        electronicsMethods.clickElectronics(AddToCartHtcPhone);
        LoggerUtility.info("The user click add to cart Htc Phone ");
    }
}
