package HomeWork2.Loops;

import java.util.Scanner;

public class Loops_1_4 {
    public static void main(String[] args) {
        //Scanner an = new Scanner(System.in);
        //System.out.println("Введите число умножения:");
        //long n = an.nextLong();
        int n = 3;
        long a = 1;

        while ( a <= Long.MAX_VALUE ) { //|| a >= -9_223_372_036_854_775_808L

             a = a * n;

            //if (a > Long.MAX_VALUE){
            //    System.out.println("Значение до переполенения" + a / n);
            //    System.out.println("Значение после переполенения" + a);
            //} else if (a < -9_223_372_036_854_775_808l){
            //    System.out.println("Значение до переполенения" + a / n);
            //    System.out.println("Значение после переполенения" + a);
            //}


        }
        System.out.println(a);
        //System.out.println(a);

        //float a_n = 1;
       //for (int i = 0; i < n; i++) {
          //  a_n = a_n * a;
        //}
        //System.out.println(a + " ^ " + n + " = " + a_n);
    }
}
