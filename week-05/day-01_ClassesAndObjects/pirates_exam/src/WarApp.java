public class WarApp {
    public static void main(String[] args) {
        Armada armada = new Armada();
        Armada otherArmada = new Armada();
        armada.fillWithShips();
        otherArmada.fillWithShips();
        if (armada.war(otherArmada)) {
            System.out.println("The winner is THIS ARMADA! :)");
        } else {
            System.out.println("The winner is OTHER ARMADA!");
        }
    }
}