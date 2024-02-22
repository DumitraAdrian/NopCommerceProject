package Pages.SearchPage;

import Logger.LoggerUtility;
import Pages.Forms.BasePage;
import org.openqa.selenium.*;


public class SearchPage extends BasePage {
    private By productName= By.className("product-title");
    private By itemCards=By.className("product-item");
    private By itemLinks = By.className("picture");

    public SearchPage(WebDriver driver){
        super(driver);
    }
//    @FindBy(className = "product-title")
//    private WebElement productName;
//    @FindBy(className = "product-item")
//    private WebElement itemCards;
//    @FindBy(className = "picture")
//    private WebElement itemLinks;

    public Boolean searchForItemName(String search){
        LoggerUtility.info("The user search for item name:");
        var items =   driver.findElements( productName);
        for(WebElement item: items){
            if (item.getText().contains(search)){
                return true;
            }
        }
        return false;
    }
    public boolean isItemsDisplayed(){
        LoggerUtility.info("The Items Displayed:");
        return find(itemCards).isDisplayed();
    }
    public ProductPage navToProduct() {
        driver.findElement( itemLinks).click();
        LoggerUtility.info("The user click product :");
        return new ProductPage(driver);
    }
}

