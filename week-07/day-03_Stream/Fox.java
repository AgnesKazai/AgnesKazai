//Create a Fox class with 3 properties(name, type, color)
// Fill a list with at least 5 foxes, it's up to you how you name/create them!
// Write a Stream Expression to find the foxes with green color!
// Write a Stream Expression to find the foxes with green color and pallida type!

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Fox {
    private String name;
    private String type;
    private String color;

    public Fox(String name, String type, String color) {
        this.name = name;
        this.type = type;
        this.color = color;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("%s --- %s---%s", name, type, color);
    }

    public static void main(String[] args) {
        List<Fox> foxes =
                Arrays.asList(
                        new Fox("Vuk", "zerda", "green"),
                        new Fox("Kag", "chama", "silver"),
                        new Fox("Nudli", "vulpe", "red"),
                        new Fox("Puszedli", "pallida", "green"),
                        new Fox("Gombóc", "ferrilata", "rusty")
                );

        List<Fox> foxesWithGreenColor =
                foxes.stream()
                .filter(fox -> fox.getColor() == "green")
                .collect(Collectors.toList());
        System.out.println("Foxes with green color:\n" +foxesWithGreenColor);

        List<Fox> foxesWithGreenColorAndPallidaType =
                foxes.stream()
                .filter(fox -> fox.getColor() == "green" && fox.type == "pallida")
                .collect(Collectors.toList());

        System.out.println("Foxes with green color and pallida type:\n" + foxesWithGreenColorAndPallidaType);
    }
}
