import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login {
    @Test //tag untuk running script di bawah ini
    public void open_browser() {
        WebDriver driver;
        String baseurl = "https://www.saucedemo.com";

        WebDriverManager.firefoxdriver().setup();

        //apply chrome driver setup
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(baseurl);
        String title = driver.getTitle();
        System.out.println(title);

    }
}
