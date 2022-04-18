package HomeWork3_1.HomeWork3.calcs.simple;

import HomeWork3_1.HomeWork3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {

    /**
     * Метод с переопределением возведения дробного числа в целую степень
     * @param a Возводимое число
     * @param exponent Степень возведения
     * @return Число в целой степени
     */
    public double AdivBpow (double a, int exponent){
        return Math.pow(Math.abs(a), exponent);
    }

    /**
     * Метод вычесления  модуля числа с переопределением
     * @param a Число
     * @return Модуль числа
     */
    public double abs (double a){
        a = Math.abs(a);
        return a;
    }


    /**
     * Метод вычисления квадратного корня из положительного числа с переопределением
     * @param a Число, из которого извлекаетя корень
     * @return Результат вычисления
     */
    public double radical (double a){
        a = Math.sqrt(a);
        return a;
    }

}
