package HomeWork2.Loops;

import java.util.Scanner;

public class Loops_1_1_1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите число от 1 до 20, до которого считать:"); // После 20 происходит переполнение.
        int n = num.nextInt();

        while (n > 20  || n < 1) {
            System.out.println("Неверное число. Введите заново.");
            n = num.nextInt();
        }

        int i = 1;
        long mul = 1;
        while (i < n) {
            System.out.print(i + " * ");
            mul = mul * i;
            i++;
            if (i == n) {
                System.out.print(i);
                mul = mul * i;
        }

        }
        System.out.print(" = " + mul);


    }
}
