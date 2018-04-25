
public class ConditionalVariableMutation {
    public static void main(String[] args) {

        // if a is even increment out by one
        double a = 24;
        int out = 0;


        if (a % 1 == 0) {
            out++;
            System.out.println(out);
        }
        System.out.println("---------");

        // if b is between 10 and 20 set out2 to "Sweet!"
        // if less than 10 set out2 to "Less!",
        // if more than 20 set out2 to "More!"
        int b = 13;
        String out2 = "";

        if (10 < b && b < 20) {
            out2 = "Sweet!";
            System.out.println(out2);

        } else if (b < 10) {
            out2 = "Less!";
            System.out.println(out2);
        } else {
            out2 = "More!";
            System.out.println(out2);
        }
        System.out.println("---------");


        // if credits are at least 50,
        // and isBonus is false decrement c by 2
        // if credits are smaller than 50,
        // and isBonus is false decrement c by 1
        // if isBonus is true c should remain the same
        int c = 123;
        int credits = 100;
        boolean isBonus = false;

        isBonus = true;
        if (isBonus) {
            System.out.println(c);   //This is true.
        }

        isBonus = false;
        if ((credits >= 50) && !isBonus) {
            c -= 2;
            System.out.println(c);      //This is also true..

        }
        if ((credits < 50) && !isBonus) {
            c -= 1;
            System.out.println(c);

        }
        System.out.println("---------");


        // if d is dividable by 4
        // and time is not more than 200
        // set out3 to "check"
        // if time is more than 200
        // set out3 to "Time out"
        // otherwise set out3 to "Run Forest Run!"
        int d = 8;
        int time = 120;
        String out3 = " ";

        if (d % 4 == 0 && time < 200) {
            out3 = "check";
            System.out.println(out3);
        } else if (time > 200) {
            out3 = "Time out";
            System.out.println(out3);
        } else {

            System.out.println("out3");
        }
    }
}
