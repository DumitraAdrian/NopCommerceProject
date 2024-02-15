package Pages.Apparel;
import Logger.LoggerUtility;
import Pages.Forms.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApparelAllPage extends BasePage {
    public ApparelAllPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(linkText = "Accessories")
    public WebElement Accessories;
    @FindBy(linkText = "Clothing")
    public WebElement Clothing;
    @FindBy(linkText = "Shoes")
    public WebElement Shoes;
    public void clickAccessories(){
        apparelMethods.clickElement(Accessories);
        LoggerUtility.info("The user click Accessories");
    }
    public void clickClothing(){
        apparelMethods.clickElement(Clothing);
        LoggerUtility.info("The user click Clothing");
    }
    public void clickShoes(){
        apparelMethods.clickElement(Shoes);
        LoggerUtility.info("The user click Shoes");
    }
}
