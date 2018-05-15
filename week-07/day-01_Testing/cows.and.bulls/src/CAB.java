import java.util.Random;
import java.util.Scanner;

public class CAB {
    protected boolean playing;
    protected int gameCounter;
    protected int cow;
    protected int bull;
    protected String uniqNumber;
    protected String userGuess;

    Random rnd = new Random();
    Scanner scanner = new Scanner(System.in);

    public CAB() {
        this.playing = true;
        this.gameCounter = 0;
        this.cow = 0;
        this.bull = 0;
        this.uniqNumber = String.format("%04d", 1000+rnd.nextInt(9000));
    }

    public void askUserNumber(){
        System.out.println("Please give me the number: ");
        this.userGuess = scanner.nextLine();
    }

    public String guess() {
        do {
            askUserNumber();
            int bull = 0;
            int cow = 0;
            for (int i = 0; i < 4; i++) {
                if (userGuess.charAt(i) == uniqNumber.charAt(i)) {
                    cow++;
                } else if (userGuess.contains(uniqNumber.charAt(i) + "")) {
                    bull++;
                }
            }
            gameCounter++;
            if (cow == 4) {
                playing = false;
            }
            System.out.println(cow + " Cows and " + bull + " Bulls.");
        } while (playing);
        return ("You won after " + gameCounter + " guess(es)!");
    }
}
