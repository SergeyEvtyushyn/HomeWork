package HomeWork3_1.HomeWork3.calcs.additional.runners;

import HomeWork3_1.HomeWork3.calcs.additional.calcs.CalculatorWithCounterClassic;


public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {


        CalculatorWithCounterClassic calc = new CalculatorWithCounterClassic();
        double rez = count(calc); // Результат 140,45999999999998, совпадает с заданием 1 в WithoutCalculatorMain
        System.out.println("4.1 + 15*7 + (28/5)^2  = " + rez);
        System.out.println("Количество операций " + calc.getCountOperation());

    }

    public static double count(CalculatorWithCounterClassic calc) {
        double div = calc.AdivB( 28, 5 );
        calc.incrementCountOperation();
        double exp = calc.AdivBpow( div, 2);
        calc.incrementCountOperation();
        double mul = calc.AmultB(15, 7);
        calc.incrementCountOperation();
        double sum = calc.AplusB(exp, mul);
        calc.incrementCountOperation();
        double rez = calc.AplusB(4.1, sum);
        calc.incrementCountOperation();
        return rez;
    }
}
