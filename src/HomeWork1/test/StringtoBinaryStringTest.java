package HomeWork1.test;

import HomeWork1.StringtoBinaryString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static HomeWork1.StringtoBinaryString.toBinaryString;

public class StringtoBinaryStringTest {

    @Test
    public void inCorrect42(){

    byte a = 42;

        String s = toBinaryString(a);

    Assertions.assertEquals("00101010", s);

    }

    @Test
    public void inCorrectMinus42(){

        byte a = -42;

        String s = toBinaryString(a);

        Assertions.assertEquals("11010110", s);

    }

    @Test
    public void inCorrect15(){

        byte a = 15;

        String s = toBinaryString(a);

        Assertions.assertEquals("00001111", s);

    }
    @Test
    public void inCorrectMinus15(){

        byte a = -15;

        String s = toBinaryString(a);

        Assertions.assertEquals("11110001", s);

    }
}
