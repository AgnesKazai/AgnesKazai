// Write a method that joins the two lists by matching one girl with one boy into a new list
// Exepected output: "Eve", "Joe", "Ashley", "Fred"...

import java.util.ArrayList;
import java.util.Arrays;

public class Lists_Matchmaking_II {
    public static void main(String[] args) {

        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Bözsi", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Béla", "Todd", "Neef", "Jeff"));

        matching(girls, boys);

    }

    public static void matching(ArrayList<String> girls, ArrayList<String> boys) {
        ArrayList<String> mixedList = new ArrayList<String>(Arrays.asList());
        int i = 0;
        while (i < girls.size() && i < boys.size()) {
            mixedList.add(girls.get(i));
            mixedList.add(boys.get(i));
            i++;
        }
        for (String item : mixedList)
            System.out.print(item + " ");

       /* while (i < girls.size()){
            mixedList.add(girls.get(i));       // If you need the last boys name you can run it.
            i++;
        }
        while (i < boys.size()){
            mixedList.add(boys.get(i));
            i++;
        }
        System.out.println();
        for (String item : mixedList)
            System.out.print(item + " ");*/

    }
}



