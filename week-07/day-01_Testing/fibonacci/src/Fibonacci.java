public class Fibonacci {
    public int fibonacciNumbers(int number) throws Exception {
        if (number > 0){
            int actualNumber = 0;
            int prevA = 0, prevB = 1;
            for (int i = 1; i <= number; i++) {
                actualNumber = prevA + prevB;
                prevB = prevA;
                prevA = actualNumber;
            }
            return actualNumber;
        } else {
             throw new IllegalStateException("This is a negativ number!");
        }
    }
}
