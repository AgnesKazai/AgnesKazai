// Check if list contains all of the following elements: 4,8,12,16
// Create a method that accepts list as an input
// it should return "true" if it contains all, otherwise "false"

import java.util.ArrayList;
import java.util.Arrays;

public class Lists_IsInList_VI {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));

        System.out.println(checkNums(list));

    }

    private static Boolean checkNums(ArrayList<Integer> list) {
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(4, 8, 12, 16));
        Boolean methodmessage = false;

        if (list.containsAll(list2)) {
            return true;
        } else {
            return false;
        }
    }
}
