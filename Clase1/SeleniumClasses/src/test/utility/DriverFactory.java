import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    public static WebDriver driver;
    public static String browser ;
    public static final String pathDrivers = System.getProperty("user.dir")+"/src/test/resources/Drivers/";

    public DriverFactory(){
        browser = PropertiesFile.getProperty("browser");

        switch (browser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", pathDrivers + "chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "edge":
                System.setProperty("webdriver.edge.driver", pathDrivers + "msedgedriver.exe");
                driver = new EdgeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.geckodriver.driver", pathDrivers + "gheckodriver.exe");
                driver = new FirefoxDriver();
                break;
        }
    }
}
