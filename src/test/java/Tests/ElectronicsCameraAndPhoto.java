package Tests;

import Pages.Electronics.CameraAndPhotoPage;
import Pages.Electronics.ElectronicsPages;
import Pages.Forms.HomePage;
import ShareData.Hooks;
import org.testng.annotations.Test;

public class ElectronicsCameraAndPhoto extends Hooks {

    @Test

    public void metodatest() {
//        EdgeOptions options = new EdgeOptions();
//        options.addArguments("--window-size=1920,1080");
//        driver = new EdgeDriver(options);
//
//        driver.get("https://demo.nopcommerce.com/");
//        driver.manage().window().maximize();
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript("window.scrollBy(0,450)");

        HomePage homePage=new HomePage(getDriver());
        homePage.clickElectronics();

//        WebElement Electronics= driver.findElement(By.cssSelector("a[href='/electronics']"));
//        Electronics.click();

        ElectronicsPages electronicsPages=new ElectronicsPages(getDriver());
        electronicsPages.clickOnCameraAndPhoto();

//        WebElement CameraAndPhoto= driver.findElement(By.linkText("Camera & photo"));
//        CameraAndPhoto.click();

        CameraAndPhotoPage cameraAndPhotoPage=new CameraAndPhotoPage(getDriver());
        cameraAndPhotoPage.interractClickLeicaDigitalCamera();

//        WebElement LeicaDigitalCamera= driver.findElement(By.cssSelector("a[href='/leica-t-mirrorless-digital-camera']"));
//        LeicaDigitalCamera.click();

        cameraAndPhotoPage.interractClickAddToCartLeicaDigitalCamera();

//        WebElement AddToCartLeicaDigitalCamera= driver.findElement(By.cssSelector("button[id='add-to-cart-button-16']"));
//        AddToCartLeicaDigitalCamera.click();

    }
}
