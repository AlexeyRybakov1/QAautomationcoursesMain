package Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Thread.sleep;

public class draugiemTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver dr = new FirefoxDriver();
        dr.get("https://ss.lv");

        WebElement cars = dr.findElement(By.id("mtd_97"));
        cars.click();

        Select year = new Select(dr.findElement(By.id("f_o_18_min")));
        year.selectByVisibleText("2001");

        Select color = new Select(dr.findElement(By.id("f_o_17")));
        color.selectByVisibleText("Balta");

        WebElement pricemin = dr.findElement(By.id("f_o_8_min"));
        pricemin.sendKeys("6000");

        WebElement pricemax = dr.findElement(By.id("f_o_8_max"));
        pricemax.sendKeys("10000");

        Select maxEngine = new Select(dr.findElement(By.id("f_o_15_max")));
        maxEngine.selectByVisibleText("3.0");


        sleep(5000);

        dr.quit();
    }
}
