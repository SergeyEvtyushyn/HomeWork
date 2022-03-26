package HomeWork1;

import java.util.Objects;
import java.util.Scanner;

public class SleepIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Рабочий день, Выходной или Отпуск?");
        String name = sc.nextLine();

        Boolean a = Objects.equals(name, "Рабочий день");
        Boolean b = Objects.equals(name, "Выходной") || Objects.equals(name, "Отпуск");

        if (a){
            System.out.println("Пора идти на работу :_(");
        }
        if (b){
            System.out.println("Можно еще спать!");
        }

    }
}
