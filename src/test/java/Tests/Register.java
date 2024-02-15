package Tests;

import ObjectData.RegisterObject;
import Pages.Forms.HomePage;
import Pages.Register.RegisterPage;
import ShareData.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Register extends Hooks {

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

//        RegisterObject registerObject=new RegisterObject(testData);

        HomePage homePage=new HomePage(getDriver());
        homePage.clickHomePageRegister();

//        WebElement HomeRegister=driver.findElement(By.cssSelector("a[class='ico-register']"));
//        HomeRegister.click();

        RegisterPage registerPage=new RegisterPage(getDriver());
        registerPage.interractClickGender();
        registerPage.interractFirstname("Dumitra");
        registerPage.interractLastName("Adrian");
        registerPage.interractDate_of_birth_Day("15");
        registerPage.interractDate_of_birth_Month("December");
        registerPage.interractDate_of_birth_Year("1992");
        registerPage.interractEmail("adrian.danyel7@gmail.com");
        registerPage.interractCompanyName("nopCommerce");
        registerPage.interractPassword("123456");
        registerPage.interractConfirmPassword("123456");
        registerPage.interractClickRegister();
        registerPage.interractClickRegisterContinue();

//
//        WebElement Gender=driver.findElement(By.cssSelector("input[value='M']"));
//        Gender.click();
//
//        WebElement FirstName=driver.findElement(By.cssSelector("input[id='FirstName']"));
//        String First_Name_Value="Dumitra";
//        FirstName.sendKeys(First_Name_Value);
//
//        WebElement LastName=driver.findElement(By.cssSelector("input[id='LastName']"));
//        String LastNamevalue="Adrian Daniel";
//        LastName.sendKeys(LastNamevalue);
//
//        WebElement Date_of_birth_Day=driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
//        Date_of_birth_Day.click();
//        Select DayDropdown=new Select(Date_of_birth_Day);
//        DayDropdown.selectByValue("15");
//
//        WebElement Date_of_birth_Month=driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
//        Date_of_birth_Month.click();
//        Select MonthDropdown=new Select(Date_of_birth_Month);
//        MonthDropdown.selectByVisibleText("December");
//
//        WebElement Date_of_birth_Year=driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
//        Date_of_birth_Year.click();
//        Select YearDropdown=new Select(Date_of_birth_Year);
//        YearDropdown.selectByValue("1992");
//
//        WebElement Email=driver.findElement(By.cssSelector("input[id='Email']"));
//        String  Email_Value="adrian.danyel20@gmail.com";
//        Email.sendKeys(Email_Value);
//
//        WebElement CompanyName=driver.findElement(By.cssSelector("input[id='Company']"));
//        String CompanyValue="nopCommerce";
//        CompanyName.sendKeys(CompanyValue);
//
//        WebElement Password=driver.findElement(By.cssSelector("input[id='Password']"));
//        String Password_value="123456";
//        Password.sendKeys(Password_value);
//
//        WebElement ConfirmPassword= driver.findElement(By.cssSelector("input[id='ConfirmPassword']"));
//        String Confirm_password_value="123456";
//        ConfirmPassword.sendKeys(Confirm_password_value);
//
//        WebElement Register= driver.findElement(By.cssSelector("button[id='register-button']"));
//        Register.click();
//
//        WebElement RegisterContinue= driver.findElement(By.cssSelector("a[class='button-1 register-continue-button']"));
//        RegisterContinue.click();


    }

}
