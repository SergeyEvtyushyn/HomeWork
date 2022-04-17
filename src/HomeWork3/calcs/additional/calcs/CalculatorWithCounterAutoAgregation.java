package HomeWork3.calcs.additional.calcs;

import HomeWork3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoAgregation {

    private CalculatorWithMathCopy calc;

    long countOperation;
    double a;
    double b;
    double c;
    double d;
    double e;
    int exponent;

    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy calc){
        this.calc = calc;

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
        return calc.AplusB(a, b);
    }

    public double AminusB(double a, double b){
        ++countOperation;
        return calc.AminusB( a, b);
    }

    public double AmultB(double a, double b){
        ++countOperation;
        return calc.AmultB( a, b );
    }

    public double AdivB(double a, double b){
        ++countOperation;
        return calc.AdivB( a, b);
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
        return calc.AdivBpow( a, b, exponent );
    }

    /**
     * Метод вычисления модуля числа с применением библиотеки Math
     * @param a Вводимое значение
     * @return Модуль числа а
     */
    public double abs(double a){
        ++countOperation;
        return calc.abs(a);
    }

    /**
     * Метод вычисления квадратного корня с применением библиотеки Math
     * @param a Вводимое число
     * @return Модуль числа a
     */

    public double radical (double a){
        ++countOperation;
        return calc.radical ( a );

    }

    /**
     * Метод возврата количесвта операций
     * @return Количество математических операций
     */
    public long getCountOperation(){
        return countOperation;
    }

}
