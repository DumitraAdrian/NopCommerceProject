package Pages.Login;
import HelpMethods.LoginMethods;
import Logger.LoggerUtility;
import ObjectData.GiftCardObject;
import ObjectData.LoginObject;
import Pages.Forms.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "input[id='Email']")
    public WebElement Email;
    @FindBy(css = "input[id='Password']")
    public WebElement Password;
    @FindBy(css = "input[id='RememberMe']")
    public  WebElement RememberMe;
    @FindBy(css = "button[class='button-1 login-button']")
    public  WebElement Login;
    public void interractLoginPage(LoginObject loginObject) {
        interractEmail(loginObject.getEmail());
        interractPassword(loginObject.getPassword());
        interractClickRememberMe();
        interractClickLogIn();

    }
    public void interractEmail(String EmeilValue){
//        Email.sendKeys(value);
        loginMethods.fillElement(Email,EmeilValue);
        LoggerUtility.info("The user type email" +EmeilValue);
    }
    public void interractPassword(String PasswordValue){
        loginMethods.fillElement(Password,PasswordValue);
        LoggerUtility.info("The user type password");
    }
    public void interractClickRememberMe(){
        loginMethods.clickElement(RememberMe);
        LoggerUtility.info("The user click  remember me button");
    }
    public void interractClickLogIn(){
       loginMethods.clickElement(Login);
        LoggerUtility.info("The user click login");
    }
}
