package janisRoze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;
    String emailInputId = "email";
    String passwordInputId = "pass";
    String loginButtonId = "send2";

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public Boolean isOpen(){
        WebElement emailInput = driver.findElement(By.id("email"));
        if (emailInput.isDisplayed()) return true;
        else return false;
    }
    public void login(){
        WebElement emailField = driver.findElement(By.id(emailInputId));
        WebElement passwordField = driver.findElement(By.id(passwordInputId));
        WebElement loginButton = driver.findElement(By.id(loginButtonId));

        emailField.sendKeys("aleksuser3@gmail.com");
        passwordField.sendKeys("k4ry!GHU9cv!t.c");
        loginButton.click();
    }
}
