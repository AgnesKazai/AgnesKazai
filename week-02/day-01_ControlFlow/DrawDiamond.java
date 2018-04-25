// Write a program that reads a number from the standard input, then draws a
// diamond like this:
//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// The diamond should have as many lines as the number was

import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {

        System.out.println("Please enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int totalRows = scanner.nextInt();

        int row, star, space;
        totalRows = totalRows / 2 + 1;

        for (row = 1; row <= totalRows; row++) {
            for (space = totalRows - row; space >= 1; space--) {
                System.out.print(" ");
            }
            for (star = 1; star <= 2 * row - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (row = totalRows - 1; row >= 1; row--) {
            for (space = 1; space <= totalRows - row; space++) {
                System.out.print(" ");
            }
            for (star = 1; star <= 2 * row - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

