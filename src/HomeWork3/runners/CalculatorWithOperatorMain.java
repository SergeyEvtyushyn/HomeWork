package HomeWork3.runners;

import HomeWork3.calcs.simple.CalculatorWithOperator;

import java.util.Arrays;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator a = new CalculatorWithOperator();
        a.setA(10);

        CalculatorWithOperator b = new CalculatorWithOperator();
        b.setB(235);

        CalculatorWithOperator calc = new CalculatorWithOperator();
        System.out.println(a.getA());
        System.out.println(b.getB());
        System.out.println("a + b = " + calc.AplusB( a.getA(), b.getB() ));
        System.out.println("a - b = " + calc.AminusB( a.getA(), b.getB() ));
        System.out.println("a * b = " + calc.AmultB( a.getA(), b.getB() ));
        System.out.println("a / b = " + calc.AdivB( a.getA(), b.getB()));
        System.out.println("(a / b) ^ 2 = " + calc.AdivBpow2( a.getA(), b.getB() ));
        System.out.println("|a / b| = " + calc.ABabs( a.getA(), b.getB() ));

        CalculatorWithOperator arr = new CalculatorWithOperator();
        
        double [] arr1 = arr.ABradical(a.getA(), b.getB());

        System.out.println("Квадратный корень из числа " + a.getA() + " составляет " + arr1[0]);
        System.out.println("Квадратный корень из числа " + b.getB() + " составляет " + arr1[1]);

    }
}
