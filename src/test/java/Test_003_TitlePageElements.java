import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test_003_TitlePageElements {

    @Test
    public void findTitlePageElements() {

        WebDriver webDriver = new ChromeDriver();
        WebElement linkMyStore, userRegion, goodsInCart, searchLine, listOfCategories,
                username, password, loginButton, linkNewCustomers;
        String strURL= "http://localhost/litecart/";

        webDriver.get(strURL);
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        linkMyStore = webDriver.findElement(
                By.xpath("//a[@class='logotype']/img[@title='My Store']"));
        System.out.println(linkMyStore);
        userRegion = webDriver.findElement(
                By.xpath("//div[@class='country']"));
        System.out.println(userRegion);
        goodsInCart = webDriver.findElement(
                By.xpath("//span[@class='quantity']"));
        System.out.println(goodsInCart);
        searchLine = webDriver.findElement(
                By.xpath("//input[@name='query']"));
        System.out.println(searchLine);
        listOfCategories = webDriver.findElement(By.xpath("//div[@id='box-category-tree']/ul"));
        System.out.println(listOfCategories);
        username = webDriver.findElement(By.name("email"));
        System.out.println(username);
        password = webDriver.findElement(By.name("password"));
        System.out.println(password);
        loginButton = webDriver.findElement(By.name("login"));
        System.out.println(loginButton);
        linkNewCustomers = webDriver.findElement(By.xpath("//a[text()='New customers click here']"));
        if(linkNewCustomers.isDisplayed()) {System.out.println("OK");}
//        webDriver.quit();
    }
}
