package Pages.Electronics;

import Logger.LoggerUtility;
import Pages.Forms.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPages extends BasePage {
//        public WebDriver driver;
//
//   ;
//        PageFactory.initElements(driver, this);
public ElectronicsPages(WebDriver driver) {
    super(driver);
}

    @FindBy(linkText = "Camera & photo")
    public WebElement CameraAndPhoto;
    @FindBy(linkText = "Cell phones")
    public WebElement CellPhones;
    @FindBy(linkText = "Others")
    public WebElement Others;

    public void clickOnCameraAndPhoto(){
//        CameraAndPhoto.click();
        electronicsMethods.clickElectronics(CameraAndPhoto);
        LoggerUtility.info("The user click  Camera And Photo ");
    }
    public void clickCellPhones(){
//        CellPhones.click();
        electronicsMethods.clickElectronics(CellPhones);
        LoggerUtility.info("The user click  Cell Phones ");
    }
    public void clickOthers(){
//        Others.click();
        electronicsMethods.clickElectronics(Others);
        LoggerUtility.info("The user click  Others ");
    }
}
