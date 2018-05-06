public class Tree extends Plant  {

    public Tree(String color) {
        super(color);
        this.waterAbsorbing = 40;
        this.minWaterAmount = 10;
        this.type = Type.Tree;
    }
}
