package automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;


import static java.lang.Thread.sleep;

public class shopTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://220.lv");

        driver.findElement(By.id("department-4579")).click();

        WebElement riepas = driver.findElement(By.xpath("//p[@class='name' and contains(text(),'Riepas')]"));
        riepas.click();

        WebElement vasarasRiepas = driver.findElement(By.xpath("//p[@class = 'name' and contains(text(),'Vasaras riepas')]"));
        vasarasRiepas.click();// Until this one, all works, but maybe not for first time
        WebElement razotajs= driver.findElement(By.xpath("//label[@for = 'filter-checkbox-18272542']"));
        razotajs.click();

        sleep(5000);
        driver.quit();
    }
}
