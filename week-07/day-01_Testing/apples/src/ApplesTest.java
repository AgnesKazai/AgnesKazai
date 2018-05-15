import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {
    Apples myObject;

    @Before
    public void setUp() throws Exception {
        myObject = new Apples();
    }

    @Test
    public void getApple() {
        String message = "apple";
        assertEquals(message, myObject.getApple());
    }
}