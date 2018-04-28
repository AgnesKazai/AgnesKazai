// Create a method that decrypts encoded-lines.txt

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class OptionalExercises_EncodedLines {
    public static void main(String[] args) {

        encodedLines("encoded-lines.txt");
    }

    private static void encodedLines(String file) {
        Path filePath = Paths.get(file);
        try {
            List<String> lines = Files.readAllLines(filePath);
            for (int i = 0; i < lines.size(); i++) {
                String s = lines.get(i);
                for (int j = 0; j < s.length(); j++) {
                    char ch = s.charAt(j);
                    if (ch != ' ') {
                        --ch;
                        System.out.print(ch);
                    } else {
                        System.out.print(' ');
                    }
                }
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("No such file");
        }
    }
}