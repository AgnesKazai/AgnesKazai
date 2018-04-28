// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class Core_Logs {
    public static void main(String[] args) {
        try {
            System.out.println(ipCollector("log.txt"));
            System.out.println(getPostRatio("log.txt"));
        } catch (IOException e) {
            System.out.println("No such file");
        }
    }

    public static ArrayList<String> ipCollector(String file1) throws IOException {
        ArrayList<String> ipAddresses = new ArrayList<>();
        Path filePath = Paths.get(file1);
        List<String> lines = Files.readAllLines(filePath);
        int i = 0;
        for (String item : Files.readAllLines(filePath)) {
            String[] splitList = item.split(" ");
            ipAddresses.add(splitList[8]);
        }
        return ipAddresses;
    }

    public static String getPostRatio(String file2) throws IOException {
        int post = 0;
        int get = 0;
        ArrayList<String> getPost = new ArrayList<>();
        Path filePath = Paths.get(file2);
        List<String> lines = Files.readAllLines(filePath);
        int i = 0;
        for (String item : Files.readAllLines(filePath)) {
            String[] splitList = item.split(" ");
            if (splitList[11].equals("GET")) {
                get++;
            } else {
                post++;
            }
        }
        NumberFormat formatter = new DecimalFormat("# 0.00");
        return formatter.format(get * 1.0 / post);
    }
}
