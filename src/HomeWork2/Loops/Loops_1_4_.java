package HomeWork2.Loops;

import java.util.Scanner;

public class Loops_1_4_ {

    public static double overflow(int n1) {

        long n = (long)n1;
        long a = 1;
        long c = Long.MAX_VALUE / n;
        while ( a <= Math.abs(c)  ) {
             a *= n;
        }
        System.out.println("Переполнение.");
        System.out.println("Результат умножения до переполнения: " + a);
        System.out.println("Результат умножения после переполнения: " + a * n);
        return a;
    }
}