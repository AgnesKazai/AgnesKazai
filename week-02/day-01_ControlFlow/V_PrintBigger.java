// Write a program that asks for two numbers and prints the bigger one
import java.util.Scanner;

public class V_PrintBigger {
    public static void main(String[] args) {
        System.out.println("Please enter the first number: ");
        Scanner scanner1 = new Scanner(System.in);
        int firstNumber = scanner1.nextInt();

        System.out.println("Please enter the second number: ");
        Scanner scanner2 = new Scanner(System.in);
        int secondNumber = scanner2.nextInt();

        if (firstNumber > secondNumber){
            System.out.println("This is the bigger: " + firstNumber);
        }else{
            System.out.println("This is the bigger: " + secondNumber);
        }
    }
}
