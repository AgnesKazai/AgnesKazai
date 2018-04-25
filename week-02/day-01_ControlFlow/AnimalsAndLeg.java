// Write a program that asks for two integers
// The first represents the number of chickens the farmer has
// The second represents the number of pigs owned by the farmer
// It should print how many legs all the animals have

import java.util.Scanner;

public class AnimalsAndLeg {
    public static void main(String[] args) {
        System.out.println("Please enter the number of chickens: ");
        Scanner scanner1 = new Scanner(System.in);
        int numberOfChickens = scanner1.nextInt();

        System.out.println("Please enter the number of pigs: ");
        Scanner scanner2 = new Scanner(System.in);
        int numberOfPigs = scanner2.nextInt();

        numberOfChickens *= 2;
        numberOfPigs *= 4;
        int amountOfAnimalsLegs = numberOfChickens + numberOfPigs;
        System.out.println("They have total " + amountOfAnimalsLegs + " legs.");
    }
}
