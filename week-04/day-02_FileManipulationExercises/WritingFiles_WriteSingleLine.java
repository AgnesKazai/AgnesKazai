// Open a file called "my-file.txt"
// Write your name in it as a single line
// If the program is unable to write the file,
// then it should print an error message like: "Unable to write file: my-file.txt"

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WritingFiles_WriteSingleLine {
    public static void main(String[] args) {

        List<String> name = new ArrayList<>(Arrays.asList("Agnes Kazai"));

        Path filePath = Paths.get("my name-file.txt");
        //Path filePath = Paths.get("assets/my-file.txt");
        try {
            Files.write(filePath, name);
            System.out.println("Success writing into the file!");
        } catch (IOException e) {
            System.out.println("Unable to write file: my name-file.txt");
        }
    }
}
