//  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer

import java.util.Scanner;

public class Functions_Summing {
    public static void main(String[] args) {
        //Ask number from user
        System.out.println("Please enter a number:");
        Scanner userInput = new Scanner(System.in);
        int number = userInput.nextInt();

        System.out.println("The sum of the numbers is: " + sum(number));

    }

    public static int sum(int number) {
        int result = 0;
        for (int i = 1; i <= number; i++) {
            result += i;
        }
        return result;
    }
}
