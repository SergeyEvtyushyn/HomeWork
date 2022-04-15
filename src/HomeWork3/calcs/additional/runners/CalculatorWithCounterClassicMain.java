package HomeWork3.calcs.additional.runners;

import HomeWork3.calcs.additional.calcs.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
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

        CalculatorWithCounterClassic calc = new CalculatorWithCounterClassic();
        double calc1 = calc.AplusB ((calc.AplusB(a.getA() , calc.AmultB( b.getB(), c.getC() ) )), calc.AdivBpow(d.getD(), e.getE(), exponent.getExponent()) ); // Результат 140,45999999999998, совпадает с заданием 1 в WithoutCalculatorMain
        System.out.println(a.getA() + " + " + b.getB() + " * " + c.getC() + " + ( " + d.getD() + " / " + e.getE() + " ) ^ " + exponent.getExponent() + " = " + calc1);
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        System.out.println("Количество операций " + calc.getCountOperation());

    }
}
