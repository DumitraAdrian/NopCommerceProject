package Pages.SearchPage;

import Logger.LoggerUtility;
import Pages.Forms.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage extends BasePage {
    private By productName=By.className("product-name");
    private By addToCartBtn=By.id("add-to-cart-button-4");
    private By productQuantityField=By.id("product_enteredQuantity_4");
    private By notification = By.id("bar-notification");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public String getProductName(){
//        LoggerUtility.info("The user get product name:" +productName);
        return find(productName).getText();
    }
    public void addToCart(){
        click(addToCartBtn);
        LoggerUtility.info("The user click add to cart button:" );
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(notification));

    }
    public void setProductQuantity(String quantity){
        type(quantity,  productQuantityField);
        LoggerUtility.info("The user set product quantity:");
    }
}