import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class HandleAlertsAndTabsTests extends DriverFactory{

    private final String url = "https://www.demoblaze.com/";
    @Test
    public void HandleAlert() {

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.navigate().to(url);
        driver.findElement(By.xpath("//div[@id='tbodyid']/div[1]/div")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]")).click();

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }
    @Test
    public void HandleTabs() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.navigate().to("https://www.finning.com/es_CL/company/about.html");
        driver.manage().window().maximize();
        String mainWindow = driver.getWindowHandle();
        driver.findElement(By.xpath("(//a[@id='email_icon'])[2]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);

        Set<String> allWindowHandles = driver.getWindowHandles();
        driver.switchTo().window(allWindowHandles.toArray()[1].toString());
        wait.until(titleIs("Formulario de Contacto | Finning Cat"));
        driver.switchTo().window(mainWindow);
    }
}
