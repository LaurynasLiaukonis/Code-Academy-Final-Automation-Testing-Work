package lt.laurynas.pom.pages.piguLt;

import lt.laurynas.pom.pages.Common;
import lt.laurynas.pom.pages.Locator;

public class SearchBarPage {
    public static void openChrome(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }
    public static void enterValueIntoSearchBar(String searchValue) {
        Common.sendKeystoElement(Locator.PiguLt.SearchBar.enterValueIntoSearchBar, searchValue);
    }

    public static void clickOnSearchButton() {
        Common.clickOnButton(Locator.PiguLt.SearchBar.clickOnSearchButton);
    }

    public static void clickOnFirstItem() {
        Common.clickOnButton(Locator.PiguLt.SearchBar.clickOnFirstItem);
    }

    public static String firstItemText() {
        return Common.getTextFromElement(Locator.PiguLt.SearchBar.firstItemText);
    }
}
