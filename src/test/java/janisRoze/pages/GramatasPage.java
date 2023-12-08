package janisRoze.pages;

import org.openqa.selenium.WebDriver;

public class GramatasPage {

    private WebDriver driver;

    public GramatasPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigatetoGramatas() {
        driver.get("https://www.janisroze.lv/lv/gramatas.html");
    }
}
