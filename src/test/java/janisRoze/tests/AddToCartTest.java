package janisRoze.tests;

import janisRoze.pages.GramatasPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class AddToCartTest extends BaseTest {

    @Test(priority = 2)
    public void addToCart() {
        GramatasPage gramatasPage = new GramatasPage(driver);
        gramatasPage.navigatetoGramatas();

        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        WebElement firstBookElement = driver.findElement(By.xpath("(//h2[@class='product-name'])[1]"));

        String bookName;
        bookName = firstBookElement.getText();


        System.out.println( bookName);


        actions.moveToElement(firstBookElement).build().perform();


        WebElement addToCartButton = driver.findElement(By.xpath("//button[@class='button btn-cart']"));
        addToCartButton.click();


        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='count' and text()='1']")));
    }
}
