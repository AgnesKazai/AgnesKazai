public class BattleApp {
    public static void main(String[] args) {
        PirateShip pirateShip = new PirateShip();
        pirateShip.fillShip();
        PirateShip otherPirateShip = new PirateShip();
        otherPirateShip.fillShip();
        if (pirateShip.battle(otherPirateShip)) {
            System.out.println("The winner is THIS PIRATESHIP! :)");
        } else {
            System.out.println("The winner is OTHER PIRATESHIP!");
        }
    }
}