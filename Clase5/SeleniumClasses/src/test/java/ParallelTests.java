import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ParallelTests {

    public static final String pathDrivers = System.getProperty("user.dir")+"/src/test/resources/Drivers/";

    @Test
    public void test() {
        System.setProperty("webdriver.chrome.driver", pathDrivers + "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");
    }

    @Test
    public void test2() {
        System.setProperty("webdriver.chrome.driver", pathDrivers + "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
    }
}
