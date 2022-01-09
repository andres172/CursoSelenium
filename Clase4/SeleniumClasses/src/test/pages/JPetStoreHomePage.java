import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JPetStoreHomePage{

    WebDriver driver;

    @FindBy(xpath="//*[@id='MenuContent']/a[2]")
    WebElement signInButton;

    public JPetStoreHomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnSignInButton(){
        signInButton.click();
    }
}
