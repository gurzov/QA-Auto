import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test_001_Admin {

    @Test
    public void testLitecartAdminLogin() {

        WebDriver webDriver = new ChromeDriver();
        WebElement username, password, loginButton;
        String strURL= "http://localhost/litecart/admin/login.php";

        webDriver.get(strURL);
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        username = webDriver.findElement(
                By.xpath("//input[@class='form-control' and @name='username']"));
        password = webDriver.findElement(
                By.xpath("//input[@class='form-control' and @name='password']"));
        loginButton = webDriver.findElement(
                By.xpath("//button[@class='btn btn-default' and @name='login']"));

        username.sendKeys("admin");
        password.sendKeys("admin");
        loginButton.click();

//       webDriver.quit();
    }
}
