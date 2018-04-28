// Create a method that find the 5 most common lottery numbers in lottery.csv

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class OptionalExercises_Lottery {
    public static void main(String[] args) {

        try {
            lotteryNumbers("lottery.csv");
        } catch (IOException e) {
            System.out.println("No such file");
        }
    }

    public static void lotteryNumbers(String file) throws IOException {
        Map<String, Integer> maps = new HashMap<>();
        Path filePath = Paths.get(file);
        List<String> lines = Files.readAllLines(filePath);
        for (String item : Files.readAllLines(filePath)) {
            String[] st = item.split(";");
            for (int i = st.length - 1; i > st.length - 6; i--) {
                Integer freq = maps.get(st[i]);
                maps.put(st[i], (freq == null ? 1 : freq + 1));
            }
        }
        maps.entrySet().stream()
                .sorted((a, b) -> b.getValue() - a.getValue())
                .limit(5)
                .forEach(entry -> System.out.println(entry));
    }
}
