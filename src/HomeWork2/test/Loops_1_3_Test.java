package HomeWork2.test;

import HomeWork2.Loops.Loops_1_3_;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Loops_1_3_Test {

    @Test
    public void exponentiationTest(){
        int a = 18;
        int n = 5;

        Assertions.assertEquals(1889568.0, Loops_1_3_.exponentiation(a, n));

    }

    @Test
    public void exponentiationTest1(){
        float a = 7.5f;
        int n = 2;

        Assertions.assertEquals(56.25, Loops_1_3_.exponentiation(a, n));

    }

    @Test
    public void exponentiationTest2(){
        double a = 25.5;
        int n = 3;

        Assertions.assertEquals(16581.375, Loops_1_3_.exponentiation(a, n));

    }
}
