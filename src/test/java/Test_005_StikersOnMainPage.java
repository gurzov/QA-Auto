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
        public void findImagesWithStickersOnMainPage() {
            Assert.assertTrue(new LitecartMainPage().listOfImagesWithStickersIsNotEmpty());
        }

        @Test
        public void checkCountOfImagesWithStikersOnMainPage() {
            Assert.assertTrue(new LitecartMainPage().listOfImagesWithStickersSize() > 1);
        }

        @Test
        public void checkAllSaleStickersShowSalePrice() {
            Assert.assertTrue(new LitecartMainPage().campaignPriceIsPresentedForEachSaleSticker());
        }

        @After
        public void tearDown() {
            DriverFactory.shutDown();
        }
}
