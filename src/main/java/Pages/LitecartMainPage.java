package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;

import java.util.List;

public class LitecartMainPage {

    @FindBy(className = "tab-content")
    WebElement contentImagesContainer;

    private List<WebElement> getContentImagesContainer() {
        return contentImagesContainer.findElements(By.xpath("//div[contains(@class, 'sticker')]"));
    }

    public LitecartMainPage() {
        PageFactory.initElements(DriverFactory.getDriver(),this);
    }

    public boolean listOfImagesWithStikersIsNotEmpty() {
        return !getContentImagesContainer().isEmpty();
    }

    public int listOfImagesWithStikersSize() {
        return getContentImagesContainer().size();
    }

}
