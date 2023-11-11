package automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

import static java.lang.Thread.sleep;
public class aliexpressTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://aliexpress.com/");
        String searchText = "iphone 14 pro max case";

        sleep(500);/*need a timer for the site to load and for ads to appear, which the test will close*/
        driver.findElement(By.xpath("//img[@class = 'pop-close-btn']")).click(); /*Close ad*/
        driver.findElement(By.xpath("//button[@class = 'btn-accept']")).click(); /*Accept all cookies*/

        WebElement search = driver.findElement(By.xpath("//input[@id=\"search-words\"]"));
        search.sendKeys(searchText);

        WebElement searchButton = driver.findElement(By.xpath("//input[@class = 'search--submit--2VTbd-T']"));
        searchButton.click();

        List<WebElement> resultLinks = driver.findElements(By.xpath("//h1[@class = 'multi--titleText--nXeOvyr']"));
        System.out.println("Number of links found: "+ resultLinks.size());

        for (WebElement title : resultLinks) {
            System.out.println(title.getText());
        }
        driver.quit();

    }

}
