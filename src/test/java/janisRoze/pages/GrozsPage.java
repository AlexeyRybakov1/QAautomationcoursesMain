package janisRoze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GrozsPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;

    public GrozsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.actions = new Actions(driver);
    }

    public void goToCart() {
        WebElement cartIcon = driver.findElement(By.xpath("//a[@class ='mini-cart-heading dropdown-heading cover skip-link skip-cart']"));
        actions.moveToElement(cartIcon).build().perform();

        WebElement pasutitButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class, 'btn-checkout')]")));
        actions.moveToElement(pasutitButton).build().perform();
        pasutitButton.click();
    }

}
