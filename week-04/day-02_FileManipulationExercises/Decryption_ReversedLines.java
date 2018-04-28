// Create a method that decrypts reversed-lines.txt

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Decryption_ReversedLines {
    public static void main(String[] args) {
        decryptsReversedLines("reversed-lines.txt");
        decryptsReversedLines("asd/reversed-lines.txt");

    }

    private static void decryptsReversedLines(String filename) {
        Path filePath = Paths.get(filename);
        try {
            List<String> lines = Files.readAllLines(filePath);
            for (int i = 0; i < lines.size(); i++) {
                StringBuilder sb = new StringBuilder(lines.get(i));
                sb.reverse();
                System.out.println(sb.toString());
            }
        } catch (IOException e) {
            System.out.println("No such file");
        }
    }
}
