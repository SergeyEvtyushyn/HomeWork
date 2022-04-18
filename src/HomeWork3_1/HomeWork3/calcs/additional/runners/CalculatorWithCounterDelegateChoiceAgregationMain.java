package HomeWork3_1.HomeWork3.calcs.additional.runners;

import HomeWork3_1.HomeWork3.calcs.additional.calcs.CalculatorWithCounterAutoChoiceAgregation;
import HomeWork3_1.HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3_1.HomeWork3.calcs.simple.CalculatorWithMathExtends;
import HomeWork3_1.HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {

    CalculatorWithOperator calc = new CalculatorWithOperator();

    CalculatorWithMathCopy calc1 = new CalculatorWithMathCopy();

    CalculatorWithMathExtends calc2 = new CalculatorWithMathExtends();

    CalculatorWithCounterAutoChoiceAgregation calc4 = new CalculatorWithCounterAutoChoiceAgregation(calc2);

    double calcx = count(calc4);
        System.out.println("4.1 + 15*7 + (28/5)^2  = " + calcx);
    System.out.println("Количество операций " + calc4.getCountOperation());
    }

    public static double count(CalculatorWithCounterAutoChoiceAgregation calc4) {
        double div = calc4.AdivB( 28, 5 );
        double exp = calc4.AdivBpow( div, 2);
        double mul = calc4.AmultB(15, 7);
        double sum = calc4.AplusB(exp, mul);
        double rez = calc4.AplusB(4.1, sum);
        return rez;
    }

}
