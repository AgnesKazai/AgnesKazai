// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5
import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {

        System.out.println("Please enter the first number: ");
        Scanner scanner1 = new Scanner(System.in);
        int firstNumber = scanner1.nextInt();

        System.out.println("Please enter the second number: ");
        Scanner scanner2 = new Scanner(System.in);
        int secondNumber = scanner2.nextInt();
        System.out.println("-----------------");

        if (secondNumber < firstNumber) {
            System.out.println("The second number should be bigger!");

        } else {
            while(firstNumber < secondNumber){
                System.out.println(firstNumber);
                firstNumber += 1;
            }
        }
    }
}
