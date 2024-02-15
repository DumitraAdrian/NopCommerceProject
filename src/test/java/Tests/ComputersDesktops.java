package Tests;

import Pages.Computers.ComputersPages;
import Pages.Computers.DesktopsPage;
import Pages.Forms.HomePage;
import ShareData.Hooks;
import org.testng.annotations.Test;

public class ComputersDesktops extends Hooks {
    @Test

    public void metodatest() {

        HomePage homePage=new HomePage(getDriver());
        homePage.clickComputers();

        ComputersPages computersPages=new ComputersPages(getDriver());
        computersPages.clickDesktops();

        DesktopsPage desktopsPage=new DesktopsPage(getDriver());
        desktopsPage.interractClickDigitalCustomPerformancePC();
        desktopsPage.interractClickAddToCartPc();
    }
}
