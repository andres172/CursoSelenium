import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

public class BeforeAndAfterTests extends DriverFactory{

    private final String url = "https://www.facebook.com/";

    @BeforeTest
    public void beforeTest() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.navigate().to(url);
    }
    @BeforeClass
    public void beforeClass() {
        driver.manage().window().maximize();
    }
    @BeforeMethod
    public void beforeMethod() {
        driver.findElement(By.id("email")).sendKeys("user");
        driver.findElement(By.id("pass")).sendKeys("pass");
    }
    @Test
    public void test() {
        driver.findElement(By.linkText("Create a Page")).click();
    }
    @AfterMethod
    public void afterMethod() {
        driver.findElement(By.linkText("Forgot account?")).click();;
    }
    @AfterClass
    public void afterClass() {
        driver.manage().window().minimize();
    }
    @AfterTest
    public void endTest() {
        driver.quit();
    }
}
