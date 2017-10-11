import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageExample {

    WebDriver driver = new ChromeDriver();

    //1 WebElement linkMyStore = driver.findElement(By.xpath("//a[@class='logotype']/img[@title='My Store']"));
    //2 By linkMyStoreBy = By.xpath("//a[@class='logotype']/img[@title='My Store']");
    //3 String myStoreString = "//a[@class='logotype']/img[@title='My Store']";

    @FindBy(xpath = "//a[@class='logotype']/img[@title='My Store']")
    WebElement myStore;

    WebElement userRegion = driver.findElement(By.xpath("//span[@class='quantity']"));
    WebElement goodsInCart = driver.findElement(By.xpath("//div[@class='country']"));
    WebElement searchLine = driver.findElement(By.xpath("//input[@name='query']"));
    WebElement listOfCategories = driver.findElement(By.xpath("//div[@id='box-category-tree']/ul"));
    WebElement email = driver.findElement(By.name("email"));
    WebElement password = driver.findElement(By.name("password"));
    WebElement loginButton = driver.findElement(By.name("login"));
    WebElement linkNewCustomers = driver.findElement(By.xpath("//a[text()='New customers click here']"));

    MainPageExample(WebDriver driver) {
        this.driver = driver;
    }

    public void loginAs(String login, String password) {
        email.clear();
        email.sendKeys(login);
        this.password.clear();
        this.password.sendKeys(password);
        loginButton.click();
    }

}
