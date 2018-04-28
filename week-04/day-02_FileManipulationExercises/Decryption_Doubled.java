// Create a method that decrypts the duplicated-chars.txt

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Decryption_Doubled {
    public static void main(String[] args) {

        try {
            duplicatedChars("duplicated-chars.txt");
        } catch (IOException e) {
            System.out.println("No such file");
        }
    }

    private static void duplicatedChars(String file) throws IOException {
        Path filePath = Paths.get(file);
        List<String> lines = Files.readAllLines(filePath);
        for (int i = 0; i < lines.size(); i++) {
            String s = lines.get(i);
            for (int j = 0; j < s.length(); j += 2) {
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
    }
}
