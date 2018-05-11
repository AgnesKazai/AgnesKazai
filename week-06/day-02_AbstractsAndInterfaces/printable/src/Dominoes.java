import java.util.ArrayList;
import java.util.List;

public class Dominoes implements Printable {
    List<Domino> dominoes;

    public Dominoes(List<Domino> dominoes) {
        this.dominoes = dominoes;
    }

    @Override
    public void printAllFields() {
        for (Domino d : dominoes) {
            System.out.println(d.toString());
        }
    }
}