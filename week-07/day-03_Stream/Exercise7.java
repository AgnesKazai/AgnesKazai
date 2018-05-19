//Write a Stream Expression to find the frequency of characters in a given string!
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise7 {
    public static void main(String[] args) {
        Map<Character, Long> freq = ("frequencyofcharactersinagivenstring").chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println("Frequencies:\n" + freq);


//        String s = "frequencyofcharactersinagivenstring";
//        Map<Character, Integer> frequencies = s.chars().boxed()
//                .collect(Collectors.toMap(
//                        k -> (char) k.intValue(),
//                        v -> 1,
//                        Integer::sum));
//        System.out.println("Frequencies:\n" + frequencies);
    }
}
