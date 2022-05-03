package HomeWork2.Loops;

import java.util.Scanner;

public class Loops_1_3_ {

    public static double exponentiation(double a, int n) {

        double a_n = 1;
        for (int i = 0; i < n; i++) {
            a_n = a_n * a;
        }
        System.out.println(a + " ^ " + n + " = " + a_n);
        return a_n;
    }
}
