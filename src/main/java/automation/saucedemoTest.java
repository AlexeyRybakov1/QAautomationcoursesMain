package automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

import static java.lang.Thread.sleep;

public class saucedemoTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");

        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standd_user");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secrt_sauce");

        driver.findElement(By.id("login-button")).click();
        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);

        WebElement errorMessage = driver.findElement(By.className("error-message-container"));


        if (currentURL.contains("inventory.html")){
            System.out.println("Login successful!");
        } else if (errorMessage.isDisplayed()){
            String Message = errorMessage.getText();
            if (Message.contains("Sorry, this user has been locked out.")){
                System.out.println("Sorry, this user has been locked out. Use different account");
            }else if(Message.contains("Password is required")) {
                System.out.println("Please write password");
            }else if (Message.contains("Username is required")){
                System.out.println("Please write Login");
            }else if (Message.contains("Username and password do not match any user in this service")){
                System.out.println(Message+"! Please use accepted accounts!");
            }
        }else {
            System.out.println("Error! ");
        }

        sleep(5000);

        driver.quit();
    }
}
