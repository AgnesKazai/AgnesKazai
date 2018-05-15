import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {
    Fibonacci myObject;

    @Before
    public void setUp() throws Exception {
        myObject = new Fibonacci();
    }

    @Test(expected = IllegalStateException.class)
    public void fibonacciNumbersZero() throws Exception {
        assertEquals(0, myObject.fibonacciNumbers(0));
    }

    @Test
    public void fibonacciSecond() throws Exception {
        int num = 2;
        assertEquals(1, myObject.fibonacciNumbers(num));
    }

    @Test(expected = IllegalStateException.class)
    public void fibonacciNegativNumber() throws Exception {
        myObject.fibonacciNumbers(-2);
    }
}