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

    public GrozsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToCart() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement cartIcon = driver.findElement(By.xpath("//span[text()='Grozs']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(cartIcon).build().perform();

        WebElement pasutitButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='header-cart']/div/div[5]/button")));
        pasutitButton.click();
    }
}
