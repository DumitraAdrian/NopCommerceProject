package HelpMethods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterMethods {
    private WebDriver driver;
    public RegisterMethods(WebDriver driver){
        this.driver=driver;
    }
    public void WaitVisibleElement(WebElement element){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));

    }
    public void clickElement(WebElement element){
        WaitVisibleElement(element);
        element.click();

    }
    public void fillElement(WebElement element,String value){
        WaitVisibleElement(element);
        element.sendKeys(value);

    }
    public void fillElement(WebElement element, String value, Keys keyboardPress){
        WaitVisibleElement(element);
        element.sendKeys(value);
        element.sendKeys(keyboardPress);

    }

}



