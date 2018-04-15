// Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000

import java.util.Scanner;

public class III_Cuboid {
    public static void main(String[] args) {

        System.out.println("Please enter the side of cuboid: ");
        Scanner scanner = new Scanner(System.in);
        double sidesOfCuboid = scanner.nextDouble();


        double surface = 6 * Math.pow(sidesOfCuboid, 2);
        System.out.println("Surface Area: " + surface);

        double volume = Math.pow(sidesOfCuboid, 3);
        System.out.println("Volume: " + volume);

    }

}
