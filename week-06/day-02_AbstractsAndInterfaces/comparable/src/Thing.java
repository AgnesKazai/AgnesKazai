/**
 * Created by aze on 2017.03.29..
 */

import java.lang.*;
import java.util.Comparator;

public class Thing implements Comparable<Thing> {
    private String name;
    private boolean completed;

    public Thing(String name) {
        this.name = name;
    }

    public void complete() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return (completed ? "[x] " : "[ ] ") + name;
    }

    @Override
    public int compareTo(Thing o) {
        Boolean first = this.completed;
        Boolean second = o.completed;
        return first.compareTo(second);
        //return second.compareTo(first);
    }

    public static Comparator<Thing> ThingsComparator = new Comparator<Thing>() {

        @Override
        public int compare(Thing o1, Thing o2) {
            String thingName1 = o1.name.toUpperCase();
            String thingName2 = o2.name.toUpperCase();
            return thingName1.compareTo(thingName2);
        }
    };
}
