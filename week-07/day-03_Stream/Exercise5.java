//Write a Stream Expression to find the uppercase characters in a string!

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise5 {
    public static void main(String[] args) {

        List<Character> uppercase = "WriteAStreamExpressionToFindTheUppercaseCharactersAnAString".chars()
                .filter(n -> n > 64 && n < 91)
                .mapToObj(n -> (char) n)
                .collect(Collectors.toList());
        System.out.println("Uppercase characters: \n" + uppercase);

//        List<Character> characterStream = s.chars()
//                .filter(n -> (Character.isUpperCase((char) n)))
//                .mapToObj(n -> (char) n)
//                .collect(Collectors.toList());
//        System.out.println("Uppercase characters: \n" + characterStream);
    }
}

