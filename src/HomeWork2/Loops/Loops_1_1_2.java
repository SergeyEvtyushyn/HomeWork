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

        System.out.print(" = " + multiply(n));

    }
    private static long multiply(int m) {  // Рекурсия
        long mul = 1;

        if (m == 1 ){
            System.out.println("= 1");
            return mul;
        }
        System.out.print(mul + " * ");
        mul = mul * multiply(m);
        return mul;
    }


}


