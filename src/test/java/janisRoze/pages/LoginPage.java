package janisRoze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class LoginPage {

    WebDriver driver;
    String username = "aleksuser3@gmail.com";
    String password = "k4ry!GHU9cv!t.c";



    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login() {
        WebElement emailField = driver.findElement(By.id("email"));
        WebElement passwordField = driver.findElement(By.id("pass"));
        WebElement loginButton = driver.findElement(By.xpath("//span[text()='Ielogoties']"));

        emailField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement someElementOnNextPage = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h3[text()='Manas klienta kartes']")));
    }


}
