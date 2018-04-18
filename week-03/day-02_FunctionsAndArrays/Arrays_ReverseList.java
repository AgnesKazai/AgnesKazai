// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`

public class Arrays_ReverseList {
    public static void main(String[] args) {

        int[] aj = {3, 4, 5, 6, 7};
        int i = 0;
        int j = aj.length - 1;
        int temp;
        do {
            temp = aj[i];
            aj[i] = aj[j];
            aj[j] = temp;
            i++;
            j--;
        } while (i != j && i < j);
        for (int item: aj) {
            System.out.print(item + " ");
        }
    }
}



