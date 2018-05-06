//Reuse your Animal class
//Create a Farm class
//        it has list of Animals
//        it has slots which defines the number of free places for animals
//        breed() -> creates a new animal if there's place for it
//        slaughter() -> removes the least hungry animal
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Farm farm = new Farm(7);

        for (int i = 0; i < 15; i++) {
            while (farm.slot != 0) {
                farm.breed();
            }
            for (int j = 0; j < 24; j++) {
                farm.animals.get(rnd.nextInt(farm.animals.size())).play();
                farm.animals.get(rnd.nextInt(farm.animals.size())).eat();
            }
            printOut("Before slaughter: ", i, farm);
            farm.slaughter();
            printOut("After slaughter: ", i, farm);
        }
    }

    private static void printOut(String str, int i, Farm farm) {
        System.out.println(str +  (i + 1)+"." + " day");
        for (Animal a : farm.animals) {
            System.out.println("\tHunger: " + a.hunger);
        }
    }
}
