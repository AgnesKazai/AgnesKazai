public class Main {
    public static void main(String[] args) {
        Garden garden = new Garden();
        Plant rose = new Flower("blue");
        Plant tulip = new Flower("yellow");
        Plant lilacTree = new Tree("purple");
        Plant fruitTree = new Tree("orange");

        garden.plants.add(rose);
        garden.plants.add(tulip);
        garden.plants.add(lilacTree);
        garden.plants.add(fruitTree);

        print(garden);
        garden.watering(40);
        print(garden);
        garden.watering(70);
        print(garden);
    }

    public static void print(Garden garden) {
        for (Plant plant : garden.plants) {
            plant.getSatus();
        }
        System.out.println();
    }
}
