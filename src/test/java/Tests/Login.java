package Tests;

import Pages.Forms.HomePage;
import Pages.Login.LoginPage;
import ShareData.Hooks;
import org.testng.annotations.Test;

public class Login extends Hooks {
    @Test

    public void metodatest() {

        HomePage homePage=new HomePage(getDriver());
        homePage.clickHomePageLogin();

        LoginPage loginPage=new LoginPage(getDriver());
        loginPage.interractEmail("adrian.danyel7@gmail.com");
        loginPage.interractPassword("123456");
        loginPage.interractClickRememberMe();
        loginPage.interractClickLogIn();

    }

}