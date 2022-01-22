import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AsercionesTests extends DriverFactory{

    private final String url = "https://www.facebook.com/";

    @Test(groups = { "grupo2" })
    public void test() {
        String valorEsperado = "Facebook - Log In or Sign Upss";

        driver.navigate().to(url);
        Assert.assertEquals(driver.getTitle(),valorEsperado);
    }

    @Test
    public void test2() {
        String valorEsperado = "Facebook - Log In or Sign Up";
        String valorEsperado2 = "https://www.facebook.com/";
        driver.navigate().to(url);

        SoftAssert softAssertion= new SoftAssert();
        softAssertion.assertEquals(driver.getTitle(),valorEsperado);
        softAssertion.assertEquals(driver.getCurrentUrl(),valorEsperado2);
        softAssertion.assertAll();
    }
}