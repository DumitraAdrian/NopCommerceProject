package Pages.GiftCards;
import Logger.LoggerUtility;
import ObjectData.GiftCardObject;
import ObjectData.RegisterObject;
import Pages.Forms.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCardsPage extends BasePage {
    public GiftCardsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "a[href='/100-physical-gift-card']")
    private WebElement Card;
    @FindBy(css = "input[class='recipient-name']")
    private  WebElement RecipientName;
    @FindBy(css = "input[class='sender-name']")
    private WebElement YourName;
    @FindBy(css = "button[id='add-to-cart-button-45']")
    private WebElement AddToCartCard;
    public void interractGiftCards(GiftCardObject giftCardObject) {
        interractClickCard();
        interractRecipientName(giftCardObject.getRecipientName());
        interractYourName(giftCardObject.getYourName());
        interractAddToCartCard();

    }
    public void interractClickCard(){
        Card.click();
        LoggerUtility.info("The user click card");
    }
    public void interractRecipientName(String RecipientNameValue){
//        RecipientName.sendKeys(RecipientNamevalue);
////        elementsMethods.fillElement(email,emailValue);
        giftCardMethods.fillElement(RecipientName,RecipientNameValue);
        LoggerUtility.info("The user type recipient name" +RecipientNameValue);
    }
    public void interractYourName(String YourNameValue){
//        YourName.sendKeys(value);
        giftCardMethods.fillElement(YourName,YourNameValue);
        LoggerUtility.info("The user type his name" +YourNameValue);
    }
    public void interractAddToCartCard(){
        giftCardMethods.clickElement(AddToCartCard);
        LoggerUtility.info("The user click add to cart card");
    }
}
