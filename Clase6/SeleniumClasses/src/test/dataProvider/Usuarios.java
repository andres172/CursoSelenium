import org.testng.annotations.DataProvider;

public class Usuarios {

    @DataProvider(name = "Usuarios")
    public static Object[][] getData() {
        return new Object[][]
                {
                        { "andres", "12345" },
                        { "tadeo", "22211" }
                };
    }
}
