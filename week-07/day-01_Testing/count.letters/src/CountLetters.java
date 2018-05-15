import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountLetters {

    public Set<Map.Entry<Character, Integer>> countLetters(String string) {
        Map<Character, Integer> maps = new HashMap<Character, Integer>();
        char[] arr = string.toCharArray();
        for (int i = 0; i < arr.length ; i++) {
            Integer freq = maps.get(arr[i]);
            maps.put(arr[i], (freq == null ? 1 : freq + 1));
        }
        return maps.entrySet();
    }
}
