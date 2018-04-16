// Saturn is missing from the planetList
// Insert it into the correct position
// Create a method called putSaturn() which has list parameter and returns the correct list.
// Expected output: "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune", "Saturn"

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// Saturn is missing from the planetList
// Insert it into the correct position
// Create a method called putSaturn() which has list parameter and returns the correct list.
// Expected output: "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune", "Saturn"

public class Lists_SolarSystem_I {
    public static void main(String[] args) {

        ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune"));

        System.out.println(putSaturn(planetList));
    }

    public static ArrayList putSaturn(ArrayList planetList) {
        planetList.add("Saturn");
        return planetList;
    }
}

