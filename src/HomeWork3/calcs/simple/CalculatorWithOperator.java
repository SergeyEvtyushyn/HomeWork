package HomeWork3.calcs.simple;

public class CalculatorWithOperator {
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public void setE(double e) {
        this.e = e;
    }

    public double getE() {
        return e;
    }

    public int getExponent() {
        return exponent;
    }

    public void setExponent(int exponent) {
        this.exponent = exponent;
    }

    /**
     * Метод сложения двух чисел
     * @param a
     * @param b
     * @return Возврат суммы двух чисел
     */
    public double AplusB(double a, double b){
        return a + b;
    }

    /**
     * Метод вычитания из одного числа другого
     * @param a
     * @param b
     * @return Разность двух чисел
     */
    public double AminusB(double a, double b){
        return a - b;
    }

    /**
     * Метод умножения одного числа на другое
     * @param a
     * @param b
     * @return Результат умножения
     */
    public double AmultB(double a, double b){
        return a * b;
    }

    /**
     * Метод деления одного числа на другое
     * @param a делимое
     * @param b делитель
     * @return Результат деления
     */
    public double AdivB(double a, double b){
        return a / b;
    }

    /**
     * Метод возведения дробного числа в целую степень
     * @param a Числитель дробного числа
     * @param b Знаменатель дробного числа
     * @param exponent Степень возведения
     * @return Дробное число в целой степени
     */
     public double AdivBpow (double a, double b, int exponent){

        double x = a / b;
        if (x < 0){
            x *= - 1;
        }
        int i = 1;
        while ( i < exponent){
            x *= x;
            i++;
        }
        return x;
    }

    /**
     * Метод вычесления модуля числа
     * @param a Число
     * @return Модуль числа
     */
    public double ABabs (double a){
        if (a < 0){
            a *= - 1;
        }
        return a;
    }


    /**
     * Метод вычисления квадратного корня из положительного числа
     * @param a Число, из которого извлекаетя корень
     * @return Результат вычисления
     */
    public double Aradical (double a){

        if (a < 0){
            a *= - 1;
        }
        double x = a;
        for (int i = 0; i < 100; i++) {
            x = ( x + a/x) / 2;
        }
       return x;

    }

}
