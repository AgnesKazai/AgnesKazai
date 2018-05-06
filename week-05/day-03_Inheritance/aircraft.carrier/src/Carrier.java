import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Carrier {
    List<Aircraft> aircrafts;
    private int ammoStorage;
    private int healthPoint;

    public Carrier() {
    }

    public Carrier(int ammo, int healthPoint) {
        this.aircrafts = new ArrayList<>();
        this.setAmmo(ammo);
        this.setHealthPoint(healthPoint);
    }

    public int getAmmo() {
        return ammoStorage;
    }

    public void setAmmo(int ammo) {
        this.ammoStorage = ammo;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public void add() {
        Random random = new Random();
        if (random.nextInt(101) > 50) {
            aircrafts.add(new F16());
        } else {
            aircrafts.add(new F35());
        }
    }

    public void fill() throws Exception {
        for (Aircraft item : aircrafts) {
            if (ammoStorage == 0) throw new Exception("There is no ammo!");
            else if (ammoStorage != 0 && ammoStorage < 12) {
                if (item instanceof F35 && ((F35) item).isPriority()) {
                    ammoStorage = item.refill(ammoStorage);
                } else if (((F16) item).isPriority()) {
                    ammoStorage = item.refill(ammoStorage);
                }
            } else if (ammoStorage > 12) {
                ammoStorage = item.refill(ammoStorage);
            }
        }
    }

    public void fight(Carrier anotherCarrier) {
        for (Aircraft item : aircrafts) {
            if (item instanceof F35) {
                anotherCarrier.healthPoint -= ((F35) item).fight();
            } else {
                anotherCarrier.healthPoint -= ((F16) item).fight();
            }
        }
    }

    public void getStatus() {
        if (this.healthPoint > 0) {
            int totalDamage = 0;
            for (Aircraft item : aircrafts) {
                totalDamage += item.getBaseDamage() * item.getAmmo();
            }
            System.out.println("HP: " + this.healthPoint + " Aircraft count: "
                    + aircrafts.size() + " Ammo Storage: " + this.ammoStorage + " Total damage: " + totalDamage);

            for (Aircraft item : aircrafts) {
                item.getStatus();
            }
        } else {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("It's dead Jim :(");
        }
    }
}
