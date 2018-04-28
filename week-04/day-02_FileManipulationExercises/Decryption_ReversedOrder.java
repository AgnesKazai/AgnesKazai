// Create a method that decrypts reversed-order.txt

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Decryption_ReversedOrder {
    public static void main(String[] args) {
        Path filePath = Paths.get("reversed-order.txt");
        try {
            List<String> lines = Files.readAllLines(filePath);
            ReversedOrder(lines);
        } catch (IOException e) {
            System.out.println("No such file");
        }
    }

    public static void ReversedOrder(List<String> lines) {
        for (int i = lines.size() - 1; i >= 0; i--) {
            System.out.println(lines.get(i));
        }
    }
}
