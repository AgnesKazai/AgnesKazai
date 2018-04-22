//  Create a function that takes a list of numbers as a parameter
//  Returns a list of numbers where every number in the list occurs only once
//  Example
//  System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
//  should print: `[1, 11, 34, 52, 61]`

import java.util.Arrays;

public class III_Unique_underWorking {
    public static void main(String[] args) {

        int[] unique = {1, 11, 34, 11, 52, 61, 1, 34};
        int[] newUnique = new int[8];
        Arrays.sort(unique);
        newUnique[0] = unique[0];

        int j = 1;
        for (int i = 0; i < unique.length - 1; i++) {
            if (unique[i] != unique[i + 1]) {
                newUnique[j++] = unique[i + 1];
            }

        }
        for (int item : newUnique
                ) {
            if (item != 0)
                System.out.print(item + " ");

        }
    }

}

