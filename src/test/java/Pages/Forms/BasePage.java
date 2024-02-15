package Pages.Forms;


import HelpMethods.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public WebDriver driver;
    public ElectronicsMethods electronicsMethods;
    public ComputersMethods computersMethods;
    public ApparelMethods apparelMethods;
    public BooksMethods booksMethods;
    public GiftCardMethods giftCardMethods;
    public LoginMethods loginMethods;
    public RegisterMethods registerMethods;

    public BasePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        electronicsMethods=new ElectronicsMethods(driver);
        computersMethods=new ComputersMethods(driver);
        apparelMethods=new ApparelMethods(driver);
        booksMethods=new BooksMethods(driver);
        giftCardMethods=new GiftCardMethods(driver);
        loginMethods=new LoginMethods(driver);
        registerMethods=new RegisterMethods(driver);

    }

}