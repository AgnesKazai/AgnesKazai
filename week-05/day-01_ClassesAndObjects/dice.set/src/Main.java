// You have a `DiceSet` class which has a list for 6 dices
// You can roll all of them with roll()
// Check the current rolled numbers with getCurrent()
// You can reroll with reroll()
// Your task is to roll the dices until all of the dices are 6
public class Main {
    public static void main(String[] args) {
        DiceSet diceSet = new DiceSet();
        diceSet.roll();
        for (int i = 0; i < diceSet.dices.length; i++) {
            System.out.print(diceSet.getCurrent(i) + " ");
        }
        for (int i = 0; i < diceSet.dices.length; i++) {
            if (diceSet.getCurrent(i) != 6) {
                while (diceSet.getCurrent(i) != 6) {
                    diceSet.reroll(i);
                }
            }
        }
        System.out.println();
        for (int item : diceSet.getCurrent()) {
            System.out.print(item + " ");
        }
//        diceSet.getCurrent();
//        diceSet.roll();
//        diceSet.getCurrent();
//        diceSet.getCurrent(5);
//        diceSet.reroll();
//        diceSet.getCurrent();
//        diceSet.reroll(4);
//        diceSet.getCurrent();
//        System.out.println();
    }
}
