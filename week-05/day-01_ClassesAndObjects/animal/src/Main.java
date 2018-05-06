//Create an Animal class
//Every animal has a hunger value, which is a whole number
//     Every animal has a thirst value, which is a whole number
//     when creating a new animal object these values are created with the default 50 value
//     Every animal can eat() which decreases their hunger by one
//     Every animal can drink() which decreases their thirst by one
//     Every animal can play() which increases both by one
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.thirst);
        animal.drink();
        System.out.println(animal.thirst);
        System.out.println("-------");
        System.out.println(animal.hunger);
        animal.eat();
        System.out.println(animal.hunger);
        System.out.println("-------");
        System.out.println(animal.hunger);
        System.out.println(animal.thirst);
        System.out.println("++++++++");
        animal.play();
        System.out.println(animal.hunger);
        System.out.println(animal.thirst);
    }
}
