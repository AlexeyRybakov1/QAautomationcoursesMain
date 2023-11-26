package sauceDemo.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

    private static WebDriver driver;
    private String shoppingCartIconId = "shopping_cart_container";

    private static String checkoutButtonId = "checkout";


    public CartPage(WebDriver driver){
        this.driver = driver;
    }


    public void shoppingCart(){

        WebElement shoppingCartItem = driver.findElement(By.id(shoppingCartIconId));
        shoppingCartItem.click();
    }


    public static boolean isOpen(){
        WebElement checkoutButton = driver.findElement(By.id(checkoutButtonId));
        if ( checkoutButton.isDisplayed() ) return true;
        else return false;
    }
}