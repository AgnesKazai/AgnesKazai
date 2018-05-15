import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {
    int add(int a, int b) {
        return a + b;
    }

    int maxOfThree(int a, int b, int c) {
        int max;
        if (a > b)
            max = a;
        else
            max = b;
        if (c > max)
            return c;
        else
            return max;
    }

    int median(List<Integer> pool) {
        Collections.sort(pool);
        return pool.get((pool.size() - 1) / 2);
    }

    boolean isVowel(char c) {
        return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(c);
    }

    String translate(String hungarian) {
        Character[] vowels = {'a', 'u', 'o', 'e', 'i'};
        String teve = hungarian;
        int length = vowels.length;
        for (int i = 0; i < length; i++) {
            char c = vowels[i];
            if (teve.contains("" + c)) {
                teve = String.join(c + "v" + c, teve.split("" + c));
            }
        }
        return teve;
    }
}
