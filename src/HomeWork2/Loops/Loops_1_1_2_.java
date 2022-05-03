package HomeWork2.Loops;

import java.util.Scanner;

public class Loops_1_1_2_ {

    public static long multiply(int m) {  // Рекурсия
        long mul = 1;

        if (m == 1 ){
            return 1;
        }
        mul = m * multiply(m-1);
        return mul;
    }


}


