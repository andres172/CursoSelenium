import org.testng.annotations.*;

public class JPetStoreTests extends DriverFactory{

    private final String url = "https://petstore.octoperf.com/actions/Catalog.action";

    JPetStoreLoginPage jPetStoreLoginPage;
    JPetStoreHomePage jPetStoreHomePage;

    @Test
    public void LogInWithInvalidUser() {

        driver.navigate().to(url);

        jPetStoreHomePage =new JPetStoreHomePage(driver);
        jPetStoreLoginPage = new JPetStoreLoginPage(driver);

        jPetStoreHomePage.clickOnSignInButton();
        jPetStoreLoginPage.logInUser("user","pass");
    }
}
