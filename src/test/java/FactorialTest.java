import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {

    @Test
    public void testFactorialPositive() {
        Assert.assertEquals(Factorial.factorial(5), 120);
    }

    @Test
    public void testFactorialZero() {
        Assert.assertEquals(Factorial.factorial(0), 1);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialNegative() {
        Factorial.factorial(-1);
    }
}