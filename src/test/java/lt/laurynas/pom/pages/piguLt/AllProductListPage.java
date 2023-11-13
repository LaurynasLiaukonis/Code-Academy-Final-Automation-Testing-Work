package lt.laurynas.pom.pages.piguLt;


import lt.laurynas.pom.pages.Common;
import lt.laurynas.pom.pages.Locator;

public class AllProductListPage {

    public static void openChrome(String url){
        Common.setUpChrome();
        Common.openUrl(url);
    }
    public static void clickOnAllProducts() {
        Common.clickOnAllProducts(Locator.PiguLt.AllProductListPage.clickOnAllProducts);
    }

    public static void clickOnCosmeticsForMen() {
        Common.clickOnTextCosmeticsForMen(Locator.PiguLt.AllProductListPage.clickOnText);
    }

    public static void clickOnFilterCheckBox() {
        Common.clickOnFilterBox(Locator.PiguLt.AllProductListPage.clickOnFilterCheckBox);
    }

    public static void clickOnFilteredItem() {
        Common.clickOnFilteredItem(Locator.PiguLt.AllProductListPage.clickOnThirdFilteredItem);
    }

    public static String thirdFilteredItemText() {
        return Common.getTextFromElement(Locator.PiguLt.AllProductListPage.thirdItemText);
    }
}
