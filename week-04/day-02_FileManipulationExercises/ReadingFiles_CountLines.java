// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadingFiles_CountLines {
    public static void main(String[] args) {
        System.out.println(lineCounter("my-file.txt"));
        System.out.println(lineCounter("asd/my-file.txt"));
    }

    public static int lineCounter(String filename){
        Path filePath = Paths.get(filename);
        int numberOfLines = 0;
        try {
            List<String> line = Files.readAllLines(filePath);
            while (numberOfLines < line.size()) {
                line.get(numberOfLines);
                numberOfLines++;
            }
        } catch (IOException e) {
            return 0;
        }
        return numberOfLines;
    }
}
