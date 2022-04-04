package HomeWork2.Loops;

import java.util.Scanner;

public class Loops_1_4 {
    public static void main(String[] args) {
        Scanner an = new Scanner(System.in);
        System.out.println("Введите целое число для умножения:");
        double n1;

        while (true){
            n1 = an.nextDouble();
            if (n1 != (long)n1) {
                System.out.println("Введено не целое число. Повторите ввод:");
            } else break;
        }
        long n = (long)n1;
        long a = 1;
        long c = Long.MAX_VALUE / n;
        while ( a <= Math.abs(c)  ) {
             a *= n;
        }
        System.out.println("Переполнение.");
        System.out.println("Результат умножения до переполнения: " + a);
        System.out.println("Результат умножения до переполнения: " + a * n);

    }
}