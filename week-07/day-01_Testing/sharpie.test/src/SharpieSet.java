import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SharpieSet {
    List<Sharpie> sharpies;

    public SharpieSet() {
        this.sharpies = new ArrayList<>();
    }

    public int countUsable() {
        int counter = 0;
        for (Sharpie item : this.sharpies) {
            if (item.inkAmount > 5) {
                counter++;
            }
        }
        return counter;
    }

    public void removeTrash() {
        Iterator<Sharpie> iter = sharpies.iterator();

        while (iter.hasNext()) {
            Sharpie item = iter.next();
            if (item.inkAmount > 0 && item.inkAmount < 5) {
                iter.remove();
            }
        }
    }
}
