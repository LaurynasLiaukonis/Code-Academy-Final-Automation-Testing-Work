package lt.laurynas.pom.test.piguLt;

import lt.laurynas.pom.pages.Locator;
import lt.laurynas.pom.pages.piguLt.LoginPage;
import lt.laurynas.pom.test.TestBase;
import lt.laurynas.pom.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class LoginTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        LoginPage.openChrome("https://pigu.lt/lt/u/login");
    }


    @Test
    public void testLogin() {
        String userEmail = "testavimas420@gmail.com";
        String expectedEmail = "testavimas420@gmail.com";
        String actualEmail;
        String userPassword = "testavimas420";

        LoginPage.enterEmail(userEmail);
        LoginPage.enterPassword(userPassword);
        LoginPage.clickOnButton();
        actualEmail = LoginPage.findEmail();


        Assert.assertEquals(actualEmail, expectedEmail, "Invalid email");
    }

    @Test
    public void testFailedLogin() {
        String userEmail = "asdadded@gmail.com";
        String expectedErrorMessage = "Neteisingi prisijungimo duomenys";
        String actualErrorMessage;
        String userPassword = "testavimas420";

        LoginPage.enterEmail(userEmail);
        LoginPage.enterPassword(userPassword);
        LoginPage.clickOnButton();
        actualErrorMessage = LoginPage.findErrorMessage();


        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
    }

    @Test
    public void testSearchBar() {
        String searchValue = "televizorius";
        String expectedResult = "Televizorius Samsung UE43CU7172UXXH, 43\" (~109 cm)";
        String actualResult;

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(30));

        LoginPage.enterValueIntoSearchBar(searchValue);
        LoginPage.clickOnSearchButton();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locator.PiguLt.Login.clickOnFirstItem));
        LoginPage.clickOnFirstItem();


        actualResult = LoginPage.firstItemText();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nActual: %s, \nExpected: %s".formatted(
                        actualResult, expectedResult
                )
        );
    }
}