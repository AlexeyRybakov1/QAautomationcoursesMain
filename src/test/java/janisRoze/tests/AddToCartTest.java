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

    @Test (priority = 2)
    public void addToCart() {
        GramatasPage gramatasPage = new GramatasPage(driver);
        gramatasPage.navigatetoGramatas();

        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement gramataIcon = driver.findElement(By.xpath("//img[@id='product-collection-image-104624']"));
        actions.moveToElement(gramataIcon).build().perform();
        WebElement ieliktGrozaButton = driver.findElement(By.xpath("//button[@class='button btn-cart']"));
        ieliktGrozaButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='count' and text()='1']")));


        WebElement gramataIcon2 = driver.findElement(By.xpath("//img[@id='product-collection-image-104623']"));
        actions.moveToElement(gramataIcon2).build().perform();
        WebElement ieliktGrozaButton2 = driver.findElement(By.xpath("//button[@class='button btn-cart']"));
        ieliktGrozaButton2.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='count' and text()='2']")));



        WebElement gramataIcon3 = driver.findElement(By.xpath("//img[@id='product-collection-image-104617']"));
        actions.moveToElement(gramataIcon3).build().perform();
        WebElement ieliktGrozaButton3 = driver.findElement(By.xpath("//button[@class='button btn-cart']"));
        ieliktGrozaButton3.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='count' and text()='3']")));


    }
}
