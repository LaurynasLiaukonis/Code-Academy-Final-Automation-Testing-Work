package lt.laurynas.pom.test.piguLt;

import lt.laurynas.pom.pages.piguLt.AddProductToCartPage;
import lt.laurynas.pom.pages.piguLt.LoginPage;
import lt.laurynas.pom.test.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        AddProductToCartPage.openChrome("https://pigu.lt/lt/u/login");
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
}
