package Pages.Forms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage  {
        public WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }
    @FindBy(css = "a[hrdf='/jewelry']")
    public WebElement Jewelry;

    @FindBy(css = "a[href='/gift-cards']")
    public WebElement GiftCards;
    @FindBy(css = "a[href='/electronics']")
    public WebElement Electronics;
    @FindBy(css = "a[href='/computers']")
    public WebElement Computers;
    @FindBy(css = "a[href='/books']")
    public WebElement Books;
    @FindBy(css = "a[href='/apparel']")
    public WebElement Apparel;

    @FindBy(css = "a[class='ico-register']")
    public WebElement HomeRegister;
    @FindBy(css = "a[class='ico-login']")
    public WebElement Login;
    @FindBy(id = "add-to-cart-button-4")
    public WebElement AddTocartApple;

    public void clickJewelry(){
        Jewelry.click();
    }
    public void clickGiftCards(){
        GiftCards.click();
    }
    public void clickElectronics(){
        Electronics.click();
    }
    public void clickComputers(){
        Computers.click();
    }
    public void clickBooks(){
        Books.click();
    }
    public void clickApparel(){
        Apparel.click();
    }
    public void clickHomePageRegister(){
        HomeRegister.click();
    }
    public void clickHomePageLogin(){
        Login.click();
    }

}
