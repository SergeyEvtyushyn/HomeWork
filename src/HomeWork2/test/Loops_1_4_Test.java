package HomeWork2.test;

import HomeWork2.Loops.Loops_1_4_;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Loops_1_4_Test {

    @Test
    public void overflowTest(){
        int a = 3;

        Assertions.assertEquals(4_052_555_153_018_976_267L, Loops_1_4_.overflow(a));

    }

    @Test
    public void overflowTest1(){
        int a = 188;

        Assertions.assertEquals(1_560_496_482_665_168_896L, Loops_1_4_.overflow(a));

    }

    @Test
    public void overflowTest2(){
        int a = -19;

        Assertions.assertEquals(799_006_685_782_884_121L, Loops_1_4_.overflow(a));

    }

    @Test
    public void overflowTest3(){
        int a = -133;

        Assertions.assertEquals(97_906_861_202_319_841L, Loops_1_4_.overflow(a));

    }
}
