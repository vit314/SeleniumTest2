package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstTest {

    @Test
    public void firstTestSelenium() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:/Automated Testing/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://www.onliner.by/");
        Thread.sleep(3000);

//        WebElement element = driver.findElement(By.name("query"));

//        element.sendKeys("вентилятор");
//        Thread.sleep(3000);
//        element.submit();

        Thread.sleep(3000);
        WebElement vent = driver.findElement(By.xpath("//h2/a[contains(.,'Кошелек')]"));
        vent.click();

        System.out.println(driver.getTitle());
//        driver.quit();
    }

}
