package Practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PracticeMain {
    public static void main(String[] args) {
        List<String[]> arr = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("/home/venkman/Documents/Java Project/BankSystem/src/Practice/sample.csv"));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                arr.add(parts);
            }

        } catch (IOException e) {
            System.out.printf("An error occurred while reading the file -> %s\n", e.getMessage());
        }
        for (String[] strings : arr) {
            for (String string : strings) {
                System.out.print(string+" ");
            }
            System.out.println();
        }
    }
}
