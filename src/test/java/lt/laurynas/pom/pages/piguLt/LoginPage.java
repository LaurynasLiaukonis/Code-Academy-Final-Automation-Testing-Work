package lt.laurynas.pom.pages.piguLt;

import lt.laurynas.pom.pages.Common;
import lt.laurynas.pom.pages.Locator;

public class LoginPage {
    public static void openChrome(String url){
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void enterEmail(String email) {
        Common.sendKeystoElement(Locator.PiguLt.Login.enterEmail, email);
    }

    public static void enterPassword(String password) {
        Common.sendKeystoElement(Locator.PiguLt.Login.enterPassword, password);
    }

    public static void clickOnButton() {
        Common.clickOnButton(Locator.PiguLt.Login.clickLoginToAccount);
    }

    public static String findEmail() {
        return Common.getTextFromElement(Locator.PiguLt.Login.findEmail);
    }

    public static String findErrorMessage() {
        return Common.getTextFromElement(Locator.PiguLt.Login.findErrorMessage);
    }

    public static void enterValueIntoSearchBar(String searchValue) {
        Common.sendKeystoElement(Locator.PiguLt.Login.enterValueIntoSearchBar, searchValue);
    }

    public static void clickOnSearchButton() {
        Common.clickOnButton(Locator.PiguLt.Login.clickOnSearchButton);
    }

    public static void clickOnFirstItem() {
        Common.clickOnButton(Locator.PiguLt.Login.clickOnFirstItem);
    }

    public static String firstItemText() {
        return Common.getTextFromElement(Locator.PiguLt.Login.firstItemText);
    }

    public static void clickOnAllProducts() {
        Common.clickOnAllProductsList(Locator.PiguLt.Login.clickOnAllProducts);
    }

    public static void clickOnCosmeticsForMen() {
        Common.clickOnTextCosmeticsForMen(Locator.PiguLt.Login.clickOnText);
    }

    public static void clickOnFilterCheckBox() {
        Common.clickOnFilterBox(Locator.PiguLt.Login.clickOnFilterCheckBox);
    }

    public static void clickOnFilteredItem() {
        Common.clickOnFilteredItem(Locator.PiguLt.Login.clickOnThirdFilteredItem);
    }

    public static String thirdFilteredItemText() {
        return Common.getTextFromElement(Locator.PiguLt.Login.thirdItemText);
    }
}
