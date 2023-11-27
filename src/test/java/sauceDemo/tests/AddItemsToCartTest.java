package sauceDemo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import sauceDemo.pages.InventoryPage;
import sauceDemo.pages.LoginPage;

public class AddItemsToCartTest extends BaseTest {

    @Test
    public void testAddTwoItemsToCart() {
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);


        loginPage.login();


        String firstItem = "Sauce Labs Backpack";
        String secondItem = "Sauce Labs Bike Light";
        inventoryPage.addItemToCart("add-to-cart-sauce-labs-backpack");
        inventoryPage.addItemToCart("add-to-cart-sauce-labs-bike-light");

        double firstItemPriceInInventory = inventoryPage.getItemPrice(firstItem);
        double secondItemPriceInInventory = inventoryPage.getItemPrice(secondItem);

        inventoryPage.goToCart();
    }
}
