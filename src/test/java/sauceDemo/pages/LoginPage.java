package sauceDemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;
    private String loginFieldId = "user-name";
    private String passwordFieldId = "password";
    private String loginButtonId = "login-button";


    public LoginPage(WebDriver driver){

        this.driver=driver;
    }

    public void login(String login, String password){
        WebElement loginField = driver.findElement(By.id(loginFieldId));
        WebElement passwordField = driver.findElement(By.id(passwordFieldId));
        WebElement loginButton = driver.findElement(By.id(loginButtonId));

        loginField.sendKeys(login);
        passwordField.sendKeys(password);
        loginButton.click();

    }
}