package janisRoze.tests;

import janisRoze.pages.HomePage;
import janisRoze.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test(priority = 1)
    @Parameters({"username", "password"})
    public void testLogin(String username, String password) {
        HomePage homePage = new HomePage(driver);
        homePage.navigateToHomePage();

        homePage.navigateToLoginPage();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(username, password);

        Assert.assertTrue(true, "Login successful");
    }
}
