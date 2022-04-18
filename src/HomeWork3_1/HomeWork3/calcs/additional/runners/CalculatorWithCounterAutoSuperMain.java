package HomeWork3_1.HomeWork3.calcs.additional.runners;

import HomeWork3_1.HomeWork3.calcs.additional.calcs.CalculatorWithCounterAutoSuper;


public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {


        CalculatorWithCounterAutoSuper calc = new CalculatorWithCounterAutoSuper();
        double rez = count(calc); // Результат 140,45999999999998, совпадает с заданием 1 в WithoutCalculatorMain
        System.out.println("4.1 + 15*7 + (28/5)^2  = " + rez);
        System.out.println("Количество операций " + calc.getCountOperation());
    }

    public static double count(CalculatorWithCounterAutoSuper calc) {
        double div = calc.AdivB( 28, 5 );
        double exp = calc.AdivBpow( div, 2);
        double mul = calc.AmultB(15, 7);
        double sum = calc.AplusB(exp, mul);
        double rez = calc.AplusB(4.1, sum);
        return rez;
    }
}
