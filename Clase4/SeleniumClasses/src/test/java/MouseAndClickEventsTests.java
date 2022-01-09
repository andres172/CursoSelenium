import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseAndClickEventsTests extends DriverFactory{

    private final String url = "https://www.facebook.com/";

    @Test
    public void MouseHoverEvents() {

        driver.navigate().to("https://www.google.com/");
        WebElement element = driver.findElement(By.xpath("//*[@aria-label='Búsqueda por voz']"));
        Actions builder = new Actions(driver);
        Action action = builder
                .moveToElement(element)
                .build();
        action.perform();
    }

    @Test
    public void HandlingKeyboardEvents() {

        driver.navigate().to(url);
        WebElement element = driver.findElement(By.cssSelector("input#email"));
        Actions builder = new Actions(driver);
        Action action = builder
                        .moveToElement(element)
                        .click()
                        .keyDown(element, Keys.SHIFT)
                        .sendKeys("user")
                        .contextClick()
                        .build();
        action.perform();
    }
}
