package main.java.animals;

public class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    public String breed() {
        return "laying eggs.";
    }

    @Override
    public String eat() {
        return "insect";
    }

    @Override
    public String moving() {
        return "flapping wings";
    }
}
