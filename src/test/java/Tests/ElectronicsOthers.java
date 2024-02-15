package Tests;

import Pages.Electronics.ElectronicsPages;
import Pages.Electronics.OthersPage;
import Pages.Forms.HomePage;
import ShareData.Hooks;
import org.testng.annotations.Test;

public class ElectronicsOthers extends Hooks {
    @Test

    public void metodatest() {

        HomePage homePage=new HomePage(getDriver());
        homePage.clickElectronics();

        ElectronicsPages electronicsPages=new ElectronicsPages(getDriver());
        electronicsPages.clickOthers();
        OthersPage othersPage=new OthersPage(getDriver());
        othersPage.interractClickPortableSoundSpeakers();
        othersPage.interractClickAddToCartPortableSoundSpeakers();

    }
}
