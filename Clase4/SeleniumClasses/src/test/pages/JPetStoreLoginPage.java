import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JPetStoreLoginPage{

    WebDriver driver;

    @FindBy(name="username")
    WebElement usernameTxtBox;
    @FindBy(name="password")
    WebElement passwordTxtBox;
    @FindBy(name="signon")
    WebElement loginButton;

    public JPetStoreLoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void logInUser(String username, String password){
        usernameTxtBox.sendKeys(username);
        passwordTxtBox.sendKeys(password);
        loginButton.click();
    }
}

