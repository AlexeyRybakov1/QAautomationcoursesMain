package sauceDemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.NoSuchElementException;

public class InventoryPage {

    WebDriver driver;

    public InventoryPage(WebDriver driver){
        this.driver = driver;
    }

    public void addItemToCart(String itemId) {
        try {
            driver.findElement(By.id(itemId)).click();
        } catch (NoSuchElementException e) {
            System.out.println("Item with ID " + itemId + " not found: " + e.getMessage());

        }
    }

    public double getItemPrice(String itemName) {
        try {
            String itemPriceXPath = "//div[@class='inventory_item_price']";
            WebElement priceElement = driver.findElement(By.xpath(itemPriceXPath));
            String priceText = priceElement.getText();
            return Double.parseDouble(priceText.replace("$", ""));
        } catch (Exception e) {
            System.out.println("Error finding price for item " + itemName + ": " + e.getMessage());
            return -1;
        }
    }
    public void goToCart() {
        WebElement cartButton = driver.findElement(By.id("shopping_cart_container"));
        cartButton.click();
    }

    public boolean isOpen() {
        try {
            WebElement burgerMenu = driver.findElement(By.id("react-burger-menu-btn"));
            return burgerMenu.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
