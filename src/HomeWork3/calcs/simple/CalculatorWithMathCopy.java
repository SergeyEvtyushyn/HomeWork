package HomeWork3.calcs.simple;

public class CalculatorWithMathCopy {
        double a;
        double b;
        double c;
        double d;
        double e;
        int exponent;

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
        return a + b;
    }

    public double AminusB(double a, double b){
        return a - b;
    }

    public double AmultB(double a, double b){
        return a * b;
    }

    public double AdivB(double a, double b){
        return a / b;
    }

    /**
     * Метод возведения дробного числа в целую степень с применением библиотеки MAth
     * @param a Делимое
     * @param b Делитель
     * @param exponent Степень возведения
     * @return Результат вычисления
     */
    public double AdivBpow(double a, double b, int exponent){
        double x = a / b;
        return Math.pow(Math.abs(x), exponent);
    }

    /**
     * Метод вычисления модуля числа с применением библиотеки Math
     * @param a Вводимое значение
     * @return Модуль числа а
     */
     public double abs(double a){
        a = Math.abs(a);
        return a;
    }

    /**
     * Метод вычисления квадратного корня с применением библиотеки Math
     * @param a Вводимое число
     * @return Модуль числа a
     */

    public double radical (double a){
        a = Math.sqrt(a);
        return a;

    }

}
