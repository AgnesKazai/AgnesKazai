import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class CABTest {
    CAB player;

    @Before
    public void setUp() throws Exception {
        player = new CAB();
    }

    @Test
    public void shouldPlayingValueEqualsWithTrue() {
        boolean expectedValue = true;
        boolean actualValue = player.playing;
        assertTrue("This value is false!", expectedValue == actualValue);
    }
    @Test
    public void shouldCowValueEqualsWithZero() {
        int expectedValue = 0;
        int actualValue = player.cow;
        assertEquals("This value is not zero!", expectedValue, actualValue);
    }
    @Test
    public void shouldBullValueEqualsWithZero() {
        int expectedValue = 0;
        int actualValue = player.bull;
        assertEquals("This value is not zero!", expectedValue, actualValue);
    }
}
