package lt.laurynas.pom.test.piguLt;

import lt.laurynas.pom.pages.Locator;
import lt.laurynas.pom.pages.piguLt.AllProductListPage;
import lt.laurynas.pom.test.TestBase;
import lt.laurynas.pom.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class AllProductListTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        AllProductListPage.openChrome("https://pigu.lt/lt/u/login");
    }

    @Test
    public void testAllProductList() {
        String expectedResult = "Tualetinis vanduo Karl Lagerfeld For Him EDT vyrams 100 ml";
        String actualResult;
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));

        AllProductListPage.clickOnAllProducts();
        AllProductListPage.clickOnCosmeticsForMen();
        AllProductListPage.clickOnFilterCheckBox();
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                Locator.PiguLt.AllProductListPage.clickOnThirdFilteredItem));
        AllProductListPage.clickOnFilteredItem();

        actualResult = AllProductListPage.thirdFilteredItemText();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nActual: %s, \nExpected: %s".formatted(
                        actualResult, expectedResult
                )
        );
    }
}
