package HomeWork3.calcs.additional.runners;

import HomeWork3.calcs.additional.calcs.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {

        CalculatorWithCounterAutoSuper a = new CalculatorWithCounterAutoSuper();
        a.setA(4.1);

        CalculatorWithCounterAutoSuper b = new CalculatorWithCounterAutoSuper();
        b.setB(15);

        CalculatorWithCounterAutoSuper c = new CalculatorWithCounterAutoSuper();
        c.setC(7);

        CalculatorWithCounterAutoSuper d = new CalculatorWithCounterAutoSuper();
        d.setD(28);

        CalculatorWithCounterAutoSuper e = new CalculatorWithCounterAutoSuper();
        e.setE(5);

        CalculatorWithCounterAutoSuper exponent = new CalculatorWithCounterAutoSuper();
        exponent.setExponent(2);

        CalculatorWithCounterAutoSuper calc = new CalculatorWithCounterAutoSuper();
        double calc1 = calc.AplusB ((calc.AplusB(a.getA() , calc.AmultB( b.getB(), c.getC() ) )), calc.AdivBpow(d.getD(), e.getE(), exponent.getExponent()) ); // Результат 140,45999999999998, совпадает с заданием 1 в WithoutCalculatorMain
        System.out.println(a.getA() + " + " + b.getB() + " * " + c.getC() + " + ( " + d.getD() + " / " + e.getE() + " ) ^ " + exponent.getExponent() + " = " + calc1);
        System.out.println("Количество операций " + calc.getCountOperation());
    }
}
