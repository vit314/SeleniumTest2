package selenium;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

public class SauceDemoSortPriceTest extends Base {

    @Test
    public void sauceDemoSortPriceTest() throws InterruptedException {

        openPage();

        login();

        WebElement sortPriceLowToHigh = driver.findElement(By.xpath("//select[@class='product_sort_container']//option[@value='lohi']"));
        sortPriceLowToHigh.click();

        Assert.assertEquals(getPriceItemsFromPage(), sortPriceLowToHigh());

    }
}
