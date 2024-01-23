package lesson_37_38_39_alishev;

import java.io.IOException;
import java.util.Scanner;

public class Exceptions38 {
    public static void main(String[] args) throws ScannerException38 {
        Scanner scanner = new Scanner(System.in);
        while(true){
            int x = Integer.parseInt(scanner.nextLine());

            if(x != 0) {
                throw new ScannerException38("Пользователь ввел что-то кроме нуля");
            }
        }
    }
}
