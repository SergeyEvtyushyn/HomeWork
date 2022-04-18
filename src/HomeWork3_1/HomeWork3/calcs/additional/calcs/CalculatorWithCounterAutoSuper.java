package HomeWork3_1.HomeWork3.calcs.additional.calcs;

import HomeWork3_1.HomeWork3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {

    long countOperation;

    /**
     * Метод сложения двух чисел с вызовом из материнского класса со счетчиком операций
     * @param a Первое число
     * @param b Второе число
     * @return Сумма двух чисел
     */
    public double AplusB(double a, double b){
        countOperation = countOperation + 1;
        return super.AplusB( a, b );
    }

    /**
     * Метод вычетания двух чисел с вызовом из материнского класса со счетчиком операций
     * @param a Первое число
     * @param b Второе число
     * @return Разность двух чисел
     */
    public double AminusB(double a, double b){
        countOperation = countOperation + 1;
        return super.AminusB( a, b );
    }

    /**
     * Метод умножения двух чисел с вызовом из материнского класса со счетчиком операций
     * @param a Первое число
     * @param b Второе число
     * @return Умножение двух чисел
     */
    public double AmultB(double a, double b){
        countOperation = countOperation + 1;
        return super.AmultB( a, b );
    }

    /**
     * Метод деления двух чисел с вызовом из материнского класса со счетчиком операций
     * @param a делимое
     * @param b делитель
     * @return Результат деления
     */
    public double AdivB(double a, double b){
        countOperation = countOperation + 1;
        return super.AdivB( a, b );
    }

    /**
     * Метод возведения в целую степень деления двух чисел с вызовом из материнского класса со счетчиком операций
     * @param a Возводимое число
     * @param exponent Степень возведения
     * @return Рузультат возведения в степень
     */
    public double AdivBpow (double a, int exponent){
        countOperation = countOperation + 1;
        return super.AdivBpow(a, exponent);
    }

    /**
     * Метод определения модуля числа с вызовом из материнского класса со счетчиком операций
     * @param a Число
     * @return Модуль числа
     */
    public double abs (double a){
        countOperation = countOperation + 1;
        return super.abs (a);
    }

    /**
     * Метод вычисления квадратного корня из положительного числа со счетчиком операций
     * @param a Число, из которого извлекаетя корень
     * @return Корень из числа
     */
    public double radical (double a){
        countOperation = countOperation + 1;
        return super.radical (a);
    }

    /**
     * Метод возврата количесвта операций
     * @return Количество математических операций
     */
    public long getCountOperation(){
        return countOperation;
    }
}
