//Write a Stream Expression to convert a char array to a string!

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise9 {
    public static void main(String[] args) {
        String str = Stream.of('H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', '!')
                .map(String::valueOf)
                //.map(c -> String.valueOf(c))
                .collect(Collectors.joining());
        System.out.println(str);
    }
}
