package janisRoze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class CartPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.actions = new Actions(driver);
    }
    public String getProductNameInCart() {
        By productNameLocator = By.xpath("//h3[@class='product-name']");
        WebElement productNameInCart = wait.until(ExpectedConditions.visibilityOfElementLocated(productNameLocator));
        return productNameInCart.getText();
    }
}
