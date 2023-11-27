package sauceDemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;

    String loginFieldId = "user-name";
    String passwordFieldId = "password";
    String loginButtonId = "login-button";

     public LoginPage(WebDriver driver){
         this.driver = driver;
     }

    public void login(){
         WebElement loginField = driver.findElement(By.id(loginFieldId));
         WebElement passwordField = driver.findElement(By.id(passwordFieldId));
         WebElement loginButton = driver.findElement(By.id(loginButtonId));

        loginField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
        loginButton.click();

    }
}