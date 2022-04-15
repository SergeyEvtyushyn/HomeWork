package HomeWork3.calcs.additional.calcs;

import HomeWork3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {

    long countOperation;

    /**
     * Метод длясчетчика количества операций
     */
    public void incrementCountOperation(){
        countOperation = countOperation + 1;

    }

    /**
     * Метод возврата количесвта операций
     * @return Количество математических операций
     */

    public long getCountOperation(){
        return countOperation;
    }

}
