package HomeWork3.calcs.additional.runners;

import HomeWork3.calcs.additional.calcs.CalculatorWithCounterAutoChoiceAgregation;
import HomeWork3.calcs.additional.calcs.CalculatorWithCounterClassic;
import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;
import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {

    CalculatorWithOperator calc = new CalculatorWithOperator();

    CalculatorWithMathCopy calc1 = new CalculatorWithMathCopy();

    CalculatorWithMathExtends calc2 = new CalculatorWithMathExtends();

    CalculatorWithCounterAutoChoiceAgregation calc4 = new CalculatorWithCounterAutoChoiceAgregation(calc2);

    CalculatorWithCounterAutoChoiceAgregation a = new CalculatorWithCounterAutoChoiceAgregation(calc);
        a.setA(4.1);

    CalculatorWithCounterAutoChoiceAgregation b = new CalculatorWithCounterAutoChoiceAgregation(calc);
        b.setB(15);

    CalculatorWithCounterAutoChoiceAgregation c = new CalculatorWithCounterAutoChoiceAgregation(calc);
        c.setC(7);

    CalculatorWithCounterAutoChoiceAgregation d = new CalculatorWithCounterAutoChoiceAgregation(calc);
        d.setD(28);

    CalculatorWithCounterAutoChoiceAgregation e = new CalculatorWithCounterAutoChoiceAgregation(calc);
        e.setE(5);

    CalculatorWithCounterAutoChoiceAgregation exponent = new CalculatorWithCounterAutoChoiceAgregation(calc);
        exponent.setExponent(2);


    double calcx = calc4.AplusB ((calc4.AplusB(a.getA() , calc4.AmultB( b.getB(), c.getC() ) )), calc4.AdivBpow(d.getD(), e.getE(), exponent.getExponent()) );
    System.out.println(a.getA() + " + " + b.getB() + " * " + c.getC() + " + ( " + d.getD() + " / " + e.getE() + " ) ^ " + exponent.getExponent() + " = " + calcx);
    System.out.println("Количество операций " + calc4.getCountOperation());
    }
}
