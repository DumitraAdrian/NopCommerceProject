package ShareData.Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;
import java.util.HashMap;

public class FirefoxBrowserService  extends BaseBrowserService implements BrowserService {
    private WebDriver driver;
    @Override
    public void openBrowser(Boolean cicd) {
        FirefoxOptions firefoxOptions= (FirefoxOptions) prepareBrowserOption(cicd);
        driver = new FirefoxDriver(firefoxOptions);
        driver.get(getBrowserOptions().get("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Override
    public void closeBrowser() {
        driver.quit();
    }
    @Override
    public Object prepareBrowserOption(Boolean cicd) {
        HashMap<String,String> testData = getBrowserOptions();
        FirefoxOptions firefoxOptions =new FirefoxOptions();
        if (cicd){
            firefoxOptions.addArguments("--headless");
        }if(!testData.get("headless").isEmpty()){
            firefoxOptions.addArguments(testData.get("headless"));
        }

        firefoxOptions.addArguments(testData.get("gpu"));
        firefoxOptions.addArguments(testData.get("infobars"));
        firefoxOptions.addArguments(testData.get("sandbox"));
        firefoxOptions.addArguments(testData.get("resolution"));
        return firefoxOptions;
    }
    public WebDriver getDriver() {
        return driver;
    }
}
