package HomeWork3.runners;


import HomeWork3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends a = new CalculatorWithMathExtends();
        a.setA(4.1);

        CalculatorWithMathExtends b = new CalculatorWithMathExtends();
        b.setB(15);

        CalculatorWithMathExtends c = new CalculatorWithMathExtends();
        c.setC(7);

        CalculatorWithMathExtends d = new CalculatorWithMathExtends();
        d.setD(28);

        CalculatorWithMathExtends e = new CalculatorWithMathExtends();
        e.setE(5);

        CalculatorWithMathExtends exponent = new CalculatorWithMathExtends();
        exponent.setExponent(2);

        CalculatorWithMathExtends calc = new CalculatorWithMathExtends();

        System.out.print(a.getA() + " + " + b.getB() + " * " + c.getC() + " + ( " + d.getD() + " / " + e.getE() + " ) ^ " + exponent.getExponent() + " = ");
        System.out.println( a.getA() + calc.AmultB( b.getB(), c.getC() ) + calc.AdivBpow(d.getD(), e.getE(), exponent.getExponent()) ); // Результат 140,45999999999998, совпадает с заданием 1 в WithoutCalculatorMain

    }
}
