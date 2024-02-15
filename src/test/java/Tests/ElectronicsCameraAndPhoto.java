package Tests;

import Pages.Electronics.CameraAndPhotoPage;
import Pages.Electronics.ElectronicsPages;
import Pages.Forms.HomePage;
import ShareData.Hooks;
import org.testng.annotations.Test;

public class ElectronicsCameraAndPhoto extends Hooks {
    @Test

    public void metodatest() {

        HomePage homePage=new HomePage(getDriver());
        homePage.clickElectronics();

        ElectronicsPages electronicsPages=new ElectronicsPages(getDriver());
        electronicsPages.clickOnCameraAndPhoto();

        CameraAndPhotoPage cameraAndPhotoPage=new CameraAndPhotoPage(getDriver());
        cameraAndPhotoPage.interractClickLeicaDigitalCamera();
        cameraAndPhotoPage.interractClickAddToCartLeicaDigitalCamera();

    }
}
