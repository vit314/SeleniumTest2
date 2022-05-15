package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Base {

    String homePath = "C:/selenium/chromedriver.exe";
    String workPath = "D:/Automated Testing/chromedriver.exe";

    public static WebDriver driver;

    @BeforeTest
    public void initializeDriver() {
        System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
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

    // НАЧАЛО ТЕСТА - ОТКРЫТИЕ СТРАНИЦЫ
    public void openPage() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(1000);

        checkTitle();
    }

    // ВВОД ЛОГИН И ПАРОЛЬ
    public void login() throws InterruptedException {
        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");
        Thread.sleep(1000);

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        Thread.sleep(1000);

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
        Thread.sleep(1000);

        checkTitle();
    }

    public void addtocart() throws InterruptedException {
        WebElement addtocartButton = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addtocartButton.click();
        Thread.sleep(1000);

        checkTitle();
    }

    public void shoppingcart() throws InterruptedException {
        WebElement shoppingcartButton = driver.findElement(By.id("shopping_cart_container"));
        shoppingcartButton.click();
        Thread.sleep(1000);

        checkTitle();
    }

    public void remove() throws InterruptedException {
        WebElement removeButton = driver.findElement(By.id("remove-sauce-labs-backpack"));
        removeButton.click();
        Thread.sleep(1000);

        checkTitle();
    }

    public void reactburgermenu() throws InterruptedException {
        WebElement reactburgermenuButton = driver.findElement(By.id("react-burger-menu-btn"));
        reactburgermenuButton.click();
        Thread.sleep(1000);

        checkTitle();
    }

    public void logout() throws InterruptedException {
        WebElement logoutButton = driver.findElement(By.id("logout_sidebar_link"));
        logoutButton.click();
        Thread.sleep(1000);

        checkTitle();
    }


    //ASSERT SORTING PRICES

    public ArrayList<Double> getPriceItemsFromPage() {
        List<WebElement> priceItems = driver.findElements(itemsPrice);
        ArrayList<Double> price = new ArrayList<>();
        for (int i = 0; i < priceItems.size(); i++) {
            price.add(Double.parseDouble(priceItems.get(i).getText().replace("$", "")));
        }
        System.out.println(price);
        return price;
    }

    private By itemsPrice = By.xpath("//div[@class='inventory_item_price']");

    public ArrayList<Double> sortPriceLowToHigh() {
        List<WebElement> priceItems = driver.findElements(itemsPrice);
        ArrayList<Double> price = new ArrayList<>();
        for (int i = 0; i < priceItems.size(); i++) {
            price.add(Double.parseDouble(priceItems.get(i).getText().replace("$", "")));
        }
        price.sort(Comparator.naturalOrder());
        System.out.println(price);
        return price;
    }

}
