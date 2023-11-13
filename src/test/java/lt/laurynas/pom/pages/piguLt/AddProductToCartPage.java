package lt.laurynas.pom.pages.piguLt;

import lt.laurynas.pom.pages.Common;
import lt.laurynas.pom.pages.Locator;

public class AddProductToCartPage {
    public static void openChrome(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void clickOnAllProducts() {
        Common.clickOnButton(Locator.PiguLt.AddProductToCartPage.clickOnAllProducts);
    }

    public static void clickOnPhonesAndAccessories() {
        Common.clickOnPhonesAndAccessoriesText(Locator.PiguLt.AddProductToCartPage.clickOnText);
    }

    public static void clickOnPhoneScreenSavers() {
        Common.clickOnButton(Locator.PiguLt.AddProductToCartPage.clickOnPhoneScreenSavers);
    }

    public static void clickOnFirstItem() {
        Common.clickOnButton(Locator.PiguLt.AddProductToCartPage.clickOnFirstItem);
    }

    public static void clickOnAddToCart() {
        Common.clickOnButton(Locator.PiguLt.AddProductToCartPage.clickOnAddToCart);
    }

    public static void clickOnBuyButton() {
        Common.clickOnButton(Locator.PiguLt.AddProductToCartPage.clickOnBuyButton);
    }

    public static String itemText() {
        return Common.getTextFromElement(Locator.PiguLt.AddProductToCartPage.itemText);
    }
}
