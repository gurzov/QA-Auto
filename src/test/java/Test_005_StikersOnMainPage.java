import Pages.LitecartMainPage;
import org.junit.*;
import org.junit.Assert;
import utils.DriverFactory;

public class Test_005_StikersOnMainPage {

        private static String appLink = "http://localhost/litecart/";

        @Before public void setUp() {
            DriverFactory.getDriver().get(appLink);
        }

        @Test
        public void findImagesWithStikersOnMainPage() {
            Assert.assertTrue(new LitecartMainPage().listOfImagesWithStikersIsNotEmpty());
        }

        @Test
        public void checkCountOfImagesWithStikersOnMainPage() {
            Assert.assertTrue(new LitecartMainPage().listOfImagesWithStikersSize() > 1);
        }

        @After
        public void tearDown() {
            DriverFactory.shutDown();
        }
}
