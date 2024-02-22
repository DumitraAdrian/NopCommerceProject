package Pages.Login;
import Logger.LoggerUtility;
import ObjectData.LoginObject;
import Pages.Forms.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "input[id='Email']")
    private WebElement Email;
    @FindBy(css = "input[id='Password']")
    private WebElement Password;
    @FindBy(css = "input[id='RememberMe']")
    private  WebElement RememberMe;
    @FindBy(css = "button[class='button-1 login-button']")
    private  WebElement Login;
    public void interractLoginPage(LoginObject loginObject) {
        interractEmail(loginObject.getEmail());
        interractPassword(loginObject.getPassword());
        interractClickRememberMe();
        interractClickLogIn();

    }
    public boolean interractEmail(String EmailValue){
//        Email.sendKeys(value);
        loginMethods.fillElement(Email,EmailValue);
        LoggerUtility.info("The user type email");
        return false;
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
