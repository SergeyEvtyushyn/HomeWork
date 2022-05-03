package HomeWork2.Loops;

import java.util.Scanner;

public class Loops_1_1_2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите число от 1 до 20, до которого считать:"); // После 20 происходит переполнение.
        int n = num.nextInt();

        while (n > 20  || n < 1) {
            System.out.println("Неверное число. Введите заново.");
            n = num.nextInt();
        }
        for (int i = 1; i < n; i++) {
            System.out.print(i +" * ");
        }
        for (int i = n; i <= n; i++) {
            System.out.print(i);
        }
    System.out.print(" = " + multiply(n));

    }
    private static long multiply(int m) {  // Рекурсия
        long mul = 1;

        if (m == 1 ){
            return 1;
        }
        mul = m * multiply(m-1);
        return mul;
    }


}


