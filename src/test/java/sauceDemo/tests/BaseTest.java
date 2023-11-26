package sauceDemo.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;


public class BaseTest {
    WebDriver driver;
    WebDriverWait wait;
    @BeforeMethod
    public void setUp() {

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

    }

    @AfterMethod
    public void cleanUp(){

        driver.close();
    }
}