public class Bird extends Animal implements Flyable {

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

    @Override
    public String land() {
        return "slowly descending";
    }

    @Override
    public String fly() {
        return "flapping wings ";
    }

    @Override
    public String takeOff() {
        return "begin flapping with wings as fast as it can";
    }
}
