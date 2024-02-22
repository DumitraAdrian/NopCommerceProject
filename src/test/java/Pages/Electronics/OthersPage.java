package Pages.Electronics;

import Logger.LoggerUtility;
import Pages.Forms.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OthersPage extends BasePage {

public OthersPage(WebDriver driver) {
    super(driver);
}
    @FindBy(css = "a[href='/portable-sound-speakers']")
    private WebElement PortableSoundSpeakers;
    @FindBy(css = "button[id='add-to-cart-button-23']")
    private WebElement AddToCartPortableSoundSpeakers;
    public void interractClickPortableSoundSpeakers(){
//        PortableSoundSpeakers.click();
        electronicsMethods.clickElectronics(PortableSoundSpeakers);
        LoggerUtility.info("The user click Portable Sound Speakers ");
    }
    public void interractClickAddToCartPortableSoundSpeakers(){
//        AddToCartPortableSoundSpeakers.click();
        electronicsMethods.clickElectronics(AddToCartPortableSoundSpeakers);
        LoggerUtility.info("The user click add to cart Portable Sound Speakers ");
    }
}
