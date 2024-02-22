package Pages.Forms;

import Logger.LoggerUtility;
import Pages.SearchPage.SearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
        public WebDriver driver;

    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "a[href='/gift-cards']")
    private WebElement GiftCards;
    @FindBy(css = "a[href='/electronics']")
    private WebElement Electronics;
    @FindBy(css = "a[href='/computers']")
    private WebElement Computers;
    @FindBy(css = "a[href='/books']")
    private WebElement Books;
    @FindBy(css = "a[href='/apparel']")
    private WebElement Apparel;

    @FindBy(css = "a[class='ico-register']")
    private WebElement HomeRegister;
    @FindBy(css = "a[class='ico-login']")
    private WebElement Login;
    @FindBy(id = "add-to-cart-button-4")
    private WebElement AddTocartApple;
    private By searchBox = By.id("small-searchterms");
    private  By searchButton = By.className("search-box-button");

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
    public SearchPage searchItem(String searchText) {
        type(searchText, searchBox);
        LoggerUtility.info("The user search item:");
        click( searchButton);
        LoggerUtility.info("The user click search Button:");
        return new SearchPage(driver);
    }
}
