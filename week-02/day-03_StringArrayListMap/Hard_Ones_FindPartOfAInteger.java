//  Create a function that takes a number and a list of numbers as a parameter
//  Returns the indeces of the numbers in the list where the first number is part of
//  Returns an empty list if the number is not part any of the numbers in the list

//  Example:
//System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
//  should print: `[0, 1, 4]`
// System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
//  should print: '[]'

import java.util.ArrayList;

public class Hard_Ones_FindPartOfAInteger {
    public static void main(String[] args) {
        System.out.println(subInt(7, new int[]{1, 11, 34, 52, 61}));
    }

    private static ArrayList subInt(int number, int[] listOfNumber) {
        String numberToString = "";
        String stringOfNumbers = "";
        ArrayList<Integer> indicesOfTheNumbers = new ArrayList<>();

        numberToString = Integer.toString(number);
        for (int i = 0; i < listOfNumber.length; i++) {
            stringOfNumbers = String.valueOf(listOfNumber[i]);
            if (stringOfNumbers.indexOf(numberToString) != -1) {
                indicesOfTheNumbers.add(i);
            }
        }
        return indicesOfTheNumbers;
    }
}
