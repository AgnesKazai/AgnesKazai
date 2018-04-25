// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stored number is lower
// You found the number: 8

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        System.out.println("Please enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int userGuess = scanner.nextInt();
        int storedNumber = 8;

        if (userGuess > storedNumber) {
            System.out.println("The stored number is lower!");
        } else if (userGuess < storedNumber) {
            System.out.println("The stored number is higher!");
        } else {
            System.out.println("Your found the number: " + userGuess);
        }
    }
}
