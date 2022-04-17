package HomeWork3.calcs.additional.runners;

import HomeWork3.calcs.additional.calcs.CalculatorWithCounterAutoAgregation;
import HomeWork3.calcs.additional.calcs.CalculatorWithCounterClassic;
import HomeWork3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterDelegateAgregationMain {
    public static void main(String[] args) {

    CalculatorWithMathCopy calc = new CalculatorWithMathCopy();
    CalculatorWithCounterAutoAgregation calc1 = new CalculatorWithCounterAutoAgregation(calc);

        CalculatorWithCounterAutoAgregation a = new CalculatorWithCounterAutoAgregation(calc);
        a.setA(4.1);

        CalculatorWithCounterAutoAgregation b = new CalculatorWithCounterAutoAgregation(calc);
        b.setB(15);

        CalculatorWithCounterAutoAgregation c = new CalculatorWithCounterAutoAgregation(calc);
        c.setC(7);

        CalculatorWithCounterAutoAgregation d = new CalculatorWithCounterAutoAgregation(calc);
        d.setD(28);

        CalculatorWithCounterAutoAgregation e = new CalculatorWithCounterAutoAgregation(calc);
        e.setE(5);

        CalculatorWithCounterAutoAgregation exponent = new CalculatorWithCounterAutoAgregation(calc);
        exponent.setExponent(2);

    double calc2 = calc1.AplusB ((calc1.AplusB(a.getA() , calc1.AmultB( b.getB(), c.getC() ) )), calc1.AdivBpow(d.getD(), e.getE(), exponent.getExponent()) );
    System.out.println(a.getA() + " + " + b.getB() + " * " + c.getC() + " + ( " + d.getD() + " / " + e.getE() + " ) ^ " + exponent.getExponent() + " = " + calc2);
    System.out.println("Количество операций " + calc1.getCountOperation());
    }
}
