package HomeWork3_1.HomeWork3.test;

import HomeWork3_1.HomeWork3.calcs.api.ICalculator;
import HomeWork3_1.HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3_1.HomeWork3.calcs.simple.CalculatorWithMathExtends;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ICalculatorTest {

    @Test
    public void ICalculatorTest (){

        ICalculator calc1 = new CalculatorWithMathCopy();
        ICalculator calc2 = new CalculatorWithMathExtends();
        ICalculator calc3 = new CalculatorWithMathCopy();

        double a = calc3.AdivB(28, 5);
        double a1 = calc1.AdivBpow(a, 2);
        double a2 = calc2.AmultB(15, 7);
        double a3 = calc3.AplusB(a1, a2);
        double a4 = calc1.AplusB(4.1, a3);

        Assertions.assertEquals(140.45999999999998, a4);


    }

    @Test
    public void ICalculatorTest1 (){

        ICalculator calc1 = new CalculatorWithMathCopy();
        ICalculator calc2 = new CalculatorWithMathExtends();
        ICalculator calc3 = new CalculatorWithMathCopy();

        double a = calc1.AdivB(28, 5);
        double a1 = calc3.AdivBpow(a, 2);
        double a2 = calc1.AmultB(15, 7);
        double a3 = calc3.AplusB(a1, a2);
        double a4 = calc2.AplusB(4.1, a3);

        Assertions.assertEquals(140.45999999999998, a4);


    }

    @Test
    public void ICalculatorTest2 (){

        ICalculator calc1 = new CalculatorWithMathCopy();
        ICalculator calc2 = new CalculatorWithMathExtends();
        ICalculator calc3 = new CalculatorWithMathCopy();

        double a = calc2.AdivB(28, 5);
        double a1 = calc1.AdivBpow(a, 2);
        double a2 = calc1.AmultB(15, 7);
        double a3 = calc2.AplusB(a1, a2);
        double a4 = calc3.AplusB(4.1, a3);

        Assertions.assertEquals(140.45999999999998, a4);


    }
}
