package HomeWork3.runners;

import HomeWork3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy a = new CalculatorWithMathCopy();
        a.setA(4.1);

        CalculatorWithMathCopy b = new CalculatorWithMathCopy();
        b.setB(15);

        CalculatorWithMathCopy c = new CalculatorWithMathCopy();
        c.setC(7);

        CalculatorWithMathCopy d = new CalculatorWithMathCopy();
        d.setD(28);

        CalculatorWithMathCopy e = new CalculatorWithMathCopy();
        e.setE(5);

        CalculatorWithMathCopy exponent = new CalculatorWithMathCopy();
        exponent.setExponent(2);

        CalculatorWithMathCopy calc = new CalculatorWithMathCopy();

        System.out.print(a.getA() + " + " + b.getB() + " * " + c.getC() + " + ( " + d.getD() + " / " + e.getE() + " ) ^ " + exponent.getExponent() + " = ");
        System.out.println( a.getA() + calc.AmultB( b.getB(), c.getC() ) + calc.AdivBpow(d.getD(), e.getE(), exponent.getExponent()) ); // Результат 140,45999999999998, совпадает с заданием 1 в WithoutCalculatorMain


    }
}
