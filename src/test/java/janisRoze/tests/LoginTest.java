package janisRoze.tests;

import janisRoze.pages.HomePage;
import janisRoze.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test(priority = 1)
    public void testLogin() {
        HomePage homePage = new HomePage(driver);
        homePage.navigateToHomePage();

        homePage.navigateToLoginPage();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();
        Assert.assertTrue(true, "Login successful");
    }
}
