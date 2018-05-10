package main.java.animals;

public class Reptile extends Animal {

    public Reptile(String name) {
        super(name);
    }

    @Override
    public String breed() {
        return "laying eggs.";
    }

    @Override
    public String eat() {
        return "meat";
    }

    @Override
    public String moving() {
        return "with wavy motion";
    }
}
