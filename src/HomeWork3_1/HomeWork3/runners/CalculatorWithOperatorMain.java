package HomeWork3_1.HomeWork3.runners;


import HomeWork3_1.HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {

        CalculatorWithOperator calc = new CalculatorWithOperator();

        double rez = count(calc);
        System.out.print("4.1 + 15*7 + (28/5)^2  = " + rez ); // Результат 140,45999999999998, совпадает с заданием 1 в WithoutCalculatorMain


    }

    public static double count(CalculatorWithOperator calc) {

        double div = calc.AdivB( 28, 5 );
        double exp = calc.AdivBpow( div, 2);
        double mul = calc.AmultB(15, 7);
        double sum = calc.AplusB(exp, mul);
        double rez = calc.AplusB(4.1, sum);
        return rez;
    }

}
