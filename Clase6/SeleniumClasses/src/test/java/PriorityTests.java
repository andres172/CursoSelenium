import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PriorityTests extends  DriverFactory{

    private final String url = "https://www.facebook.com/";

    @Test(priority = 1)
    public void test() {
        driver.navigate().to(url);
        driver.findElement(By.id("email")).sendKeys("user");
    }

    @Test(priority = 2)
    public void test2() {
        driver.navigate().to(url);
        driver.findElement(By.id("pass")).sendKeys("pass");
    }
}
