import org.junit.Test;
import org.openqa.selenium.By;

public class SeleniumTests extends DriverFactory{
    private final String url = "https://www.facebook.com/";

    @Test
    public void NavigateToFacebookUsingCSSelectors() {

        driver.navigate().to(url);
        //driver.findElement(By.cssSelector("input#email")).sendKeys("user");
        //driver.findElement(By.cssSelector("input.inputtext")).sendKeys("user2");
        //driver.findElement(By.cssSelector("input[id=email]")).sendKeys("user3");
        //driver.findElement(By.cssSelector("input.inputtext[id=email]")).sendKeys("user4");
        //driver.findElement(By.cssSelector("input[id$=mail]")).sendKeys("user5");
        driver.findElement(By.cssSelector("input[id*=ema")).sendKeys("user6");
    }

    @Test
    public void NavigateToFacebookUsingIdNamesTagsAndLinks() {

        driver.navigate().to(url);
        //driver.findElement(By.id("email")).sendKeys("username1");
        //driver.findElement(By.name("email")).sendKeys("username2");
        //driver.findElement(By.linkText("Forgot password?")).click();
        //driver.findElement(By.partialLinkText("Forgot")).click();
        //driver.findElement(By.tagName("button")).click();
        driver.findElement(By.className("inputtext")).sendKeys("user2");
    }
}