
public class VariableMutation {
    public static void main(String[] args) {

        int a = 3;
        a += 10;
        // make it bigger by 10

        System.out.println(a);
        System.out.println("-------------");

        int b = 100;
        b -= 7;
        // make it smaller by 7

        System.out.println(b);
        System.out.println("-------------");


        int c = 44;
        c *= 2;
        // please double c's value

        System.out.println(c);
        System.out.println("-------------");


        int d = 125;
        d /= 5;
        // please divide by 5 d's value

        System.out.println(d);
        System.out.println("-------------");


        int e = 8;
        int result = (int) Math.pow(e, 3); //Mat.pov
        // please cube of e's value

        System.out.println(result);
        System.out.println("-------------");


        int f1 = 123;
        int f2 = 345;
        // tell if f1 is bigger than f2 (print as a boolean)
        boolean isF1Bigger = f1 > f2;
        System.out.println(isF1Bigger);
        System.out.println("-------------");


        int g1 = 350;
        int g2 = 200;
        // tell if the double of g2 is bigger than g1 (print as a boolean)
        boolean ifG2IsBigger = (g2 *= 2) > g1;
        System.out.println(ifG2IsBigger);
        System.out.println("-------------");

        int h = 135798745;
        // tell if it has 11 as a divisor (print as a boolean)
        boolean if11AsADivisor = h % 11 == 0;
        System.out.println(if11AsADivisor);
        System.out.println("-------------");

        int i1 = 10;
        int i2 = 3;
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)

        boolean squaredSmallerThanCube = i1 > Math.pow(i2, 2) && i1 < Math.pow(i2, 3);
        System.out.println(squaredSmallerThanCube);
        System.out.println("-------------");


        int j = 1521;
        // tell if j is dividable by 3 or 5 (print as a boolean)
        boolean dividable = j % 3 == 0 || j % 5 == 0;
        System.out.println(dividable);
        System.out.println("-------------");


        String k = "Apple";
        //fill the k variable with its content 4 times
        for (int i = 0; i < 2; i++) {
            k += k;
        }

        System.out.println(k);
    }

}
