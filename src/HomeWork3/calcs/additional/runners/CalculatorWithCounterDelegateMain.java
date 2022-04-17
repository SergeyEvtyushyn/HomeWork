package HomeWork3.calcs.additional.runners;

import HomeWork3.calcs.additional.calcs.CalculatorWithCounterAutoComposite;
import HomeWork3.calcs.additional.calcs.CalculatorWithCounterClassic;

public class CalculatorWithCounterDelegateMain {
    public static void main(String[] args) {

        CalculatorWithCounterClassic a = new CalculatorWithCounterClassic();
        a.setA(4.1);

        CalculatorWithCounterClassic b = new CalculatorWithCounterClassic();
        b.setB(15);

        CalculatorWithCounterClassic c = new CalculatorWithCounterClassic();
        c.setC(7);

        CalculatorWithCounterClassic d = new CalculatorWithCounterClassic();
        d.setD(28);

        CalculatorWithCounterClassic e = new CalculatorWithCounterClassic();
        e.setE(5);

        CalculatorWithCounterClassic exponent = new CalculatorWithCounterClassic();
        exponent.setExponent(2);

        CalculatorWithCounterAutoComposite calc1 = new CalculatorWithCounterAutoComposite();
        double calc2 = calc1.AplusB ((calc1.AplusB(a.getA() , calc1.AmultB( b.getB(), c.getC() ) )), calc1.AdivBpow(d.getD(), e.getE(), exponent.getExponent()) );
        System.out.println(a.getA() + " + " + b.getB() + " * " + c.getC() + " + ( " + d.getD() + " / " + e.getE() + " ) ^ " + exponent.getExponent() + " = " + calc2);
        System.out.println("Количество операций " + calc1.getCountOperation());
    }
}
