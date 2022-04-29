package tests;

import base.Base;
import base.UserData;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class SortPriceFromLowToHighPriceTest extends Base {

    @Test
    public void sortPriceFromLowToHighPriceTest() {

        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        loginPage.login(UserData.userNameLogin, UserData.userPassword);

        homePage.clickPriceLowToHighButton();

        Assert.assertEquals(homePage.getPriceItemsFromPage(), homePage.sortPriceLowToHigh());

    }
}
