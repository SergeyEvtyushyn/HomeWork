package HomeWork3.calcs.additional.calcs;

import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;
import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {

    long countOperation;
    double a;
    double b;
    double c;
    double d;
    double e;
    int exponent;

    private CalculatorWithOperator calc;

    private CalculatorWithMathCopy calc1;

    private CalculatorWithMathExtends calc2;

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calc){
        this.calc = calc;

    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calc){
        this.calc1 = calc;

    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends calc){
        this.calc2 = calc;

    }



    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getC() {
        return c;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public void setExponent(int exponent) {
        this.exponent = exponent;
    }

    public int getExponent() {
        return exponent;
    }

    public double AplusB(double a, double b){
        ++countOperation;
        if ( calc != null ) {
            return calc.AplusB(a, b);
        } else if ( calc1 != null ) {
            return calc1.AplusB(a, b);
        } else {
            return calc2.AplusB(a, b);
        }
    }

    public double AminusB(double a, double b){
        ++countOperation;
        if ( calc != null ) {
            return calc.AminusB(a, b);
        } else if ( calc1 != null ) {
            return calc1.AminusB(a, b);
        } else {
            return calc2.AminusB(a, b);
        }
    }

    public double AmultB(double a, double b){
        ++countOperation;
        if ( calc != null ) {
            return calc.AmultB(a, b);
        } else if ( calc1 != null ) {
            return calc1.AmultB(a, b);
        } else {
            return calc2.AmultB(a, b);
        }
    }

    public double AdivB(double a, double b){
        ++countOperation;
        if ( calc != null ) {
            return calc.AdivB(a, b);
        } else if ( calc1 != null ) {
            return calc1.AdivB(a, b);
        } else {
            return calc2.AdivB(a, b);
        }
    }

    /**
     * Метод возведения дробного числа в целую степень с применением библиотеки MAth
     * @param a Делимое
     * @param b Делитель
     * @param exponent Степень возведения
     * @return Результат вычисления
     */
    public double AdivBpow(double a, double b, int exponent){
        ++countOperation;
        if ( calc != null ) {
            return calc.AdivBpow( a, b, exponent );
        } else if ( calc1 != null ) {
            return calc1.AdivBpow( a, b, exponent );
        } else {
            return calc2.AdivBpow(a, b, exponent);
        }
    }

    /**
     * Метод вычисления модуля числа с применением библиотеки Math
     * @param a Вводимое значение
     * @return Модуль числа а
     */
    public double abs(double a){
        ++countOperation;
        if ( calc != null ) {
            return calc.abs(a);
        } else if ( calc1 != null ) {
            return calc1.abs(a);
        } else {
            return calc2.abs(a);
        }
    }

    /**
     * Метод вычисления квадратного корня с применением библиотеки Math
     * @param a Вводимое число
     * @return Модуль числа a
     */

    public double radical (double a){
        ++countOperation;
        if ( calc != null ) {
            return calc.radical(a);
        } else if ( calc1 != null ) {
            return calc1.radical(a);
        } else {
            return calc2.radical(a);
        }
    }

    /**
     * Метод возврата количесвта операций
     * @return Количество математических операций
     */
    public long getCountOperation(){
        return countOperation;
    }

}
