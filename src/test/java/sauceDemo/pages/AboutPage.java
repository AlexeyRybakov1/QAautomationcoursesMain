package sauceDemo.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AboutPage {

    private WebDriver driver;
    private WebDriverWait wait;
    private String burgerMenuIconId = "react-burger-menu-btn";

    private String aboutButtonId = "about_sidebar_link";


    public AboutPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isOpen() {
        WebElement tryItFreeButton = driver.findElement(By.xpath("//button[contains(@class, 'css-as8hpy')]"));
        if (tryItFreeButton.isDisplayed()) return true;
        else return false;
    }
}