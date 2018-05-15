import java.util.Arrays;

public class Anagram {

    public boolean checkAnagram(String s1, String s2) {
        StringBuilder string1 = new StringBuilder();
        StringBuilder string2 = new StringBuilder();
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if (s1 == null || s2 == null) {
            return false;
        } else if (s1.length() != s2.length()) {
            return false;
        }
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (char item : arr1) {
            string1.append(item);
        }
        for (char item : arr2) {
            string2.append(item);
        }

        if (string1.toString().equals(string2.toString())) {
            return true;
        } else {
            return false;
        }
    }
}
