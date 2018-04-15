// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was

import java.util.Scanner;

public class VI_DrawTriangle {

    public static void main(String[] args) {

        System.out.println("Please enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int totalRows = scanner.nextInt();
        System.out.println("-----------");

        int row, star;

        for (row = 1; row <= totalRows; row++) {
            for (star = 0; star < row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
