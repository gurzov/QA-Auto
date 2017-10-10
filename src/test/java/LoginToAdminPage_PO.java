import Pages.AdminPanelPage;
import Pages.LoginToAdminPage;
import org.junit.*;
import utils.DriverFactory;
import utils.PropertyHelper;

import static org.junit.Assert.assertTrue;

public class LoginToAdminPage_PO {

    String appLink = PropertyHelper.getProperty("appUrl");
    String username = PropertyHelper.getProperty("username");
    String password = PropertyHelper.getProperty("password");

    @Before public void setUp() {
        DriverFactory.getDriver().get(appLink);
    }

    @Test
    public void loginToAdminPanel() {
       new LoginToAdminPage().loginAsUser(username,password);
    }

    @Test
    public void checkThatAdminPanelDirectoriesContainHeaders() {
        new LoginToAdminPage().loginAsUser(username,password);
        new AdminPanelPage().clickAllMenuItems();
        Assert.assertTrue(new AdminPanelPage().isHeaderPresent());

    }

    @After
    public void tearDown() {
        DriverFactory.shutDown();
    }

}
