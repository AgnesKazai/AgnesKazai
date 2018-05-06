//Create Sharpie class
//We should know about each sharpie their color (which should be a string), width (which will be a floating point number),
// inkAmount (another floating point number)
//   When creating one, we need to specify the color and the width
//   Every sharpie is created with a default 100 as inkAmount
//   We can use() the sharpie objects
//   which decreases inkAmount
public class Main {
    public static void main(String[] args) {
        Sharpie sharpie = new Sharpie("blue", 0.6f);
        sharpie.use();
        System.out.println("The amount of ink (Sharpie) is: " + sharpie.inkAmount);
        Sharpie sharpie1 = new Sharpie("red", 0.5f);
        sharpie1.use();
        System.out.println("The amount of ink (Sharpie1) is: " + sharpie1.inkAmount);
        Sharpie sharpie2 = new Sharpie("green", 1.0f);
        sharpie2.use();
        System.out.println("The amount of ink (Sharpie2) is: " + sharpie2.inkAmount);
    }
}
