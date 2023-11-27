package sauceDemo.tests;

import org.testng.annotations.Test;
import sauceDemo.pages.InventoryPage;
import sauceDemo.pages.LoginPage;

public class InventoryTest extends BaseTest {
    @Test
    public void addItemsToCart() {


        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);
        loginPage.login();


    }
}