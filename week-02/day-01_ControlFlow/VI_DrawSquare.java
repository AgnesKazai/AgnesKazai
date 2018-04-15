// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %   %
// %   %
// %   %
// %   %
// %%%%%
//
// The square should have as many lines as the number was
import java.util.Scanner;

public class VI_DrawSquare {
    public static void main(String[] args) {

        System.out.println("Please enter the number of squares side: ");
        Scanner scanner = new Scanner(System.in);
        int squareSides = scanner.nextInt();

        for (int firstRow=0; firstRow < squareSides; firstRow++)
        {
            System.out.print("%");
        }
        System.out.println();


        for (int middleRows=0;   middleRows < squareSides-2; middleRows++)
        {
            System.out.print("%");

            for (int space=0; space < (squareSides-2); space++)
            {
                System.out.print(" ");
            }
            System.out.println("%");
        }


        for (int lastRow=0; lastRow < squareSides; lastRow++)
        {
            System.out.print("%");
        }
        System.out.println();
    }
}
