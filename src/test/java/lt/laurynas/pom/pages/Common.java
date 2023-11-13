package lt.laurynas.pom.pages;

import lt.laurynas.pom.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Common {
    public static void setUpChrome() {
        Driver.setChromeDriver();
    }

    public static void openUrl(String url) {
        Driver.getDriver().get(url);
    }

    public static void quitDriver() {
        Driver.quitDriver();
    }

    private static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public static void sendKeystoElement(By locator, String text) {
        getElement(locator).sendKeys(text);
    }

    public static void clickOnButton(By locator) {
        getElement(locator).click();
    }

    public static String getTextFromElement(By locator) {
        return getElement(locator).getText();
    }

    public static void clickOnAllProductsList(By locator) {
        getElement(locator).click();
    }

    public static void clickOnTextCosmeticsForMen(By locator) {
        getElement(locator).click();
    }

    public static void clickOnFilterBox(By locator) {
        getElement(locator).click();
    }

    public static void clickOnFilteredItem(By locator) {
        getElement(locator).click();
    }
}