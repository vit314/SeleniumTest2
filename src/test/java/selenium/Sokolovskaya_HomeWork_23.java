package selenium;

import base.Base;
import org.testng.annotations.Test;

public class Sokolovskaya_HomeWork_23 extends Base {

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
