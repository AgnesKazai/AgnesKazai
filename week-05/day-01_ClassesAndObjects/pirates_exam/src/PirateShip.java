import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PirateShip {
    List<Pirate> pirates;
    private Pirate captainPirate;
    Random rnd = new Random();

    public PirateShip() {
        this.pirates = new ArrayList<>();
    }

    public void fillShip() {
        int rmdNumber = 10 + rnd.nextInt(11);
        for (int i = 0; i < rmdNumber; i++) {
            this.pirates.add(new Pirate());
        }
        this.captainPirate = pirates.get(rnd.nextInt(pirates.size()));
        this.captainPirate.addParrot();
    }

    public void getStatus() {
        System.out.println("Captains " + this.captainPirate.toString() + "Number of alive pirates in the crew " +
                this.stillAlive());
    }

    public int stillAlive() {
        int stillAlive = 0;
        for (Pirate item : pirates) {
            if (item.alive == true) {
                stillAlive++;
            }
        }
        return stillAlive;
    }

    public boolean battle(PirateShip otherShip) {
        if (this.stillAlive() - this.captainPirate.alcoholLevel >
                otherShip.stillAlive() - otherShip.captainPirate.alcoholLevel) {
            for (int i = 0; i < this.pirates.size(); i++) {
                pirates.get(rnd.nextInt(this.pirates.size())).drinkSomeRum();
            }
            return true;
        } else {
            for (int i = 0; i < otherShip.pirates.size(); i++) {
                otherShip.pirates.get(rnd.nextInt(otherShip.pirates.size())).die();
            }
            return false;
        }
    }
}
