package Tests;

import Pages.Forms.HomePage;
import Pages.GiftCards.GiftCardsPage;
import ShareData.Hooks;
import org.testng.annotations.Test;

public class GiftCards extends Hooks {
    @Test

    public void metodatest() {

        HomePage homePage=new HomePage(getDriver());
        homePage.clickGiftCards();

        GiftCardsPage giftCardsPage=new GiftCardsPage(getDriver());
        giftCardsPage.interractClickCard();
        giftCardsPage.interractRecipientName("Nike");
        giftCardsPage.interractYourName("Dumitra Adrian");
        giftCardsPage.interractAddToCartCard();

    }
}
