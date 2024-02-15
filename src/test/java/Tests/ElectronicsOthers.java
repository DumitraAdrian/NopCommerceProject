package Tests;

import Pages.Electronics.ElectronicsPages;
import Pages.Electronics.OthersPage;
import Pages.Forms.HomePage;
import ShareData.Hooks;
import org.testng.annotations.Test;

public class ElectronicsOthers extends Hooks {

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

//        WebElement Electronics = driver.findElement(By.cssSelector("a[href='/electronics']"));
//        Electronics.click();

        ElectronicsPages electronicsPages=new ElectronicsPages(getDriver());
        electronicsPages.clickOthers();


//        WebElement Others= driver.findElement(By.linkText("Others"));
//        Others.click();

        OthersPage othersPage=new OthersPage(getDriver());
        othersPage.interractClickPortableSoundSpeakers();

//        WebElement PortableSoundSpeakers= driver.findElement(By.cssSelector("a[href='/portable-sound-speakers']"));
//        PortableSoundSpeakers.click();

        othersPage.interractClickAddToCartPortableSoundSpeakers();

//        WebElement AddToCartPortableSoundSpeakers= driver.findElement(By.cssSelector("button[id='add-to-cart-button-23']"));
//        AddToCartPortableSoundSpeakers.click();
    }
}