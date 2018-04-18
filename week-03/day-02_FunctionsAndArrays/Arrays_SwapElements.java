import java.util.Arrays;

// - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc`
public class Arrays_SwapElements {
    public static void main(String[] args) {

        String[] abc = {"first", "second", "third"};
        String temp = abc[0];
        abc[0] = abc[2];
        abc[2] = temp;
        for (String item : abc) {
            System.out.print(item + " ");
        }
    }
}
