// Print the Body mass index (BMI) based on these values
import java.text.*;

public class Bmi {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;
        double bmi;

        heightInM *= 1.78;
        bmi = massInKg / heightInM ;
        NumberFormat formatter = new DecimalFormat("#0.00");
        System.out.println(formatter.format(bmi));
    }
}
