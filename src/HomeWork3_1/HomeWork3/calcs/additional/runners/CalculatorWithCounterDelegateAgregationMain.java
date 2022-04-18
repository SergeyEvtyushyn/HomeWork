package HomeWork3_1.HomeWork3.calcs.additional.runners;

import HomeWork3_1.HomeWork3.calcs.additional.calcs.CalculatorWithCounterAutoAgregation;
import HomeWork3_1.HomeWork3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterDelegateAgregationMain {
    public static void main(String[] args) {

    CalculatorWithMathCopy calc = new CalculatorWithMathCopy();
    CalculatorWithCounterAutoAgregation calc1 = new CalculatorWithCounterAutoAgregation(calc);

    double rez = count(calc1);
    System.out.println("4.1 + 15*7 + (28/5)^2  = " + rez);
    System.out.println("Количество операций " + calc1.getCountOperation());
    }

    public static double count(CalculatorWithCounterAutoAgregation calc1) {
        double div = calc1.AdivB( 28, 5 );
        double exp = calc1.AdivBpow( div, 2);
        double mul = calc1.AmultB(15, 7);
        double sum = calc1.AplusB(exp, mul);
        double rez = calc1.AplusB(4.1, sum);
        return rez;
    }
}
