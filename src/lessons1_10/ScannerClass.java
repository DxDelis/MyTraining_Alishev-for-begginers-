package lessons1_10;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // создаем новый объекта класса Scanner
        System.out.println("Введите что-нибудь: ");
        int x = s.nextInt(); //считывает строчку с клавиатуры
        System.out.println("вывели " + x);
    }
}
