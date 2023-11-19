package homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class janisrozetest {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    @Test
    public void testJanisRoze() {
        driver.get("https://www.janisroze.lv/lv/");

        WebElement profileIcon = driver.findElement(By.xpath("//ul[@class='account-dropdown long']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(profileIcon).build().perform();


        WebElement ielogotiesDDItem = driver.findElement(By.xpath("//a[@title='Ielogoties']"));
        ielogotiesDDItem.click();

        By loginPageTitleLocator = By.xpath("//span[text()='Ielogoties']");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.presenceOfElementLocated(loginPageTitleLocator));

        WebElement emailField = driver.findElement(By.id("email"));
        WebElement passwordField = driver.findElement(By.id("pass"));
        WebElement loginButton = driver.findElement(By.xpath("//span[text()='Ielogoties']"));

        emailField.sendKeys("aleksuser3@gmail.com");
        passwordField.sendKeys("k4ry!GHU9cv!t.c");
        loginButton.click();


        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement footer = driver.findElement(By.xpath("//div[@class = 'footer-copyright']"));
        js.executeScript("arguments[0].scrollIntoView(true);", footer);


    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
