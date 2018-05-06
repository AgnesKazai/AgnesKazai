//Create Station and Car classes
//     Station
//       gasAmount
//       refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount
//     Car
//       gasAmount
//       capacity
//       create constructor for Car where:
//           initialize gasAmount -> 0
//           initialize capacity -> 100

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Station station = new Station();

        System.out.println("The stations default gas amount value is: " + station.gasAmount);
        System.out.println("The cars default gas amount value is : " + car.gasAmount);
        System.out.println("The cars default capacity value is : " + car.capacity);
        System.out.println("----------");
        station.refill(car);
        System.out.println("The cars default gas amount value after refill is : " + car.gasAmount);
        System.out.println("The cars default capacity value after refill is : " + car.capacity);
        System.out.println("The stations default gas amount value is: " + station.gasAmount);
    }
}
