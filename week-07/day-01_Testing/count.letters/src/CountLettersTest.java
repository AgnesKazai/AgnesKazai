import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountLettersTest {
    CountLetters myObject;

    @Before
    public void setUp() throws Exception {
       myObject = new CountLetters();
    }

    @Test
    public void count() {
        Map<Character, Integer> maps = new HashMap<Character, Integer>();
        maps.put('a', 1);
        maps.put('p', 2);
        maps.put('l', 1);
        maps.put('e', 1);
        String str = "apple";

        assertEquals(maps.entrySet(), myObject.countLetters(str));
    }
}