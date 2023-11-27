package sauceDemo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import sauceDemo.pages.InventoryPage;
import sauceDemo.pages.LoginPage;

public class LoginTest extends BaseTest{
    @Test
    public void successfulLoginCheck() {


        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);


        loginPage.login();


        Assert.assertTrue(inventoryPage.isOpen());

    }
}