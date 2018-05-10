package main.java.animals;

public abstract class Animal {
    protected String name;
    protected int age;
    protected String gender;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract String breed();

    public abstract String eat();

    public abstract String moving();
}
