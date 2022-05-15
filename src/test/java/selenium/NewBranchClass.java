package selenium;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewBranchClass extends Base {

    @Test
    public void sauceDemoPositiveLoginTest() throws InterruptedException {

        openPage();

        login();

        addtocart();

        shoppingcart();

        remove();

        reactburgermenu();

        logout();


    }
}
