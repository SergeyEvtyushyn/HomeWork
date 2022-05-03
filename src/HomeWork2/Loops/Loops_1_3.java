package HomeWork2.Loops;

import java.util.Scanner;

public class Loops_1_3 {
    public static void main(String[] args) {
        Scanner an = new Scanner(System.in);
        System.out.println("Введите число:");
        double a = an.nextDouble();
        System.out.println("Введите степень(целое и неотрицательное число):");

        double n = an.nextDouble();
        while ( n < 0 || n % 1 != 0) {
            System.out.println("Неверная степень(целое и неотрицательное число). Попробуйте еще раз.");
            n = an.nextInt();
        }


        double a_n = 1;
        for (int i = 0; i < n; i++) {
            a_n = a_n * a;
        }
        System.out.println(a + " ^ " + n + " = " + a_n);
    }
}
