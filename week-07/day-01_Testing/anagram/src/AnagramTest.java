import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
    Anagram anagram;

    @Before
    public void setUp() throws Exception {
        anagram = new Anagram();
    }

    @Test
    public void checkAnagram() {
        String s1 = "below";
        String s2 = "elbow";
        assertTrue(anagram.checkAnagram(s1,s2));
    }

    @Test
    public void isEmpyString() {
        String s1= "";
        String s2 = "";
        assertNotNull(null, anagram.checkAnagram(s1, s2));
    }

    @Test
    public void notAnagram() {
        String s1= "elbow";
        String s2 = "house";
        assertFalse(anagram.checkAnagram(s1, s2));
    }

    @Test
    public void notTheSameLength() {
        String s1 = "house";
        String s2 = "dog";
        assertFalse(anagram.checkAnagram(s1, s2));
    }
}