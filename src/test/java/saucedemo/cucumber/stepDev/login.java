package saucedemo.cucumber.stepDev;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login {
    WebDriver driver;
    String baseurl = "https://www.saucedemo.com/";
    @Given("Halaman login saucedemo")
    public void halaman_login_saucedemo(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get(baseurl);
    }

    @When("Input username")
    public void input_username(String username) {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
    }

    @And("Input Password")
    public void input_password(String password) {
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @And("click Login button")
    public void click_login_button() {
        driver.findElement(By.id("login-button")).click();
    }

//    @Then("User is on Products page")
//    public void user_is_on_products_page() {
//        driver.findElement(By.xpath("//div[contains(text(),'products')]"));
//        String username = driver.findElement(By.xpath("//dd[contain(text(),'hai')]/preceding-sibling::dt")).getText();
//        Assert.assertEquals(username, "standard_user");
//    }
//
//    @And("Input Invalid Password")
//    public void input_invalid_password() {
//        driver.findElement(By.id("password")).sendKeys("123456");
//    }
//
//    @Then("User get error message")
//    public void user_get_error_message() {
//        String errorLogin = driver.findElement(By.xpath("//div[@role='alert']")).getText();
//        Assert.assertEquals(errorLogin, "Kredensial yang Anda berikan salah");
//    }


}
