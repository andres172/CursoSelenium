import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ParameterTests extends DriverFactory{

    private final String url = "https://www.facebook.com/";

    @Test
    @Parameters({"username"})
    public void test(String username) {
        driver.navigate().to(url);
        driver.findElement(By.id("email")).sendKeys(username);
    }

    @Test(enabled = false)
    public void test2() {
        driver.navigate().to(url);
        driver.findElement(By.id("pass")).sendKeys("pass");
    }
}
