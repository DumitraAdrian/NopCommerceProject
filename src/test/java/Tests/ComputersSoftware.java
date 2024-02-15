package Tests;

import Pages.Computers.ComputersPages;
import Pages.Computers.SoftwarePage;
import Pages.Forms.HomePage;
import ShareData.Hooks;
import org.testng.annotations.Test;

public class ComputersSoftware extends Hooks {
    @Test

    public void metodatest() {

        HomePage homePage=new HomePage(getDriver());
        homePage.clickComputers();

        ComputersPages computersPages=new ComputersPages(getDriver());
        computersPages.clickSoftware();

        SoftwarePage softwarePage=new SoftwarePage(getDriver());
        softwarePage.interractClickWindows();
        softwarePage.interractClickAAddToCartWindows();

    }
}