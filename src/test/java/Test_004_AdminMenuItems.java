import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Test_004_AdminMenuItems {

    @Test
    public void testMenuItemsAndPageTitles () {

        WebDriver webDriver = new ChromeDriver();
        String strURL= "http://localhost/litecart/admin/login.php";

        webDriver.get(strURL);
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement username = webDriver.findElement(By.name("username"));
        WebElement password = webDriver.findElement(By.name("password"));
        WebElement loginButton = webDriver.findElement(By.cssSelector("button[name=login][value=Login]"));

        username.sendKeys("admin");
        password.sendKeys("admin");
        loginButton.click();

        if (webDriver.findElement(By.xpath("//a[@title='Logout']")).isDisplayed()) {

            List<String> listMenuItemTitle = new ArrayList<String>();
            listMenuItemTitle.add("Appearance");
            listMenuItemTitle.add("Catalog");
            listMenuItemTitle.add("Countries");
            listMenuItemTitle.add("Currencies");
            listMenuItemTitle.add("Customers");
            listMenuItemTitle.add("Geo Zones");
            listMenuItemTitle.add("Languages");
            listMenuItemTitle.add("Modules");
            listMenuItemTitle.add("Orders");
            listMenuItemTitle.add("Pages");
            listMenuItemTitle.add("Reports");
            listMenuItemTitle.add("Settings");
            listMenuItemTitle.add("Slides");
            listMenuItemTitle.add("Tax");
            listMenuItemTitle.add("Translations");
            listMenuItemTitle.add("Users");
            listMenuItemTitle.add("vQmods");

            for (String currentMenuItemTitle: listMenuItemTitle) {
                WebElement currentMenuItemLink = webDriver.findElement(By.xpath("//a/span[text()='"+currentMenuItemTitle+"']"));

                if (currentMenuItemLink.isDisplayed()) {
                    clickOnMenuItem(currentMenuItemLink,currentMenuItemTitle);
                }

            }
        }
        webDriver.quit();
    }

    private void clickOnMenuItem(WebElement menuItemLink, String menuItemTitle) {
        menuItemLink.click();
    }
}
