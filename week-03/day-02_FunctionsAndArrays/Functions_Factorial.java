//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial

import java.util.Scanner;

public class Functions_Factorial {
    public static void main(String[] args) {
        //Ask number from user
        System.out.println("Please enter a whole number:");
        Scanner userInput = new Scanner(System.in);
        int factorial = userInput.nextInt();

        System.out.println("The numbers factorial is: " + factorio(factorial));
    }

    public static int factorio(int factorial) {
        long result = 1;
        for (int factor = 2; factor <= factorial; factor++) {
            result *= factor;
        }
        return (int) result;
    }
}

