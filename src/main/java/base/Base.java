package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class Base {

    String homePath = "C:/selenium/chromedriver.exe";
    String workPath = "D:/Automated Testing/chromedriver.exe";

    public static WebDriver driver;

    @BeforeTest
    public void initializeDriver() {
        System.setProperty("webdriver.chrome.driver", homePath);
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @AfterTest
    public void endTest() {
        driver.quit();
    }

    //ПРОВЕРКА ЧТО ОТКРЫЛАСЬ НУЖНАЯ СТРАНИЦА
    public void checkTitle() {
        String titleActual = driver.getTitle();
        String titleExpected = "Swag Labs";

        Assert.assertEquals(titleActual, titleExpected);
        System.out.println("Заголовок страницы проверен");
    }

}
