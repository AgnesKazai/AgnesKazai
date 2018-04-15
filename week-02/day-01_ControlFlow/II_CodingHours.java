// An average Green Fox attendee codes 6 hours daily
// The semester is 17 weeks long
//
// Print how many hours is spent with coding in a semester by an attendee,
// if the attendee only codes on workdays.
//
// Print the percentage of the coding hours in the semester if the average
// work hours weekly is 52

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class II_CodingHours {
    public static void main(String[] args) {

        double percentage = (52 / 102.) * 100;

        System.out.println(6 * 5 * 17 + " hours is spent with coding in a semester by an attendee.");

        NumberFormat formatter = new DecimalFormat("#0.00");
        System.out.println(formatter.format(percentage) + " percentage of the coding hours in the semester.");



    }
}
