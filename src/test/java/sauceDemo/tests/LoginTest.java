package sauceDemo.tests;



import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import sauceDemo.pages.LoginPage;

public class LoginTest {
    @Test
    public void successfulLoginCheck() {
        WebDriver driver;
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");

        LoginPage loginPage = new LoginPage(driver);


        loginPage.login();


        Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));

    }
}