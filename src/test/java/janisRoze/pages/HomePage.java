package janisRoze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToHomePage() {
        driver.get("https://www.janisroze.lv/lv/");
    }

    public void navigateToLoginPage() {
        WebElement profileIcon = driver.findElement(By.xpath("//ul[@class='account-dropdown long']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(profileIcon).build().perform();


        WebElement ielogotiesDDItem = driver.findElement(By.xpath("//a[@title='Ielogoties']"));
        ielogotiesDDItem.click();
    }


}
