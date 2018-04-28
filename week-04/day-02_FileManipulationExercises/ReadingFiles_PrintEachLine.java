// Write a program that opens a file called "my-file.txt", then prints
// each of lines form the file.
// If the program is unable to read the file (for example it does not exists),
// then it should print an error message like: "Unable to read file: my-file.txt"

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadingFiles_PrintEachLine {
    public static void main(String[] args) {
        /*File file = new File("my-file.txt");
        //File file = new File("Not my-file.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println("Unable to read file: my-file.txt");
        }*/
        //Solution 2
        Path filePath = Paths.get("my-file.txt");
        //Path filePath = Paths.get("Not my-file.txt");
        try {
            List<String> line = Files.readAllLines(filePath);
            for (String lines : Files.readAllLines(filePath)) {
                System.out.println(lines);
            }
        } catch (IOException e) {
            System.out.println("Unable to read file: my-file.txt");
        }
    }
}


