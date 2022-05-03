package HomeWork2.test;

import HomeWork2.Loops.Loops_1_1_2_;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Loops_1_1_2_Test {

    @Test
    public void correctIn5() {
        int a = 5;

        Assertions.assertEquals(120, Loops_1_1_2_.multiply(a));

    }

    @Test
    public void correctIn6() {
        int a = 6;

        Assertions.assertEquals(720,Loops_1_1_2_.multiply(a));

    }

    @Test
    public void correctIn10() {
        int a = 10;

        Assertions.assertEquals(3_628_800,Loops_1_1_2_.multiply(a));

    }
}
