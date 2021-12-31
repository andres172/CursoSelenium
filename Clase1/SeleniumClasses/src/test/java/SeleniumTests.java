import org.junit.Test;

public class SeleniumTests extends DriverFactory{

    private String url = "https://www.google.com/";

    @Test
    public void NavigateToGoogle() {

        driver.navigate().to(url);
    }
}