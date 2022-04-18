package HomeWork3_1.HomeWork3.calcs.additional.calcs;

public class CalculatorWithCounterAutoComposite {

    CalculatorWithCounterAutoSuper calc = new CalculatorWithCounterAutoSuper();

    long countOperation;

    /**
     * Метод сложения двух чисел с вызовом из материнского класса со счетчиком операций
     * @param a Первое число
     * @param b Второе число
     * @return Сумма двух чисел
     */
    public double AplusB(double a, double b){
        ++countOperation;
        return calc.AplusB( a, b );
    }

    /**
     * Метод вычетания двух чисел с вызовом из материнского класса со счетчиком операций
     * @param a Первое число
     * @param b Второе число
     * @return Разность двух чисел
     */
    public double AminusB(double a, double b){
        ++countOperation;
        return calc.AminusB( a, b );
    }

    /**
     * Метод умножения двух чисел с вызовом из материнского класса со счетчиком операций
     * @param a Первое число
     * @param b Второе число
     * @return Умножение двух чисел
     */
    public double AmultB(double a, double b){
        ++countOperation;
        return calc.AmultB( a, b );
    }

    /**
     * Метод деления двух чисел с вызовом из материнского класса со счетчиком операций
     * @param a делимое
     * @param b делитель
     * @return Результат деления
     */
    public double AdivB(double a, double b){
        ++countOperation;
        return calc.AdivB( a, b );
    }

    /**
     * Метод возведения в целую степень чисела с вызовом из материнского класса со счетчиком операций
     * @param a Числитель дробного числа
     * @param exponent Степень возведения
     * @return Рузультат возведения в степень
     */
    public double AdivBpow (double a, int exponent){
        ++countOperation;
        return calc.AdivBpow(a, exponent);
    }

    /**
     * Метод определения модуля числа с вызовом из материнского класса со счетчиком операций
     * @param a Число
     * @return Модуль числа
     */
    public double ABabs (double a){
        ++countOperation;
        return calc.abs (a);
    }

    /**
     * Метод вычисления квадратного корня из положительного числа со счетчиком операций
     * @param a Число, из которого извлекаетя корень
     * @return Корень из числа
     */
    public double Aradical (double a){
        ++countOperation;
        return calc.radical (a);
    }

    /**
     * Метод возврата количесвта операций
     * @return Количество математических операций
     */
    public long getCountOperation(){
        return countOperation;
    }

}
