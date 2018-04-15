// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was

import java.util.Scanner;

public class VI_DrawPyramid {
    public static void main(String[] args) {
        System.out.println("Please enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int totalRows = scanner.nextInt();
        System.out.println("-----------");

        int row, space, star;

        for (row = 1; row <= totalRows; row++) {
            for (space = totalRows - row; space >= 1; space--) {
                System.out.print(" ");
            }
            for (star = 1; star <= row * 2 - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }


}

