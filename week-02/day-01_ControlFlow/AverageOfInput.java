// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4

import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {

        System.out.println("Please enter the first number: ");
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();

        System.out.println("Please enter the second number: ");
        int numberTwo = scanner.nextInt();

        System.out.println("Please enter the third number: ");
        int numbeThree = scanner.nextInt();

        System.out.println("Please enter the fourth number: ");
        int numberFour = scanner.nextInt();

        System.out.println("Please enter the fifth number: ");
        int numberFive = scanner.nextInt();

        int sum = numberOne + numberTwo + numbeThree + numberFour + numberFive;
        double average = sum / 5.;

        System.out.println("Sum is: " + sum + " Average is: " + average);
    }
}
