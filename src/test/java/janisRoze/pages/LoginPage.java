package janisRoze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    private WebDriver driver;

    By emailLocator = By.id("email");
    By passwordLocator = By.id("pass");
    By loginButtonLocator = By.xpath("//span[text()='Ielogoties']");
    By successMessageLocator = By.xpath("//h3[text()='Manas klienta kartes']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String username, String password) {
        WebElement emailField = driver.findElement(emailLocator);
        WebElement passwordField = driver.findElement(passwordLocator);
        WebElement loginButton = driver.findElement(loginButtonLocator);

        emailField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(successMessageLocator));
    }
}
