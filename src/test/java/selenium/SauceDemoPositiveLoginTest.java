package selenium;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SauceDemoPositiveLoginTest extends Base {

    @Test
    public void sauceDemoPositiveLoginTest() throws InterruptedException {

        // НАЧАЛО ТЕСТА
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(1000);

        checkTitle();

        // ВВОД ЛОГИН И ПАРОЛЬ
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
}
