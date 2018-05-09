package main.java.music;

public class Violin extends StringedInstrument {

    public Violin() {
        this(4);
    }

    public Violin(int numberOfStrings) {
        super(numberOfStrings);
        this.name = "Violin";
    }

    @Override
    public String sound() {
        return "Screech";
    }

    @Override
    public void play() {
        System.out.println(this.name + ", a " + this.numberOfStrings + "-stringed instrument that goes " + this.sound());
    }
}
