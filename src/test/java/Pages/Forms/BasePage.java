package Pages.Forms;


import HelpMethods.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    public WebDriver driver;
    public ElectronicsMethods electronicsMethods;
    public ComputersMethods computersMethods;
    public ApparelMethods apparelMethods;
    public BooksMethods booksMethods;
    public GiftCardMethods giftCardMethods;
    public LoginMethods loginMethods;
    public RegisterMethods registerMethods;
    public ElementMethods elementMethods;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        electronicsMethods = new ElectronicsMethods(driver);
        computersMethods = new ComputersMethods(driver);
        apparelMethods = new ApparelMethods(driver);
        booksMethods = new BooksMethods(driver);
        giftCardMethods = new GiftCardMethods(driver);
        loginMethods = new LoginMethods(driver);
        registerMethods = new RegisterMethods(driver);
        elementMethods=new ElementMethods(driver);

    }
    public WebElement find(By locator){
        return driver.findElement(locator);
    }
    public void click(By locator){
        find(locator).click();
    }
    public void type(String text ,By locator){
        find(locator).clear();
        find(locator).sendKeys(text);
    }
    public void hover(WebElement locator){
        Actions hover = new Actions(driver) ;
        hover.moveToElement(locator).perform();
    }
    public void scroll(){
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0,450)");
    }
    public void explicitWait(){
        WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
    }
}

