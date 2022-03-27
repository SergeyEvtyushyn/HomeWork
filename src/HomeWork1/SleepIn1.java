package HomeWork1;

import java.util.Objects;
import java.util.Scanner;

public class SleepIn1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Какой сегодня день, будний или выходной?");
        String name = sc.nextLine();

        Boolean a = Objects.equals(name, "выходной");
        Boolean b = Objects.equals(name, "будний");
        
        
        if (sleepin(a, b)){
            System.out.println("Спи дальше...");
        } else {
            System.out.println("Подьем, на работу пора!");
        }


    }

    public static boolean sleepin(boolean vacation, boolean weekday){

        if (vacation) {

        } else if (weekday) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Отпуск?");
            String name = sc.nextLine();
            boolean c = Objects.equals(name, "да");

            if (c) {
                return true;

            } else {
                return false;

            }
        }return true;

    }
}
