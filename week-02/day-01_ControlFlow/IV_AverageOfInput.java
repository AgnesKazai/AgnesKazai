// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4

import java.util.Scanner;

public class IV_AverageOfInput {
    public static void main(String[] args) {

        System.out.println("Please enter the first number: ");
        Scanner scanner1 = new Scanner(System.in);
        int numberOne = scanner1.nextInt();

        System.out.println("Please enter the second number: ");
        Scanner scanner2 = new Scanner(System.in);
        int numberTwo = scanner2.nextInt();

        System.out.println("Please enter the third number: ");
        Scanner scanner3 = new Scanner(System.in);
        int numbeThree = scanner3.nextInt();

        System.out.println("Please enter the fourth number: ");
        Scanner scanner4 = new Scanner(System.in);
        int numberFour = scanner4.nextInt();

        System.out.println("Please enter the fifth number: ");
        Scanner scanner5 = new Scanner(System.in);
        int numberFive = scanner5.nextInt();

        int sum = numberOne + numberTwo + numbeThree + numberFour + numberFive;
        double average = sum / 5.;

        System.out.println("Sum is: " + sum + " Average is: " + average);

    }
}
