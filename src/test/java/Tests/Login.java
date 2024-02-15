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

//        WebElement Login = driver.findElement(By.cssSelector("a[class='ico-login']"));
//        Login.click();

        LoginPage loginPage=new LoginPage(getDriver());
        loginPage.interractEmail("adrian.danyel7@gmail.com");

//        WebElement Email=driver.findElement(By.cssSelector("input[id='Email']"));
//        String  Email_Value="adrian.danyel90@gmail.com";
//        Email.sendKeys(Email_Value);

        loginPage.interractPassword("123456");

//        WebElement Password=driver.findElement(By.cssSelector("input[id='Password']"));
//        String Password_value="123456";
//        Password.sendKeys(Password_value);

        loginPage.interractClickRememberMe();

//        WebElement RememberMe= driver.findElement(By.cssSelector("input[id='RememberMe']"));
//        RememberMe.click();

        loginPage.interractClickLogIn();

//        WebElement Login= driver.findElement(By.cssSelector("button[class='button-1 login-button']"));
//        Login.click();
    }

}