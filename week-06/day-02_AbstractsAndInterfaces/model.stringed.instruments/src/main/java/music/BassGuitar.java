package main.java.music;

public class BassGuitar extends StringedInstrument {

    public BassGuitar() {
        this(4);
    }

    public BassGuitar(int numberOfStrings) {
        super(numberOfStrings);
        this.name = this.name = "Bass Guitar";
    }

    @Override
    public String sound() {
        return "Duum-duum-duum";
    }

    @Override
    public void play() {
        System.out.println(this.name + ", a " + this.numberOfStrings + "-stringed instrument that goes " + this.sound());
    }
}
