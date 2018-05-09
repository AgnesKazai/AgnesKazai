import java.util.stream.IntStream;

public class Shifter implements CharSequence {
    String text;
    int number;

    public Shifter(String text, int number) {
        this.text = text;
        this.number = number;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        char[] c_arr = text.toCharArray();
        return c_arr[index + number];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

    @Override
    public IntStream chars() {
        return null;
    }

    @Override
    public IntStream codePoints() {
        return null;
    }
}
