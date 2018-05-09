package main.java.music;

public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar() {
        this(6);
    }

    public ElectricGuitar(int numberOfStrings) {
        super(numberOfStrings);
        this.name = "Electric Guitar";
    }

    @Override
    public String sound() {
        return "Twang";
    }

    @Override
    public void play() {
        System.out.println(this.name + ", a " + this.numberOfStrings + "-stringed instrument that goes " + this.sound());
    }
}
