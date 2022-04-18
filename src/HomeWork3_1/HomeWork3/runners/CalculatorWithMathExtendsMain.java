package HomeWork3_1.HomeWork3.runners;

import HomeWork3_1.HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3_1.HomeWork3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {

        CalculatorWithMathExtends calc = new CalculatorWithMathExtends();
        double rez = count(calc);
        System.out.print("4.1 + 15*7 + (28/5)^2  = " + rez ); // Результат 140,45999999999998, совпадает с заданием 1 в WithoutCalculatorMain


    }

    public static double count(CalculatorWithMathExtends calc) {

        double div = calc.AdivB( 28, 5 );
        double exp = calc.AdivBpow( div, 2);
        double mul = calc.AmultB(15, 7);
        double sum = calc.AplusB(exp, mul);
        double rez = calc.AplusB(4.1, sum);
        return rez;
    }
}
