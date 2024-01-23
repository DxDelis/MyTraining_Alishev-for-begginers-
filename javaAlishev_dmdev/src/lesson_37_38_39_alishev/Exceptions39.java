package lesson_37_38_39_alishev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions39 {
    public static void main(String[] args) {
        //Checked Exceptions = исключительные случаи в работе программы
        File file = new File("test");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Такого файла нет");
        }

        //Unchecked Exceptions = Ошибка в работе программы

        int[] arr = new int[2];
        System.out.println(arr[2]);


    }
}
