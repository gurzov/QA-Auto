import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@RunWith(Parameterized.class)
public class ParametrizedTest {

    int number;
    String value;

    public ParametrizedTest(int number, String value) {
        this.number = number;
        this.value = value;
    }

    @Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {1,"One"},
                {2,"Two"}};
    }

    @Test
    public void someBaseTest() {
        System.out.println(number + " : " + value);
    }

    @Test
    public void someAnotherTest() {
        System.out.println("another test");
    }

}
