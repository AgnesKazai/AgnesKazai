// Accidentally I messed up this quote from Richard Feynman.
// Two words are out of place
// Your task is to fix it by swapping the right words with code
// Create a method called quoteSwap().
// Also, print the sentence to the output with spaces in between.
// Expected output: "What I cannot create I do not understand."

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Lists_QuoteSwap {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

        quoteSwap(list);

    }

    private static void quoteSwap(ArrayList<String> list) {
        int firstToChange = list.indexOf("do");
        int secondToChange = list.indexOf("cannot");

        Collections.swap(list, firstToChange, secondToChange);

        for (String item : list) {
            System.out.print(item + " ");
        }

    }
}
