package selenium;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import base.Base;



import java.time.Duration;

public class FirstTest extends Base {

    @Test
    public void firstTest() throws InterruptedException {

        driver.get("https://www.onliner.by/");
        Thread.sleep(3000);

        WebElement element = driver.findElement(By.name("query"));

        element.sendKeys("вентилятор");
        Thread.sleep(3000);
        element.submit();

        Thread.sleep(3000);
        WebElement vent = driver.findElement(By.xpath("//h2/a[contains(.,'Кошелек')]"));
        vent.click();

        System.out.println(driver.getTitle());
    }
}
