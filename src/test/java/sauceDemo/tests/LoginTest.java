package sauceDemo.tests;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import sauceDemo.pages.InventoryPage;
import sauceDemo.pages.LoginPage;

public class LoginTest extends BaseTest {
    @Test
    public void successfulLoginCheck() {

        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver, wait);


        loginPage.login("standard_user", "secret_sauce");


        Assert.assertTrue(inventoryPage.isOpen());

    }
}