package Pages.Computers;
import Logger.LoggerUtility;
import Pages.Forms.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputersPages extends BasePage {
    public ComputersPages(WebDriver driver) {
        super(driver);
    }
    @FindBy(linkText = "Desktops")
    private WebElement Desktops;
    @FindBy(linkText = "Notebooks")
    private WebElement Notebooks;
    @FindBy(linkText = "Software")
    private  WebElement Software;
    public void clickDesktops(){
        computersMethods.clickElement(Desktops);
        LoggerUtility.info("The user click Desktops");
    }
    public void clickNotebook(){
        computersMethods.clickElement(Notebooks);
        LoggerUtility.info("The user click Notebooks");

    }
    public void clickSoftware(){
        computersMethods.clickElement(Software);
        LoggerUtility.info("The user click Software");
    }
}
