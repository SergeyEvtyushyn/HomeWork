package HomeWork3_1.HomeWork3.calcs.additional.calcs;

import HomeWork3_1.HomeWork3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAgregationInterface implements ICalculator {

    long countOperation = 0;
    ICalculator calc;

    public CalculatorWithCounterAutoAgregationInterface(ICalculator calc){
        this.calc = calc;
    }

    @Override
    public double AplusB(double a, double b) {
        ++countOperation;
        return calc.AplusB( a, b );
    }

    @Override
    public double AminusB(double a, double b) {
        ++countOperation;
        return calc.AminusB( a, b );
    }

    @Override
    public double AmultB(double a, double b) {
        ++countOperation;
        return calc.AmultB( a, b);
    }

    @Override
    public double AdivB(double a, double b) {
        ++countOperation;
        return calc.AdivB( a, b);
    }

    @Override
    public double AdivBpow(double a, int exponent) {
        ++countOperation;
        return calc.AdivBpow(a, exponent);
    }

    @Override
    public double abs(double a) {
        ++countOperation;
        return calc.abs(a);
    }

    @Override
    public double radical(double a) {
        ++countOperation;
        return calc.radical(a);
    }

    public long getCountOperation(){
        return countOperation;
    }
}
