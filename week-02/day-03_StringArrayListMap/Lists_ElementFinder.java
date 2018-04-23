// Write a method that checks if the arrayList contains "7" if it contains return "Hoorray" otherwise return "Noooooo"
// The output should be: "Noooooo"
// Do this again with a different solution using different list methods!

import java.util.ArrayList;
import java.util.Arrays;

public class Lists_ElementFinder {
    public static void main(String[] args) {
        //ArrayList<Integer> arrayList = (ArrayList)Arrays.asList(1,2,3,4,5);
        //I commented it out because it was wrong, I rewrote that.

        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println(containsSeven(arrayList));
    }

    // Solution 1
    public static String containsSeven(ArrayList<Integer> arrayList) {
        String methodMessage = " ";

        if (arrayList.contains(7)) {
            methodMessage = "Hoorray";
        } else {
            methodMessage = "Noooooo";
        }
        return methodMessage;
    }

    //Solution 2
    /*public static String containsSeven(ArrayList<Integer> arrayList) {
        String methodMessage = " ";
        for (Integer item : arrayList) {
            if (item == 7) {
                methodMessage = "Hoorray";
            } else {
                methodMessage = "Noooooo";

            }
        }
        return methodMessage;
    }*/
}















