// You have the list of Dominoes
// Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
// eg: [2, 4], [4, 3], [3, 5] ...

import java.util.ArrayList;
import java.util.List;

public class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();

        System.out.println("Default: " + dominoes);

        int[] firstObj = dominoes.get(0).getValues();
        int valueB = firstObj[1];
        int[] nextObj = dominoes.get(1).getValues();
        int valueA = nextObj[0];
        int j = 3;
        int insertPoint = 1;
        while (insertPoint + 1 < dominoes.size()) {
            while (j < dominoes.size() && valueB != valueA) {
                nextObj = dominoes.get(j).getValues();
                valueA = nextObj[0];
                j++;
            }
            if (j > dominoes.size()) {
                System.out.println("No matching domino!");
            } else {
                dominoes.add(insertPoint, dominoes.get(j - 1));
                dominoes.remove(j);
            }
            firstObj = dominoes.get(insertPoint).getValues();
            valueB = firstObj[1];
            nextObj = dominoes.get(insertPoint + 1).getValues();
            valueA = nextObj[0];
            insertPoint++;
            j = insertPoint;
        }
        System.out.println("Result:  " + dominoes);
    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }
}