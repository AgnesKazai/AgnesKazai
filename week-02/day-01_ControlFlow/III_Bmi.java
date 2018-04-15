// Print the Body mass index (BMI) based on these values
import java.text.*;

public class III_Bmi {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;
        double bmi;

        heightInM *= 1.78;
        bmi = massInKg / heightInM ;

        //System.out.printf("%.2f", bmi);
        NumberFormat formatter = new DecimalFormat("#0.00");
        System.out.println(formatter.format(bmi));
        //System.out.println(bmi);
    }
}
