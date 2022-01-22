import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTests extends DriverFactory{

    @Test(dataProvider="Usuarios",dataProviderClass=Usuarios.class)
    public void test2(String user, String password) {

        driver.navigate().to("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys(user);
        driver.findElement(By.id("pass")).sendKeys(password);
    }

    @DataProvider(name = "Proveedor")
    public Object[][] getData() {
        return new Object[][]
                {
                        { "jose", "12345" },
                        { "luis", "22211" },
                        { "pedro", "66622" }
                };
    }

    @Test(dataProvider="Proveedor")
    public void test(String user, String password) {

        driver.navigate().to("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys(user);
        driver.findElement(By.id("pass")).sendKeys(password);
    }
}
