package HomeWork1;

import java.util.Objects;
import java.util.Scanner;

public class NamesIf_Else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = sc.nextLine();

        Boolean a = Objects.equals(name, "Вася");
        Boolean b = Objects.equals(name, "Анастасия");

        if (a){
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал!");
        } else if (b){
            System.out.println("Я тебя так долго ждал!");
        } else {
            System.out.println("Добрый день, а вы кто?");
        }

    }
}
