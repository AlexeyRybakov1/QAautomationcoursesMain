package sauceDemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;



    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void openProduct() {
        WebElement sauceLabsBackpack = driver.findElement(By.xpath("//a[@id = 'item_4_title_link']"));
        sauceLabsBackpack.click();
    }

    public boolean isOpen(){
        WebElement backToProductsButton = driver.findElement(By.xpath("//button[@id = 'back-to-products']"));
        return backToProductsButton.isDisplayed();
    }
}