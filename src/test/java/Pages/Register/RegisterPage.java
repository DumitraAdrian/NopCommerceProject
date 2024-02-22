package Pages.Register;
import Logger.LoggerUtility;
import Pages.Forms.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[value='M']")
    private WebElement Gender;
    @FindBy(css = "input[id='FirstName']")
    private WebElement FirstName;
    @FindBy(css = "input[id='LastName']")
    private WebElement LastName;
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    private WebElement Date_of_birth_Day;
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    private WebElement Date_of_birth_Month;
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    private WebElement Date_of_birth_Year;
    @FindBy(css = "input[id='Email']")
    private WebElement Email;
    @FindBy(css = "input[id='Company']")
    private WebElement CompanyName;
    @FindBy(css = "input[id='Password']")
    private WebElement Password;
    @FindBy(css = "input[id='ConfirmPassword']")
    private WebElement ConfirmPassword;
    @FindBy(css = "button[id='register-button']")
    private WebElement Register;
    @FindBy(css = "a[class='button-1 register-continue-button']")
    private WebElement RegisterContinue;


    public void interractClickGender() {
        registerMethods.clickElement(Gender);
        LoggerUtility.info("The user select gender");
    }

    public boolean interractFirstname(String FirstNameValue) {
        registerMethods.fillElement(FirstName, FirstNameValue);
        LoggerUtility.info("The user type first name" );
        return false;
    }

    public void interractLastName(String LastNameValue) {
        registerMethods.fillElement(LastName, LastNameValue);
        LoggerUtility.info("The user type last name" );
    }

    public void interractDate_of_birth_Day(String value) {
        registerMethods.clickElement(Date_of_birth_Day);
        Select DayDropdown = new Select(Date_of_birth_Day);
        DayDropdown.selectByValue(value);
        LoggerUtility.info("The user select date of birth day");
    }

    public void interractDate_of_birth_Month(String value) {
        registerMethods.clickElement(Date_of_birth_Month);
        Select MonthDropdown = new Select(Date_of_birth_Month);
        MonthDropdown.selectByVisibleText(value);
        LoggerUtility.info("The user select date of birth month");
    }

    public void interractDate_of_birth_Year(String value) {
        registerMethods.clickElement(Date_of_birth_Year);
        Select YearDropdown = new Select(Date_of_birth_Year);
        YearDropdown.selectByValue(value);
        LoggerUtility.info("The user select date of birth year");
    }

    public void interractEmail(String EmailValue) {
        registerMethods.fillElement(Email, EmailValue);
        LoggerUtility.info("The user type email" );
    }

    public void interractCompanyName(String CompanyNameValue) {
        registerMethods.fillElement(CompanyName, CompanyNameValue);
        LoggerUtility.info("The user type company name" );
    }

    public void interractPassword(String PasswordValue) {
        registerMethods.fillElement(Password, PasswordValue);
        LoggerUtility.info("The user type password" );
    }

    public void interractConfirmPassword(String ConfirmPasswordValue) {
        registerMethods.fillElement(ConfirmPassword, ConfirmPasswordValue);
        LoggerUtility.info("The user Confirm Password" );
    }

    public void interractClickRegister() {
        registerMethods.clickElement(Register);
        LoggerUtility.info("The user click register");
    }

    public void interractClickRegisterContinue() {
        registerMethods.clickElement(RegisterContinue);
        LoggerUtility.info("The user click register continue");
    }
}



