// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class VI_ParametricAverage {
    public static void main(String[] args) {

        int sum = 0;
        int count = 0;
        double average;
        Scanner scanner = new Scanner(System.in);
        int inputNumber;


        do {
            System.out.println("Please enter the number:  ");
            inputNumber = scanner.nextInt();
            sum += inputNumber;
            count++;

        } while (inputNumber != 0);
        average = sum / (double) count;
        NumberFormat formatter = new DecimalFormat("#0.00");

        System.out.println("Sum: " + sum + " Average: " + formatter.format(average));
    }
}

