package Tests;

import Pages.Electronics.CellphonesPage;
import Pages.Electronics.ElectronicsPages;
import Pages.Forms.HomePage;
import ShareData.Hooks;
import org.testng.annotations.Test;

public class ElectronicsCellphones extends Hooks {
    @Test

    public void metodatest() {

        HomePage homePage=new HomePage(getDriver());
        homePage.clickElectronics();

        ElectronicsPages electronicsPages=new ElectronicsPages(getDriver());
        electronicsPages.clickCellPhones();
        CellphonesPage cellphonesPage=new CellphonesPage(getDriver());
        cellphonesPage.interractClickHtcPhone();
        cellphonesPage.interractClickAddToCartHtcPhone();

    }
}
