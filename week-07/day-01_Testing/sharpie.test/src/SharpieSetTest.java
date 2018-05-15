import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SharpieSetTest {
    SharpieSet sharpieSet = new SharpieSet();

    List<Sharpie> sharpies;

    @Before
    public void initialize() {
        Sharpie sharpie = new Sharpie("blue", 3.5f);
        sharpieSet.sharpies.add(sharpie);
        Sharpie sharpie1 = new Sharpie("green", 2.7f);
        sharpieSet.sharpies.add(sharpie1);
        Sharpie sharpie2 = new Sharpie("red", 2.7f);
        sharpieSet.sharpies.add(sharpie2);
        Sharpie sharpie3 = new Sharpie("yellow", 4.0f);
        sharpieSet.sharpies.add(sharpie3);
        Sharpie sharpie4 = new Sharpie("black", 1.4f);
        sharpieSet.sharpies.add(sharpie4);
        Sharpie sharpie5 = new Sharpie("purple", 2.0f);
        sharpieSet.sharpies.add(sharpie5);
    }

    @Test
    public void  checkIfValidCountUsableMethod() {
        int expectedNumber = 6;
        int resultNumber = sharpieSet.countUsable();
        assertEquals(expectedNumber, resultNumber);
    }

    @Test
    public void  checkIfValidRemoveTrashMethodh() {
        sharpieSet.sharpies.get(4).inkAmount = 2f;
        sharpieSet.removeTrash();
        assertEquals(5, sharpieSet.countUsable() );
    }
}