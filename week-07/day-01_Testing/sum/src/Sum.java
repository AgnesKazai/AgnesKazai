import java.util.ArrayList;
import java.util.List;

public class Sum {

    public int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer item : list) {
            sum += item;
        }
        return sum;
    }
}
