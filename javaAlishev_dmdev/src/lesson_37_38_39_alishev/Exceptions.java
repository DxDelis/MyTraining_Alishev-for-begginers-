package lesson_37_38_39_alishev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Обработка исключения в методе main");
        }
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("tda");
        Scanner scanner = new Scanner(file);
    }
}
