package sauceDemo.tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import sauceDemo.pages.HomePage;
import sauceDemo.pages.InventoryPage;
import sauceDemo.pages.LoginPage;
public class ViewProductTest extends BaseTest{
    @Test
    public void successfulProductOpenCheck(){

        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver, wait);
        HomePage openSauceLabsBackpackProductPage = new HomePage(driver);


        loginPage.login("standard_user", "secret_sauce");


        Assert.assertTrue(inventoryPage.isOpen());


        openSauceLabsBackpackProductPage.openProduct();


        Assert.assertTrue(openSauceLabsBackpackProductPage.isOpen());
    }
}