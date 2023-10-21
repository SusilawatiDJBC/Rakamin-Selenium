package saucedemo.cucumber.stepDev;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkout {
    WebDriver driver;
    String baseurl ="https://www.saucedemo.com";
    @Given("The user is on the home page2")
    public void the_user_is_on_the_home_page2(){
        driver = new FirefoxDriver();
        driver.get(baseurl);
    }

    @And("Input username 3")
    public void input_username3(){
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
    }
    @And("Input password 3")
    public void input_password3(){
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }
    @And("click Login button 3")
    public void click_login_button3() {
        driver.findElement(By.id("login-button")).click();
    }

    @And("The user chooses a \"<item>\" by clicking 'Add To Cart'2")
    public void add_to_cart2(){
        driver.findElement(By.cssSelector("button[data-test='add-to-cart-sauce-labs-bolt-t-shirt']")).click();
    }

    @And("The user clicks on the shopping cart2")
    public void click_shopping_cart2(){
        driver.findElement(By.className("shopping_cart_link")).click();
    }

    @And("click checkout button")
    public void checkout(){
        driver.findElement(By.id("checkout")).click();
    }
    @And("input first name")
    public void input_first_name(){
        driver.findElement(By.id("first-name")).sendKeys("Jihan Sean");
    }
    @And("input last name")
    public void input_last_name(){
        driver.findElement(By.id("last-name")).sendKeys("Rudge");
    }
    @And("input zip or postal code")
    public void input_postal_code(){
        driver.findElement(By.id("postal-code")).sendKeys("20132");
    }
    @And("The user clicks on button Continue")
    public void click_continue() {
        driver.findElement(By.id("continue")).click();
    }
    @And("clicks finish")
    public void clicks_finish() {
        driver.findElement(By.id("finish")).click();
    }
    @Then("User get message checkout complete")
    public void user_get_message_checkout_complete() {
        //driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
//        *[@id="checkout_complete_container"]/h2
        String CheckoutPageAssert = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
        Assert.assertEquals(CheckoutPageAssert, "Checkout: Complete!");

    }

    @Then("User get error message postal code required")
    public void user_get_error_message_postal_code_required() {
        String ErrorLogin = driver.findElement(By.cssSelector("#checkout_info_container > div > form > div.checkout_info > div.error-message-container.error > h3")).getText();
        Assert.assertEquals(ErrorLogin,"Error: Postal Code is required");
    }
}
