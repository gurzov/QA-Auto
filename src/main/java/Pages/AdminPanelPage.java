package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;

import java.util.List;

public class AdminPanelPage {

    @FindBy(id = "box-apps-menu")
    WebElement sideMenuContainer;

    @FindBy(className = "docs")
    WebElement insideMenuContainer;

    public AdminPanelPage() {
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

    public int getSizeOfList(List<WebElement> list) {
        return list.size();
    }

    public void clickAllMenuItems() {
        WebElement currentMenuItem;

        int menuCounter1 = getSizeOfList(getSideMenuContainer());
        for(int i=0; i< menuCounter1; i++) {
            currentMenuItem = getSideMenuContainer().get(i);
            currentMenuItem.click();
            int menuCounter2 = getSizeOfList(getSideMenuContainer2());
            if (menuCounter2 > 0) {
                for (int j = 0; j < menuCounter2; j++) {
                    currentMenuItem = getSideMenuContainer2().get(j);
                    currentMenuItem.click();
                }
            }
        }
     }

    public AdminPanelPage clickOneMenuItem(WebElement menuItem) {
        System.out.println(menuItem.getText());
        menuItem.click();
        return this;
    }

}
