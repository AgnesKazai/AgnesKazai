public class Flower extends Plant  {
    public Flower(String color) {
        super(color);
        this.waterAbsorbing = 75;
        this.minWaterAmount = 5;
        this.type = Type.Flower;
    }
}
