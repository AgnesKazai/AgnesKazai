import java.util.ArrayList;
import java.util.List;

public class Farm {
    int slot;
    List<Animal> animals;


    public Farm(int slot){
        this.animals = new ArrayList<>();
        this.slot = slot;
    }
    public void breed(){
        if (slot != 0){
            animals.add(new Animal());
            slot--;
        }
    }
    public void slaughter(){
        int idx =0;
        int min = animals.get(0).hunger;
        for (int i = 1; i < animals.size() ; i++) {
            if(animals.get(i).hunger < min){
                min = animals.get(i).hunger;
                idx = i;
            }
        }
        animals.remove(idx);
        slot++;
    }
}
