// Create a method that can reverse a String, which is passed as the parameter
// Use it on this reversed string to check it!
// Try to solve this using charAt() first, and optionally anything else after.

public class Strings_Reverse {
    public static void main(String[] args) {

        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        System.out.println(reverse(reversed));
    }

    /*public static String reverse(String StringToReverse) {
        String straight = "";
        for (int i = StringToReverse.length() - 1; i >= 0; i--) {
            straight += StringToReverse.charAt(i);
        }
        return straight;

    }*/
    public static String reverse(String StringToReverse) {
        StringBuilder sb = new StringBuilder(StringToReverse);
        sb.reverse();

        return sb.toString();
    }
}

