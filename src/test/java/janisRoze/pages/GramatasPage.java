package janisRoze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GramatasPage {
    WebDriver driver;

    public GramatasPage(WebDriver driver) {
        this.driver = driver;
    }
    public void navigatetoGramatas(){
        driver.get("https://www.janisroze.lv/lv/gramatas.html");// i tried with xpath but problems with latvian language
    }

}
