// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.*;

public class Core_CopyFile {
    public static void main(String[] args) {

        if (copiesFile("copyFrom.txt", "copyTo.txt")) {
            System.out.println("The copy was successful!");
        } else {
            System.out.println("The copy was faild!");
        }
    }

    public static boolean copiesFile(String from, String to) {
        try {
            //Files.copy(Paths.get(from), Paths.get(to), REPLACE_EXISTING);
            Files.copy(Paths.get("copyFrom.txt"), Paths.get("asd/copyTo.txt"), REPLACE_EXISTING);
        } catch (IOException e) {
            return false;
        }
        return true;
    }
}
