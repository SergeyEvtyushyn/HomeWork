package HomeWork2.Loops;

import java.util.Scanner;

public class Loops_1_1_1_ {

//    static Scanner num = new Scanner(System.in);
//    int n = num.nextInt();

    public static long mul(int n) {

//       while(n >20||n< 1)

//   {
//       System.out.println("Неверное число. Введите заново.");
//       n = num.nextInt();
//   }

    int i = 1;
    long mul = 1;
        while(i<n)

    {
        System.out.print(i + " * ");
        mul = mul * i;
        i++;
        if (i == n) {
            System.out.print(i);
            mul = mul * i;
        }

    }
        System.out.print(" = "+mul);
        System.out.println();
        return mul;
    }
}

