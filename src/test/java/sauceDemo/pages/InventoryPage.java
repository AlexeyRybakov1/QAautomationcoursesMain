package sauceDemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage {

    WebDriver driver;

    String burgerMenuId = "react-burger-menu-btn";

    public InventoryPage(WebDriver driver){
        this.driver = driver;

    }

    public Boolean isOpen(){
        WebElement burgerMenu = driver.findElement(By.id(burgerMenuId));

        if (burgerMenu.isDisplayed()) return true;
        else return false;
    }
}
