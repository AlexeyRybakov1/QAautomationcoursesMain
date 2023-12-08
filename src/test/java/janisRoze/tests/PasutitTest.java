package janisRoze.tests;

import janisRoze.pages.GramatasPage;
import janisRoze.pages.GrozsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class PasutitTest extends BaseTest {

    @Test(priority = 3)
    public void checkProductNameInCart() {
        GramatasPage gramatasPage = new GramatasPage(driver);
        gramatasPage.navigatetoGramatas();

        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement firstBookElement = driver.findElement(By.xpath("(//h2[@class='product-name'])[1]"));
        String expectedBookName = firstBookElement.getText();
        System.out.println("Expected Book Name: " + expectedBookName);

        actions.moveToElement(firstBookElement).build().perform();

        WebElement addToCartButton = driver.findElement(By.xpath("//button[@class='button btn-cart']"));
        addToCartButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='count' and text()='1']")));

        GrozsPage grozsPage = new GrozsPage(driver);
        grozsPage.goToCart();

        WebElement productNameInCart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@class='product-name']")));

        String actualBookNameInCart = productNameInCart.getText();
        System.out.println("Actual Book Name in Cart: " + actualBookNameInCart);

        Assert.assertEquals(actualBookNameInCart, expectedBookName, "Product names do not match in the cart.");
    }
}
