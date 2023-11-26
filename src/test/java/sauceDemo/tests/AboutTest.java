package sauceDemo.tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import sauceDemo.pages.AboutPage;
import sauceDemo.pages.InventoryPage;
import sauceDemo.pages.LoginPage;
import sauceDemo.tests.BaseTest;
public class AboutTest extends BaseTest {
    @Test
    public void aboutTestPageCheck() {

        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver, wait);
        AboutPage aboutPage = new AboutPage(driver);

        loginPage.login("standard_user", "secret_sauce");

        Assert.assertTrue(inventoryPage.isOpen());

        inventoryPage.openMenu();
        inventoryPage.openAboutPage();

        Assert.assertTrue(aboutPage.isOpen());
    }
}