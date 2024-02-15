package Pages.Electronics;

import Logger.LoggerUtility;
import Pages.Forms.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CameraAndPhotoPage extends BasePage {
public CameraAndPhotoPage(WebDriver driver) {
    super(driver);
}

    @FindBy(css = "a[href='/leica-t-mirrorless-digital-camera']")
    public WebElement LeicaDigitalCamera;
    @FindBy(css = "button[id='add-to-cart-button-16']")
    public WebElement AddToCartLeicaDigitalCamera;

    public void interractClickLeicaDigitalCamera(){
        electronicsMethods.clickElectronics(LeicaDigitalCamera);
        LoggerUtility.info("The user click Leica Digital Camera ");

    }
    public void interractClickAddToCartLeicaDigitalCamera(){
        electronicsMethods.clickElectronics(AddToCartLeicaDigitalCamera);
//        AddToCartLeicaDigitalCamera.click();
        LoggerUtility.info("The user click add to cart Leica Digital Camera ");
    }
}
