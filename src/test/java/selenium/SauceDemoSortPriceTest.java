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

        Thread.sleep(2000);

        WebElement sort = driver.findElement(By.xpath("driver.findElement(By.xpath(\"//select[contains(@class,'sort')]"));
        sort.click();

        Select sortDropdown = new Select(driver.findElement(By.xpath("//select[contains(@class,'sort')]")));
        sortDropdown.selectByValue("lohi");

    }
}
