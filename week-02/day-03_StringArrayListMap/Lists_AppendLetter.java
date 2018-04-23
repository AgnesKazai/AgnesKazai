// Create a method called "appendA()" that adds "a" to every string in the "far" list.
// The parameter should be a list.
// The output should be: "kutya", "macska", "kacsa", "róka", "halacska"

import java.util.Arrays;
import java.util.List;

public class Lists_AppendLetter {
    public static void main(String[] args) {
        List<String> far = Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk");

        System.out.println(appendA(far));
    }

    public static List appendA(List<String> far) {
        for (int i = 0; i < far.size(); i++) {
            far.set(i, far.get(i) + "a");
        }
        return far;
    }
}
