package HomeWork1.test;

import HomeWork1.SleepIn1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Objects;


public class SleepIn1Test {

    @Test
    public void sleepinTrue(){
        String name = "выходной";

        Boolean a = Objects.equals(name, "выходной");
        Boolean b = Objects.equals(name, "будний");

        Assertions.assertTrue(SleepIn1.sleepin(a,b));

    }


}
