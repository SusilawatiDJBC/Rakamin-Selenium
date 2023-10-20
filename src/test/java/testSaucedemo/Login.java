package testSaucedemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
    @Test
    public void success_login_case(){
        WebDriver driver;
        String baseurl = "https://www.saucedemo.com/";

        WebDriverManager.firefoxdriver().setup();

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(baseurl);

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        driver.close();
    }

    @Test
    public void failed_login_case(){
        WebDriver driver;
        String baseurl = "https://www.saucedemo.com/";

        WebDriverManager.firefoxdriver().setup();

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(baseurl);

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_12345");
        driver.findElement(By.id("login-button")).click();

        String ErrorLogin = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[3]/h3")).getText();
        Assert.assertEquals(ErrorLogin,"Epic sadface: Username and password do not match any user in this service");

        driver.close();
    }
}
