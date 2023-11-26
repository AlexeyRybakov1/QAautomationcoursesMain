package sauceDemo.tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import sauceDemo.pages.CartPage;
import sauceDemo.pages.LoginPage;

public class ShoppingCartTest extends BaseTest {

    @Test
    public void successfulCartOpenCheck() {

        LoginPage loginPage = new LoginPage(driver);
        CartPage mycartPage = new CartPage(driver);


        loginPage.login("standard_user", "secret_sauce");


        mycartPage.shoppingCart();


        Assert.assertTrue(CartPage.isOpen());
    }
}