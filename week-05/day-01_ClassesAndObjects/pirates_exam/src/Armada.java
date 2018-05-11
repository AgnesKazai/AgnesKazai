import java.util.ArrayList;
import java.util.List;

public class Armada {
    List<PirateShip> pirateShips;

    public Armada() {
        this.pirateShips = new ArrayList<>();
    }

    public void fillWithShips() {
        for (int i = 0; i < 5; i++) {
            PirateShip pirateShip = new PirateShip();
            pirateShip.fillShip();
            pirateShips.add(pirateShip);
        }
    }

    public boolean war(Armada otherArmada) {
        while (pirateShips.size() != 0 && otherArmada.pirateShips.size() != 0) {
            if (pirateShips.get(0).battle(otherArmada.pirateShips.get(0))) {
                otherArmada.pirateShips.remove(0);
            } else {
                pirateShips.remove(0);
            }
        }
        if (pirateShips.size() != 0) {
            return true;
        } else {
            return false;
        }
    }
}
