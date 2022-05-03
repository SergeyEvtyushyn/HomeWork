package HomeWork2.test;

import HomeWork2.Loops.Loops_1_2_;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Loops_1_2_Test {

    @Test
    public void correctCount(){
        String s = "181232375";

        Assertions.assertEquals(10080, Loops_1_2_.count(s));

    }

    @Test
    public void correctCount1(){

        String s = "123456789";

        Assertions.assertEquals(362880, Loops_1_2_.count(s));

    }
}
