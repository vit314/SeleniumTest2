package tests;

import base.Base;
import base.UserData;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class SauceDemoPositiveLoginTest extends Base {

    @Test
    public void sauceDemoPositiveLoginTest() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        loginPage.login(UserData.userNameLogin, UserData.userPassword);


    }
}
