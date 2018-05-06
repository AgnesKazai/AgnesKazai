//Reuse your Sharpie class
//Create SharpieSet class
//it contains a list of Sharpie
//                countUsable() -> sharpie is usable if it has ink in it
//        removeTrash() -> removes all unusable sharpies

public class Main {

    public static void main(String[] args) {
        SharpieSet sharpieSet = new SharpieSet();

        Sharpie sharpie = new Sharpie("blue", 3.5f);
        sharpieSet.sharpies.add(sharpie);
        Sharpie sharpie1 = new Sharpie("green", 2.7f);
        sharpieSet.sharpies.add(sharpie1);
        Sharpie sharpie2 = new Sharpie("red", 2.7f);
        sharpieSet.sharpies.add(sharpie2);
        Sharpie sharpie3 = new Sharpie("yellow", 4.0f);
        sharpieSet.sharpies.add(sharpie3);
        Sharpie sharpie4 = new Sharpie("black", 1.4f);
        sharpieSet.sharpies.add(sharpie4);
        Sharpie sharpie5 = new Sharpie("purple", 2.0f);
        sharpieSet.sharpies.add(sharpie5);

        print(sharpieSet);
        while (sharpieSet.sharpies.size() > 0) {
            while (sharpieSet.countUsable() == sharpieSet.sharpies.size()) {
                sharpie1.use();
                sharpie2.use();
                sharpie3.use();
                sharpie4.use();
                sharpie5.use();
                sharpie.use();
            }
            print(sharpieSet);
            sharpieSet.removeTrash();
            print(sharpieSet);
        }
    }

    public static void print(SharpieSet s) {
        for (Sharpie item : s.sharpies) {
            System.out.println(item.color + " " + item.inkAmount);
        }
        System.out.println("--------------");
    }
}
