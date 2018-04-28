// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0

import java.util.Scanner;

public class Exceptions_DivideByZero {

    public static void main(String[] args) {

        System.out.println("Please enter a number:");
        Scanner scanner = new Scanner(System.in);
        int dividen = scanner.nextInt();

        divisor(dividen);
    }

    private static void divisor(int number) {
        if (number == 0) {
            System.out.println("Fail!");
        } else {
            int result = 10 / number;
            System.out.println(result);
        }
    }
}
