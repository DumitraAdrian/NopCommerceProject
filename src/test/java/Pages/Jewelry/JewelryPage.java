package Pages.Jewelry;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JewelryPage {
        public WebDriver driver;

    public JewelryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }
    @FindBy(css = "a[href='/flower-girl-bracelet']")
    public WebElement Bratara;
    @FindBy(css = "button[id='add-to-cart-button-41']")
    public WebElement AddToCartBratara;

    public void interractClickBratara(){
        Bratara.click();
    }
    public void interractClickAddToCartBratara(){
        AddToCartBratara.click();
    }
}
