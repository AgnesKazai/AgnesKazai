// When saving this quote a disk error has occured. Please fix it.
// Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
// Using pieces of the quote variable (instead of just redefining the string)

public class Strings_TakesLonger_III {

    public static void main(String[] args) {

        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        String quote2 = "always takes longer than ";

        StringBuilder sb = new StringBuilder(quote);
        int IndexOfYou = sb.indexOf("you");
        //System.out.println(IndexOfYou);
        sb.insert(IndexOfYou, quote2);
        System.out.println(sb.toString());
    }


}


