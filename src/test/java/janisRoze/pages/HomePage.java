package janisRoze.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
    WebDriver driver;

    String profileLinkXpath = "//ul[@class='account-dropdown long']";

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToLoginPage(){
        Actions action = new Actions(driver);
        WebElement profileLink = driver.findElement(By.xpath(profileLinkXpath));
        WebElement ielogotiesDDItem = driver.findElement(By.xpath("//a[@title='Ielogoties']"));

        action.moveToElement(profileLink).build().perform();
        ielogotiesDDItem.click();

    }
}