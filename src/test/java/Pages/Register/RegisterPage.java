package Pages.Register;
import Logger.LoggerUtility;
import ObjectData.RegisterObject;
import Pages.Forms.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends BasePage {
    public RegisterPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "input[value='M']")
    public WebElement Gender;
    @FindBy(css = "input[id='FirstName']")
    public  WebElement FirstName;
    @FindBy(css = "input[id='LastName']")
    public WebElement LastName;
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    public WebElement Date_of_birth_Day;
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    public  WebElement Date_of_birth_Month;
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    public WebElement Date_of_birth_Year;
    @FindBy(css = "input[id='Email']")
    public WebElement Email;
    @FindBy(css = "input[id='Company']")
    public  WebElement CompanyName;
    @FindBy(css = "input[id='Password']")
    public WebElement Password;
    @FindBy(css = "input[id='ConfirmPassword']")
    public WebElement ConfirmPassword;
    @FindBy(css = "button[id='register-button']")
    public   WebElement Register;
    @FindBy(css = "a[class='button-1 register-continue-button']")
    public WebElement RegisterContinue;

    public void interractRegister(RegisterObject registerObject) {
        interractClickGender();
        interractFirstname(registerObject.getFirstName());
        interractLastName(registerObject.getLastName());
        interractDate_of_birth_Day(registerObject.getDate_of_birth_Day());
        interractDate_of_birth_Month(registerObject.getDate_of_birth_Month());
        interractDate_of_birth_Year(registerObject.getDate_of_birth_Year());
        interractEmail(registerObject.getEmail());
//        elementsMethods.scrollBypixels(0, 450);
        interractCompanyName(registerObject.getCompanyName());
        interractPassword(registerObject.getPassword());
        interractConfirmPassword(registerObject.getConfirmPassword());
        interractClickRegister();
        interractClickRegisterContinue();
    }

    public void interractClickGender(){
        registerMethods.clickElement(Gender);
        LoggerUtility.info("The user select gender");
    }
    public void interractFirstname(String FirstNameValue){
        registerMethods.fillElement(FirstName,FirstNameValue);
        LoggerUtility.info("The user type first name" +FirstNameValue);

    }
    public void interractLastName(String LastNameValue){
        registerMethods.fillElement(LastName,LastNameValue);
        LoggerUtility.info("The user type last name" +LastNameValue);
    }
    public void interractDate_of_birth_Day(String value){
        registerMethods.clickElement(Date_of_birth_Day);
        Select DayDropdown=new Select(Date_of_birth_Day);
        DayDropdown.selectByValue(value);
        LoggerUtility.info("The user select date of birth day");
    }
    public void interractDate_of_birth_Month(String value){
        registerMethods.clickElement(Date_of_birth_Month);
        Select MonthDropdown=new Select(Date_of_birth_Month);
        MonthDropdown.selectByVisibleText(value);
        LoggerUtility.info("The user select date of birth month");
    }
    public void interractDate_of_birth_Year(String value){
        registerMethods.clickElement(Date_of_birth_Year);
        Select YearDropdown=new Select(Date_of_birth_Year);
        YearDropdown.selectByValue(value);
        LoggerUtility.info("The user select date of birth year");
    }
    public void interractEmail(String EmailValue){
        registerMethods.fillElement(Email,EmailValue);
        LoggerUtility.info("The user type email" +EmailValue);
    }
    public void interractCompanyName(String CompanyNameValue){
        registerMethods.fillElement(CompanyName,CompanyNameValue);
        LoggerUtility.info("The user type company name" +CompanyNameValue);
    }
    public void interractPassword(String PasswordValue){
        registerMethods.fillElement(Password,PasswordValue);
        LoggerUtility.info("The user type password" +PasswordValue);
    }
    public void interractConfirmPassword(String ConfirmPasswordValue){
        registerMethods.fillElement(ConfirmPassword,ConfirmPasswordValue);
        LoggerUtility.info("The user Confirm Password" +ConfirmPasswordValue);
    }
    public void interractClickRegister(){
        registerMethods.clickElement(Register);
        LoggerUtility.info("The user click register");
    }
    public void interractClickRegisterContinue(){
        registerMethods.clickElement(RegisterContinue);
        LoggerUtility.info("The user click register continue");
    }
}
