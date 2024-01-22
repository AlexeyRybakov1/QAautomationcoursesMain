package janisRoze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GramatasPage {

    private WebDriver driver;
    private Actions actions;
    private WebDriverWait wait;

    public GramatasPage(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void navigatetoGramatas() {
        driver.get("https://www.janisroze.lv/lv/gramatas.html");
    }

    public String getFirstBookName() {
        WebElement firstBookElement = driver.findElement(By.xpath("(//h2[@class='product-name'])[1]"));
        actions.moveToElement(firstBookElement).build().perform();
        return firstBookElement.getText();
    }

    public void addToCart() {
        WebElement addToCartButton = driver.findElement(By.xpath("//button[@class='button btn-cart']"));
        addToCartButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='count' and text()='1']")));
    }
    public void waitForCartIconToUpdate() {
        By cartIconLocator = By.xpath("//span[text()='Grozs']");
        wait.until(ExpectedConditions.stalenessOf(driver.findElement(cartIconLocator)));
        wait.until(ExpectedConditions.visibilityOfElementLocated(cartIconLocator));
    }
}
