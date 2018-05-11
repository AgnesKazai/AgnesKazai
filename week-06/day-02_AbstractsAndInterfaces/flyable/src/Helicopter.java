public class Helicopter extends Vehicle implements Flyable {

    @Override
    public String land() {
        return "The pilot decrease the speed of the rotor and the aircraft slowly begin to land.";
    }

    @Override
    public String fly() {
        return "Simply fly straight upward.";
    }

    @Override
    public String takeOff() {
        return "The pilot increase the speed of the rotor and the aircraft slowly leave the ground.";
    }
}
