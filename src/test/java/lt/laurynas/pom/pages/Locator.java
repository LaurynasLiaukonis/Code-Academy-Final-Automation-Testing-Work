package lt.laurynas.pom.pages;

import org.openqa.selenium.By;

public class Locator {

    public static class PiguLt {

        public static class Login {
            public static By enterEmail = By.xpath("//input[@type='email'][1]");
            public static By enterPassword = By.xpath("//input[@type='password'][1]");
            public static By clickLoginToAccount = By.xpath(
                    "//input[@class='btn btn-primary btn-full-width'][1]");
            public static By findEmail = By.xpath("//a[@class='name']");
            public static By findErrorMessage = By.xpath("//div[@class='error-message']");
        }

        public static class SearchBar {
            public static By enterValueIntoSearchBar = By.xpath("//input[@type='text'][1]");
            public static By clickOnSearchButton = By.xpath("//i[@class='c-icon--search']");
            public static By clickOnFirstItem = By.xpath(
                    "//a[@class='product-image-container'][1]");
            public static By firstItemText = By.xpath("//h1[@class='c-product__name']");
        }

        public static class AllProductListPage {
            public static By clickOnAllProducts = By.xpath("//span[text()='Visos prekės']");
            public static By clickOnText = By.xpath("//span[text()='Kosmetika vyrams']");
            public static By clickOnFilterCheckBox = By.xpath("//label[@for='itemcategory353']");
            public static By clickOnThirdFilteredItem = By.xpath(
                    "//img[@title='Tualetinis vanduo Karl Lagerfeld For Him EDT vyrams 100 ml']");
            public static By thirdItemText = By.xpath("//h1[@class='c-product__name']");
        }

        public class AddProductToCartPage {
            public static By clickOnAllProducts = By.xpath("//span[text()='Visos prekės']");
            public static By clickOnText = By.xpath(
                    "//span[text()='Mobilieji telefonai ir jų priedai,']");
            public static By clickOnPhoneScreenSavers = By.xpath(
                    "//img[@alt='Apsauginės plėvelės telefonams']");
            public static By clickOnFirstItem = By.xpath(
                    "//img[@title='DELTACO ekrano apsauga skirta " +
                            "Apple iPhone 12/ 12 Pro 6.1, 2,5D grūdinto stiklo, 9H kietumo SCRN-20IP61a']");
            public static By clickOnAddToCart = By.xpath(
                    "//div[@class='c-btn--primary h-btn-intent--atc']");
            public static By clickOnBuyButton = By.xpath("//a[@id='buy']");
            public static By itemText = By.xpath("//div[@class='product-name']");
        }
    }
}




