package selenium;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

public class SauceDemoSortPriceTest extends Base {

    @Test
    public void sauceDemoSortPriceTest() throws InterruptedException {

        openPage();

        login();

        Thread.sleep(20000);


        WebElement sort = driver.findElement(By.xpath("//span[@class='product_sort_container']"));
        sort.click();

        Select sortDropdown = new Select(driver.findElement(By.xpath("//span[@class='active_option']")));
        sortDropdown.selectByValue("lohi");

    }
}
