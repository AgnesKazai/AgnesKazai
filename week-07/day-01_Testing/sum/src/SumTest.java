import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SumTest {

    Sum myObjec;
    @Before
    public void setUp() throws Exception {
       myObjec = new Sum();
    }

    @Test
    public void sum() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4, 9, 13, 24));
        assertEquals(50, myObjec.sum(list) );
    }

    @Test
    public void isEmpty() {
        ArrayList<Integer> list = new ArrayList<>();
        assertEquals(0, myObjec.sum(list));
    }

    @Test
    public void listWithOneElement() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        assertEquals(5, myObjec.sum(list));
    }

    @Test
    public void listWithMultipleElements() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(2);
        list.add(10);
        assertEquals(18, myObjec.sum(list));
    }

    @Test
    public void listWithANull() {
        ArrayList<Integer> list = new ArrayList<>();
        assertNotNull(null, myObjec.sum(list));
    }
}