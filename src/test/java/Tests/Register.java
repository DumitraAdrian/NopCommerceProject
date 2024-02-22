package Tests;

import HelpMethods.ElementMethods;
import ObjectData.RegisterObject;
import Pages.Forms.HomePage;
import Pages.Register.RegisterPage;
import ShareData.Hooks;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Register extends Hooks {
    @Test

    public void metodatest() {
        RegisterObject registerObject=new RegisterObject(testData);

        HomePage homePage=new HomePage(getDriver());
        homePage.clickHomePageRegister();

        RegisterPage registerPage=new RegisterPage(getDriver());
        registerPage.interractClickGender();
        registerPage.interractFirstname("Dumitra");
        registerPage.interractLastName("Adrian");
        registerPage.interractDate_of_birth_Day("15");
        registerPage.interractDate_of_birth_Month("December");
        registerPage.interractDate_of_birth_Year("1992");
        registerPage.interractEmail("adrian.danyel22@gmail.com");
        registerPage.interractCompanyName("nopCommerce");
        registerPage.interractPassword("123456");
        registerPage.interractConfirmPassword("123456");
        registerPage.interractClickRegister();
        registerPage.interractClickRegisterContinue();

    }

}
