import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SeleniumTests extends DriverFactory{
    private final String url = "https://www.facebook.com/";

    @Test
    public void UsingFluentWait() {

        driver.navigate().to(url);

        FluentWait wait = new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(10));
        wait.pollingEvery(Duration.ofSeconds(2));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Create a Page")));
    }

    @Test
    public void GoToForgotAccountWithoutUsingImplicitWait() {

        driver.navigate().to(url);
        driver.findElement(By.linkText("Create a Page")).click();
        driver.findElement(By.linkText("Forgot account?")).click();
    }

    @Test
    public void GoToForgotAccountUsingImplicitWait() {

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.navigate().to(url);
        driver.findElement(By.linkText("Create a Page")).click();
        driver.findElement(By.linkText("Forgot account?")).click();
    }

    @Test
    public void UsingExplicitWait() {

        WebDriverWait wait = new WebDriverWait(driver, 5);

        driver.navigate().to(url);
        driver.findElement(By.linkText("Create a Page")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Forgot account?"))).click();
    }

    @Test
    public void NavigateToFacebookUsingXpath() {

        driver.navigate().to(url);
        //driver.findElement(By.xpath("//input[@id='email']")).sendKeys("user");
        //driver.findElement(By.xpath("//input[contains(@id,'ema')]")).sendKeys("user2");
        //driver.findElement(By.xpath("//*[@id='email' or @name='email']")).sendKeys("user3");
        //driver.findElement(By.xpath("//*[@name='pass' and @id='pass']")).sendKeys("pass");
        //driver.findElement(By.xpath("//*[starts-with(@id,'ema')]")).sendKeys("user4");
        driver.findElement(By.xpath("//button[text()='Log In']")).click();
    }

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