package Tests;

import Pages.Forms.HomePage;
import Pages.Login.LoginPage;
import ShareData.Hooks;
import org.testng.annotations.Test;

public class Login extends Hooks {

    @Test

    public void metodatest() {
//        EdgeOptions options = new EdgeOptions();
//        options.addArguments("--window-size=1920,1080");
//        driver = new EdgeDriver(options);
//
//        driver.get("https://demo.nopcommerce.com/");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript("window.scrollBy(0,450)");

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