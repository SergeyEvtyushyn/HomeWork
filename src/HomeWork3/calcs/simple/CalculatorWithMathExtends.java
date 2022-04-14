package HomeWork3.calcs.simple;

public class CalculatorWithMathExtends extends CalculatorWithOperator{

    /**
     * Метод с переопределением возведения дробного числа в целую степень
     * @param a Числитель дробного числа
     * @param b Знаменатель дробного числа
     * @param exponent Степень возведения
     * @return Дробное число в целой степени
     */
    public double AdivBpow (double a, double b, int exponent){

        double x = a / b;
        return Math.pow(Math.abs(x), exponent);
    }

    /**
     * Метод вычесления  модуля числа с переопределением
     * @param a Число
     * @return Модуль числа
     */
    public double ABabs (double a){
        a = Math.abs(a);
        return a;
    }


    /**
     * Метод вычисления квадратного корня из положительного числа с переопределением
     * @param a Число, из которого извлекаетя корень
     * @return Результат вычисления
     */
    public double Aradical (double a){
        a = Math.sqrt(a);
        return a;
    }

}
