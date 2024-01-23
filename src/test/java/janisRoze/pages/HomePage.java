package janisRoze.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
    WebDriver driver;

    String profileLinkXpath = "//ul[@class='account-dropdown long']";
    By ielagotiesButtonLocator = By.xpath("//a[@title='Ielogoties']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToLoginPage(){
        Actions action = new Actions(driver);
        WebElement profileLink = driver.findElement(By.xpath(profileLinkXpath));
        WebElement ielogotiesDDItem = driver.findElement(ielagotiesButtonLocator);

        action.moveToElement(profileLink).build().perform();
        ielogotiesDDItem.click();

    }
    public void navigatetoGramatas() {
        driver.get("https://www.janisroze.lv/lv/gramatas.html");//can't do a xpath because Latvian language got bug in code
    }
}