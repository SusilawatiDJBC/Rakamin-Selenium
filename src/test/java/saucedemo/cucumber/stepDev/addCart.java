package saucedemo.cucumber.stepDev;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class addCart {
    WebDriver driver;
    String baseurl ="https://www.saucedemo.com/";
    @Given("The user is on the home page")
    public void the_user_is_on_the_home_page(){
        driver = new FirefoxDriver();
        driver.get(baseurl);
    }

    @And("Input username 2")
    public void input_username2(){
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
    }
    @And("Input password 2")
    public void input_password2(){
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }
    @And("click Login button 2")
    public void click_login_button2() {
        driver.findElement(By.id("login-button")).click();
    }

    @And("The user chooses a \"<item>\" by clicking 'Add To Cart'")
    public void add_to_cart(){
        driver.findElement(By.cssSelector("button[data-test='add-to-cart-sauce-labs-bolt-t-shirt']")).click();
    }

    @And("The user clicks on the shopping cart")
    public void click_shopping_cart(){
        driver.findElement(By.className("shopping_cart_link")).click();
    }

    @Then("There should be \"1\" items in the shopping cart")
    public void user_is_on_products_page() {

    }


}
