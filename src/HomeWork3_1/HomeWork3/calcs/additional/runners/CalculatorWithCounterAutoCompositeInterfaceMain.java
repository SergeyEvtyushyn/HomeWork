package HomeWork3_1.HomeWork3.calcs.additional.runners;

import HomeWork3_1.HomeWork3.calcs.additional.calcs.CalculatorWithCounterAutoAgregationInterface;
import HomeWork3_1.HomeWork3.calcs.api.ICalculator;
import HomeWork3_1.HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3_1.HomeWork3.calcs.simple.CalculatorWithMathExtends;
import HomeWork3_1.HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {

        ICalculator calc1 = new CalculatorWithOperator();
        ICalculator calc2 = new CalculatorWithMathExtends();
        ICalculator calc3 = new CalculatorWithMathCopy();

        CalculatorWithCounterAutoAgregationInterface calc = new CalculatorWithCounterAutoAgregationInterface(calc3);

        double calcx = count(calc);
        System.out.println("4.1 + 15*7 + (28/5)^2  = " + calcx);
        System.out.println("Количество операций " + calc.getCountOperation());

    }

    public static double count(CalculatorWithCounterAutoAgregationInterface calc) {
        double div = calc.AdivB( 28, 5 );
        double exp = calc.AdivBpow( div, 2);
        double mul = calc.AmultB(15, 7);
        double sum = calc.AplusB(exp, mul);
        double rez = calc.AplusB(4.1, sum);
        return rez;
    }
}
