package main.java.animals;

public class Mammal extends Animal {

    public Mammal(String name) {
        super(name);
    }

    @Override
    public String breed() {
        return "pushing miniature versions out.";
    }

    @Override
    public String eat() {
        return "meat or plant";
    }

    @Override
    public String moving() {
        return "by leggs";
    }
}
