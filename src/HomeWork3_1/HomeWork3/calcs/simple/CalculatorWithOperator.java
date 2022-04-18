package HomeWork3_1.HomeWork3.calcs.simple;

import HomeWork3_1.HomeWork3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {

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
     * Метод возведения числа в целую степень
     * @param a Числитель дробного числа
     * @param exponent Степень возведения
     * @return Число в целой степени
     */
     public double AdivBpow (double a, int exponent){
        double x = a < 0 ? -a : a;
        int i = 1;
        while ( i < exponent){
            a *= a;
            i++;
        }
        return a;
    }

    /**
     * Метод вычесления модуля числа
     * @param a Число
     * @return Модуль числа
     */
    public double abs (double a){
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
    public double radical (double a){

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
