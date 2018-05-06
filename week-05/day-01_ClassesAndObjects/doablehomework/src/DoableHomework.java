//Create 5 trees
//       Store the data of them in variables in your program
//        for every tree the program should store its'
//        type
//        leaf color
//        age
//        sex
//        you can use just variables, or lists and/or maps

import java.util.ArrayList;
import java.util.HashMap;

public class DoableHomework {
    public static void main(String[] args) {

        ArrayList<HashMap<String, Object>> list = new ArrayList<>();

        HashMap<String, Object> tree0 = new HashMap<>();
        tree0.put("type", "pine");
        tree0.put("leaf color", "green");
        tree0.put("age", 20);
        tree0.put("sex", "single");
        list.add(tree0);

        HashMap<String, Object> tree1 = new HashMap<>();
        tree1.put("type", "oak");
        tree1.put("leaf color", "green");
        tree1.put("age", 40);
        tree1.put("sex", "single");
        list.add(tree1);

        HashMap<String, Object> tree2 = new HashMap<>();
        tree2.put("type", "birch");
        tree2.put("leaf color", "green");
        tree2.put("age", 25);
        tree2.put("sex", "double");
        list.add(tree2);

        HashMap<String, Object> tree3 = new HashMap<>();
        tree3.put("type", "fruit");
        tree3.put("leaf color", "green");
        tree3.put("age", 15);
        tree3.put("sex", "single");
        list.add(tree3);

        HashMap<String, Object> tree4 = new HashMap<>();
        tree4.put("type", "alder");
        tree4.put("leaf color", "green");
        tree4.put("age", 25);
        tree4.put("sex", "double");
        list.add(tree4);

//        for (HashMap<String, Object> item : list) {
//            System.out.println(item.entrySet());
//            System.out.println(item.keySet());
//            System.out.println(item.get("type"));
//            System.out.println(item.containsKey("leaf color"));
//            System.out.println(item.containsValue("alder"));
//            System.out.println(item.get("age"));
//
//            if ((item.containsValue("alder"))) {
//                System.out.println(item);
//            }
//        }
    }
}
