package HomeWork3_1.HomeWork3.calcs.simple;

import HomeWork3_1.HomeWork3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {

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
     * Метод возведения числа в целую степень с применением библиотеки MAth
     * @param a Возводимое число
     * @param exponent Степень возведения
     * @return Результат вычисления
     */
    public double AdivBpow(double a, int exponent){
        return Math.pow(Math.abs(a), exponent);
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
