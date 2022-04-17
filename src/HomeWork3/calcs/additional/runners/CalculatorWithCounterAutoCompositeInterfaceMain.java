package HomeWork3.calcs.additional.runners;

import HomeWork3.calcs.additional.calcs.CalculatorWithCounterAutoAgregationInterface;
import HomeWork3.calcs.additional.calcs.CalculatorWithCounterAutoSuper;
import HomeWork3.calcs.additional.calcs.CalculatorWithCounterClassic;
import HomeWork3.calcs.api.ICalculator;
import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;
import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {

        ICalculator calc1 = new CalculatorWithOperator();
        ICalculator calc2 = new CalculatorWithMathExtends();
        ICalculator calc3 = new CalculatorWithMathCopy();

        CalculatorWithCounterAutoAgregationInterface calc = new CalculatorWithCounterAutoAgregationInterface(calc2);

        CalculatorWithCounterAutoAgregationInterface a = new CalculatorWithCounterAutoAgregationInterface(calc);
        a.setA(4.1);

        CalculatorWithCounterAutoAgregationInterface b = new CalculatorWithCounterAutoAgregationInterface(calc);
        b.setB(15);

        CalculatorWithCounterAutoAgregationInterface c = new CalculatorWithCounterAutoAgregationInterface(calc);
        c.setC(7);

        CalculatorWithCounterAutoAgregationInterface d = new CalculatorWithCounterAutoAgregationInterface(calc);
        d.setD(28);

        CalculatorWithCounterAutoAgregationInterface e = new CalculatorWithCounterAutoAgregationInterface(calc);
        e.setE(5);

        CalculatorWithCounterAutoSuper exponent = new CalculatorWithCounterAutoSuper();
        exponent.setExponent(2);


        double calcx = calc.AplusB ((calc.AplusB(a.getA() , calc.AmultB( b.getB(), c.getC() ) )), calc.AdivBpow(d.getD(), e.getE(), exponent.getExponent()) );
        System.out.println(a.getA() + " + " + b.getB() + " * " + c.getC() + " + ( " + d.getD() + " / " + e.getE() + " ) ^ " + exponent.getExponent() + " = " + calcx);
        System.out.println("Количество операций " + calc.getCountOperation());

    }
}
