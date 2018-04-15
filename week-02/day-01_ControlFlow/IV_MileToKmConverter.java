// Write a program that asks for an integer that is a distance in kilometers,
// then it converts that value to miles and prints it

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class IV_MileToKmConverter {
    public static void main(String[] args) {

        System.out.println("Please enter the distance in kilometer: ");
        Scanner scanner = new Scanner(System.in);
        int distanceInKilometer = scanner.nextInt();

        double distanceInMiles = distanceInKilometer * 0.62137119;
        //System.out.println(distanceInMiles + " miles");

        NumberFormat formatter = new DecimalFormat("#0.00");
        System.out.println(distanceInKilometer+" km is " +formatter.format(distanceInMiles)+ " miles.");

    }
}


