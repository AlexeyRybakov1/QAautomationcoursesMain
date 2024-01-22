package janisRoze.tests;

import janisRoze.pages.GramatasPage;
import janisRoze.pages.GrozsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PasutitTest extends BaseTest {

    @Test(priority = 3)
    public void checkProductNameInCart() {
        GramatasPage gramatasPage = new GramatasPage(driver);
        gramatasPage.navigatetoGramatas();

        String expectedBookName = gramatasPage.getFirstBookName();
        System.out.println("Expected Book Name: " + expectedBookName);

        gramatasPage.addToCart();

        GrozsPage grozsPage = new GrozsPage(driver);
        grozsPage.goToCart();

        String actualBookNameInCart = grozsPage.getProductNameInCart();
        System.out.println("Actual Book Name in Cart: " + actualBookNameInCart);

        Assert.assertEquals(actualBookNameInCart, expectedBookName, "Product names do not match in the cart.");
    }
}
