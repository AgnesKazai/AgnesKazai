import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by aze on 2017.04.04..
 */
class ExtensionTest {

    Extension extension = new Extension();

    @Test
    void testAdd_2and3is5() {
        assertEquals(13, extension.add(10, 3));
    }

    @Test
    void testAdd_1and4is5() {
        assertEquals(7, extension.add(4, 3));
    }

    @Test
    void testMaxOfThree_first() {
        assertEquals(6, extension.maxOfThree(6, 4, 3));
    }

    @Test
    void testMaxOfThree_second() {
        assertEquals(9, extension.maxOfThree(6, 9, 3));
    }

    @Test
    void testMaxOfThree_third() {
        assertEquals(12, extension.maxOfThree(3, 9, 12));
    }

    @Test
    void testMedian_three() {
        assertEquals(3, extension.median(Arrays.asList(2, 7, 3, 5)));
    }

    @Test
    void testMedian_five() {
        assertEquals(4, extension.median(Arrays.asList(6, 2, 4, 3, 5)));
    }

    @Test
    void testIsVowel_a() {
        assertTrue(extension.isVowel('a'));
    }

    @Test
    void testIsVowel_t() {
        assertFalse(extension.isVowel('t'));
    }

    @Test
    void testTranslate_bemutatkozik() {
        assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
    }

    @Test
    void testTranslate_lagopus() {
        assertEquals("lavagovopuvus", extension.translate("lagopus"));
    }
}
