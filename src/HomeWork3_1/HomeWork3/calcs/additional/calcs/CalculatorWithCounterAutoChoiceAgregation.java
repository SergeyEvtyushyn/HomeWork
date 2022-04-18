package HomeWork3_1.HomeWork3.calcs.additional.calcs;

import HomeWork3_1.HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3_1.HomeWork3.calcs.simple.CalculatorWithMathExtends;
import HomeWork3_1.HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {

    long countOperation;

    private CalculatorWithOperator calc;

    private CalculatorWithMathCopy calc1;

    private CalculatorWithMathExtends calc2;

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calc){
        this.calc = calc;

    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calc){
        this.calc1 = calc;

    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends calc){
        this.calc2 = calc;

    }


    public double AplusB(double a, double b){
        ++countOperation;
        if ( calc != null ) {
            return calc.AplusB(a, b);
        } else if ( calc1 != null ) {
            return calc1.AplusB(a, b);
        } else {
            return calc2.AplusB(a, b);
        }
    }

    public double AminusB(double a, double b){
        ++countOperation;
        if ( calc != null ) {
            return calc.AminusB(a, b);
        } else if ( calc1 != null ) {
            return calc1.AminusB(a, b);
        } else {
            return calc2.AminusB(a, b);
        }
    }

    public double AmultB(double a, double b){
        ++countOperation;
        if ( calc != null ) {
            return calc.AmultB(a, b);
        } else if ( calc1 != null ) {
            return calc1.AmultB(a, b);
        } else {
            return calc2.AmultB(a, b);
        }
    }

    public double AdivB(double a, double b){
        ++countOperation;
        if ( calc != null ) {
            return calc.AdivB(a, b);
        } else if ( calc1 != null ) {
            return calc1.AdivB(a, b);
        } else {
            return calc2.AdivB(a, b);
        }
    }

    /**
     * Метод возведения числа в целую степень с применением библиотеки MAth
     * @param a Возводимое число
     * @param exponent Степень возведения
     * @return Результат вычисления
     */
    public double AdivBpow(double a, int exponent){
        ++countOperation;
        if ( calc != null ) {
            return calc.AdivBpow( a, exponent );
        } else if ( calc1 != null ) {
            return calc1.AdivBpow( a, exponent );
        } else {
            return calc2.AdivBpow(a, exponent);
        }
    }

    /**
     * Метод вычисления модуля числа с применением библиотеки Math
     * @param a Вводимое значение
     * @return Модуль числа а
     */
    public double abs(double a){
        ++countOperation;
        if ( calc != null ) {
            return calc.abs(a);
        } else if ( calc1 != null ) {
            return calc1.abs(a);
        } else {
            return calc2.abs(a);
        }
    }

    /**
     * Метод вычисления квадратного корня с применением библиотеки Math
     * @param a Вводимое число
     * @return Модуль числа a
     */

    public double radical (double a){
        ++countOperation;
        if ( calc != null ) {
            return calc.radical(a);
        } else if ( calc1 != null ) {
            return calc1.radical(a);
        } else {
            return calc2.radical(a);
        }
    }

    /**
     * Метод возврата количесвта операций
     * @return Количество математических операций
     */
    public long getCountOperation(){
        return countOperation;
    }

}
