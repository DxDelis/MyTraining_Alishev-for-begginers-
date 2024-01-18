package lesson_36_alishev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:\\Users\\maksa\\OneDrive\\Desktop\\Test";
        File file = new File(path);

        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }

        scanner.close();
    }
}
