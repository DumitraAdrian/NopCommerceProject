package Tests;

import Pages.Forms.HomePage;
import Pages.GiftCards.GiftCardsPage;
import ShareData.Hooks;
import org.testng.annotations.Test;

public class GiftCards extends Hooks {

    @Test

    public void metodatest() {
//        EdgeOptions options = new EdgeOptions();
//        options.addArguments("--window-size=1920,1080");
//        driver = new EdgeDriver(options);
//
//        driver.get("https://demo.nopcommerce.com/");
//        driver.manage().window().maximize();
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript("window.scrollBy(0,450)");

        HomePage homePage=new HomePage(getDriver());
        homePage.clickGiftCards();

//        WebElement GiftCards= driver.findElement(By.cssSelector("a[href='/gift-cards']"));
//        GiftCards.click();

        GiftCardsPage giftCardsPage=new GiftCardsPage(getDriver());
        giftCardsPage.interractClickCard();

//        WebElement Card= driver.findElement(By.cssSelector("a[href='/100-physical-gift-card']"));
//        Card.click();

        giftCardsPage.interractRecipientName("Nike");

//        WebElement RecipientName= driver.findElement(By.cssSelector("input[class='recipient-name']"));
//        String RecipientName_Value="Nike";
//        RecipientName.sendKeys(RecipientName_Value);

        giftCardsPage.interractYourName("Dumitra Adrian");

//        WebElement YourName= driver.findElement(By.cssSelector("input[class='sender-name']"));
//        String YourName_value="Dumitra Adrian";
//        YourName.sendKeys(YourName_value);

        giftCardsPage.interractAddToCartCard();

//        WebElement AddToCartCard= driver.findElement(By.cssSelector("button[id='add-to-cart-button-45']"));
//        AddToCartCard.click();
    }
}
