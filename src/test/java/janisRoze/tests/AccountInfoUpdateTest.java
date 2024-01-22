package janisRoze.tests;

import janisRoze.pages.AccountPage;
import janisRoze.pages.HomePage;
import janisRoze.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountInfoUpdateTest extends BaseTest{
    @Test(priority = 2)
    public void successfulAccountInfoUpdate() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        AccountPage accountPage = new AccountPage(driver);

        homePage.goToLoginPage();
        Assert.assertTrue(loginPage.isOpen());

        loginPage.login();
        Assert.assertTrue(accountPage.isOpen());

        accountPage.openEditAccountInfoForm();

        accountPage.updateAccountInfo();
        Assert.assertTrue(accountPage.isUpdated());
    }
}
