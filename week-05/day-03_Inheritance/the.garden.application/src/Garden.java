import java.util.ArrayList;
import java.util.List;

public class Garden {


List<Plant> plants;

    public Garden() {
        this.plants = new ArrayList<>();
    }

    public void watering(int water ){
        System.out.println("Waterig with " + water);
        double eachGetWater = water / plants.size();
        for (Plant item: plants){
            if(item.needWater()){
                item.drink(eachGetWater);
            }
        }
    }
}
