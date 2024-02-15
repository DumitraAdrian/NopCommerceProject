package ShareData;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class ShareData {

   public WebDriver driver;

    public void setup(){

        EdgeOptions options = new EdgeOptions();
        options.addArguments("--window-size=1920,1080");
        driver = new EdgeDriver(options);

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,450)");
    }
    public void clear(){
        driver.quit();
    }
    public WebDriver getDriver() {
       return driver;
    }
}
