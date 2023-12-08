package janisRoze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {

    private WebDriver driver;

    By profileIconLocator = By.xpath("//ul[@class='account-dropdown long']");
    By loginLinkLocator = By.xpath("//a[@title='Ielogoties']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToHomePage() {
        driver.get("https://www.janisroze.lv/lv/");
    }

    public void navigateToLoginPage() {
        WebElement profileIcon = driver.findElement(profileIconLocator);
        Actions actions = new Actions(driver);
        actions.moveToElement(profileIcon).build().perform();

        WebElement ielogotiesDDItem = driver.findElement(loginLinkLocator);
        ielogotiesDDItem.click();
    }
}
