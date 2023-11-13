package lt.laurynas.pom.test.piguLt;

import lt.laurynas.pom.pages.Locator;
import lt.laurynas.pom.pages.piguLt.AddProductToCartPage;
import lt.laurynas.pom.pages.piguLt.LoginPage;
import lt.laurynas.pom.test.TestBase;
import lt.laurynas.pom.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class AddProductToCartTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
            LoginPage.openChrome("https://pigu.lt/lt/u/login");
    }
    @Test
        public void test() {
            String expectedResult = "DELTACO ekrano apsauga skirta Apple iPhone 12/ 12 Pro 6.1, " +
                    "2,5D grūdinto stiklo, 9H kietumo SCRN-20IP61a";
            String actualResult;

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(30));

        AddProductToCartPage.clickOnAllProducts();
        AddProductToCartPage.clickOnPhonesAndAccessories();
        AddProductToCartPage.clickOnPhoneScreenSavers();
        AddProductToCartPage.clickOnFirstItem();
        AddProductToCartPage.clickOnAddToCart();
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                Locator.PiguLt.AddProductToCartPage.clickOnBuyButton));
        AddProductToCartPage.clickOnBuyButton();

        actualResult = AddProductToCartPage.itemText();

            Assert.assertTrue(
                    actualResult.contains(expectedResult),
                    "\nActual: %s, \nExpected: %s".formatted(
                            actualResult, expectedResult
                    )
            );
        }
}
