package lt.laurynas.pom.test.piguLt;

import lt.laurynas.pom.pages.Locator;
import lt.laurynas.pom.pages.piguLt.SearchBarPage;
import lt.laurynas.pom.test.TestBase;
import lt.laurynas.pom.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class SearchBarTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {SearchBarPage.openChrome("https://pigu.lt/lt/u/login");}

    @Test
    public void testSearchBar() {
        String searchValue = "televizorius";
        String expectedResult = "Televizorius Samsung UE43CU7172UXXH, 43\" (~109 cm)";
        String actualResult;

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(30));

        SearchBarPage.enterValueIntoSearchBar(searchValue);
        SearchBarPage.clickOnSearchButton();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locator.PiguLt.SearchBar.clickOnFirstItem));
        SearchBarPage.clickOnFirstItem();


        actualResult = SearchBarPage.firstItemText();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nActual: %s, \nExpected: %s".formatted(
                        actualResult, expectedResult
                )
        );
    }
}
