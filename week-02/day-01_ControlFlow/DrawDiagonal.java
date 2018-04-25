import java.util.Scanner;

// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// The square should have as many lines as the number was
public class DrawDiagonal {
    public static void main(String[] args) {

        System.out.println("Please enter the number of squares side: ");
        Scanner scanner = new Scanner(System.in);
        int squareSides = scanner.nextInt();

        for (int firstRow = 0; firstRow < squareSides; firstRow++) {
            System.out.print("%");
        }
        System.out.println();

        for (int MiddleRows = 0; MiddleRows < squareSides - 2; MiddleRows++) {
            System.out.print("%");

            for (int space = 0; space < MiddleRows; space++) {
                System.out.print(" ");
            }
            System.out.print("%");
            for (int spaceBack = squareSides - 2; spaceBack - MiddleRows > 1; spaceBack--) {
                System.out.print(" ");
            }
            System.out.println("%");
        }

        for (int lastRow = 0; lastRow < squareSides; lastRow++) {
            System.out.print("%");
        }
        System.out.println();
    }
}
