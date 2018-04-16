// Add "My todo:" to the beginning of the todoText
// Add " - Download games" to the end of the todoText
// Add " - Diablo" to the end of the todoText but with indention
//
// Expected outpt:
//
// My todo:
//  - Buy milk
//  - Download games
//      - Diablo

public class Strings_TodoPrint_IV {
    public static void main(String[] args) {

        String todoText = " - Buy milk\n";

        StringBuilder TodoList = new StringBuilder(todoText);
        TodoList.insert(0, "My todo:\n");
        TodoList.append(" - Download games\n");
        TodoList.append(" \t- Diablo");
        todoText = TodoList.toString();
        System.out.println(todoText);


    }
}
