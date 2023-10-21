package saucedemo.cucumber.stepDev;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class viewProduct {
    WebDriver driver;
    String baseurl ="https://www.saucedemo.com/";
    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page(){
        driver = new FirefoxDriver();
        driver.get(baseurl);
    }

    @And("Input username_valid")
    public void input_username_valid(){
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
    }
    @And("Input password_valid")
    public void input_password_valid(){
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }
    @And("click Login")
    public void click_login() {
        driver.findElement(By.id("login-button")).click();
    }

    @And("The user clicks on the product image")
    public void clicks_product_image(){
        driver.findElement(By.cssSelector("#item_4_img_link > img:nth-child(1)")).click();
    }

    @Then("user can see product details")
    public void user_see_products_details() {

    }


}
