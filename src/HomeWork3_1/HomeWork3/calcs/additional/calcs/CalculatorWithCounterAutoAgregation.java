package HomeWork3_1.HomeWork3.calcs.additional.calcs;

import HomeWork3_1.HomeWork3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoAgregation {

    private CalculatorWithMathCopy calc;

    long countOperation;

    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy calc){
        this.calc = calc;

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
     * Метод возведения числа в целую степень с применением библиотеки MAth
     * @param a Возводимое число
     * @param exponent Степень возведения
     * @return Результат вычисления
     */
    public double AdivBpow(double a, int exponent){
        ++countOperation;
        return calc.AdivBpow( a, exponent );
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
