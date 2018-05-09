import java.util.stream.IntStream;

public class Gnirts implements CharSequence {

    String text;

    public Gnirts(String text) {
        this.text = text;
    }

    @Override
    public int length() {

        return 0;
    }

    @Override
    public char charAt(int index) {
        char[] c_arr = text.toCharArray();
        return c_arr[text.length()-1-index];
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
