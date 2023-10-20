package saucedemo.cucumber.stepDev;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class stepLogin {
    WebDriver driver;
    String baseurl ="https://www.saucedemo.com/";
    @Given("Halaman login saucedemo")
    public void halaman_login_saucedemo(){
        driver = new FirefoxDriver();
        driver.get(baseurl);
    }

    @When("Input username")
    public void input_username(){
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
    }
    @And("Input password")
    public void input_password(){
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @And("click Login button")
    public void click_login_button() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("User is on Products page")
    public void user_is_on_products_page() {

    }

    @And("Input Invalid Password")
    public void input_invalid_password() {
        driver.findElement(By.id("password")).sendKeys("123456");
    }

    @Then("User get error message")
    public void user_get_error_message() {
        String ErrorLogin = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[3]/h3")).getText();
        Assert.assertEquals(ErrorLogin,"Epic sadface: Username and password do not match any user in this service");
    }







}
