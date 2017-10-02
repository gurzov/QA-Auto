import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test_002_Admin_Locators {

    @Test
    public void testLitecartAdminLogin2() {

        WebDriver webDriver = new ChromeDriver();
        WebElement username, password, loginButton;
        String strURL= "http://localhost/litecart/admin/login.php";

        webDriver.get(strURL);
        webDriver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        username = webDriver.findElement(By.name("username"));
        password = webDriver.findElement(By.name("password"));
        loginButton = webDriver.findElement(By.cssSelector("button[name=login][value=Login]"));

        username.sendKeys("admin");
        password.sendKeys("admin");
        loginButton.click();

    }
}
