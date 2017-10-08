package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;

import java.util.List;

public class AdminPanel {

    @FindBy(id = "box-apps-menu")
    WebElement sideMenuContainer;

    public AdminPanel() {
        PageFactory.initElements(DriverFactory.getDriver(),this);
    }

    public boolean isHeaderPresent() {
        return isElementPresent(By.tagName("h1"));
    }

    private boolean isElementPresent(By locator) {
        return !DriverFactory.getDriver().findElements(locator).isEmpty();
    }

    private List<WebElement> getSideMenuContainer() {
        return sideMenuContainer.findElements(By.id("app-"));
    }

    private List<WebElement> getSideMenuContainer2() {
        return sideMenuContainer.findElements(By.xpath("//li[contains(@id,'doc-')]"));
    }

    public void clickOnSideMenuItem() {
        int menuItemsCount1 = getSideMenuContainer().size();
        WebElement currentMenuItem, currentMenuItem2;
        for(int i=0; i< menuItemsCount1; i++) {
            currentMenuItem = getSideMenuContainer().get(i);
            clickOnMenuItem(currentMenuItem);
            int menuItemsCount2 = getSideMenuContainer2().size();
            if (menuItemsCount2 > 0) {
                for (int j = 0; j < menuItemsCount2; j++) {
                    currentMenuItem2 = getSideMenuContainer2().get(j);
                    clickOnMenuItem(currentMenuItem2);
                }
            }
        }
    }

    private void clickOnMenuItem(WebElement menuItem) {
        System.out.println(menuItem.getText());
        menuItem.click();

    }

}
