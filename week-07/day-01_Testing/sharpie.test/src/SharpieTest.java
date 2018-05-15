import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SharpieTest {
    Sharpie myObject;

    @Before
    public void setUp() throws Exception {
        myObject = new Sharpie("blue", 4.5f);
    }

    @Test
    public void shouldSharpieColorEqualsWithGivenConstructorParameter() {
        String expectedColor = "blue";
        String resultColor = myObject.color;
        assertEquals(expectedColor, resultColor );
    }

    @Test
    public void shouldNOTSharpieColorEqualsWithGivenConstructorParameter() {
        String expectedColor = "red";
        String resultColor = myObject.color;
        assertFalse(expectedColor.equals(resultColor));
    }

    @Test
    public void shouldSharpieWidthEqualsWithGivenConstructorParameter() {
        float expectedWidth = 4.5f;
        float resultWidth = myObject.width;
        assertEquals(expectedWidth,resultWidth , 0);
    }

    @Test
    public void shouldNOTSharpieWidthEqualsWithGivenConstructorParameter() {
        float expectedWidth = 5.5f;
        float resultWidth = myObject.width;
        assertFalse(expectedWidth == myObject.width);
    }

    @Test
    public void useVoidTesting() {
        float expectedNumber = 95.5f;
        myObject.use();
        assertEquals("Not working", expectedNumber, myObject.inkAmount, 0);
    }
}