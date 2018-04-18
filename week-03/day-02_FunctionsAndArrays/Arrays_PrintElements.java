// - Create an array variable named `af`
//   with the following content: `[4, 5, 6, 7]`
// - Print all the elements of `af`
public class Arrays_PrintElements {
    public static void main(String[] args) {
        int[] af = {4, 5, 6, 7};
        System.out.println("All the elements of the array is: ");
        for (int item : af) {
            System.out.print(item + " ");
        }
    }
}
