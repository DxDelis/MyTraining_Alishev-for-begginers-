package lessons1_10;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст: ");
        String age = scanner.nextLine();
        switch(age){
            case "ноль":
                System.out.println("Ты родился");
                break;
            case "семь":
                System.out.println("Ты пошёл в школу");
                break;
            case "восемьнадцать":
                System.out.println("Ты закончил школу");
                break;
            default:
                System.out.println("ни одно из предыдущих условий не подошло");
        }
    }
}
