import java.util.Random;

public class Pirate {
    protected int alcoholLevel;
    protected boolean alive;
    protected boolean passedOut;
    protected boolean hasParrot;

    public Pirate() {
        this.alive = true;
        this.hasParrot = false;
        this.passedOut = false;
    }

    public void drinkSomeRum() {
        this.alcoholLevel++;
    }

    public void howsItGoingMate() {
        if (this.alcoholLevel < 5) {
            System.out.println("Pour me anudder");
            this.drinkSomeRum();
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            this.passedOut = true;
        }
    }

    public void die() {
        alive = false;
    }

    public void brawl(Pirate anotherPirate) {
        Random rmd = new Random();
        int rmdNumber = rmd.nextInt(3);
        if (anotherPirate.alive) {
            switch (rmdNumber) {
                case 0:
                    this.die();
                    break;
                case 1:
                    anotherPirate.die();
                    break;
                case 2: {
                    this.die();
                    anotherPirate.die();
                    break;
                }
            }
        }
    }

    public void addParrot() {
        hasParrot = true;
    }

    @Override
    public String toString() {
        return " consumed rum " + this.alcoholLevel +
                (this.alive ? (this.passedOut ? " passed out " : " alive ") : " died ");
    }
}
