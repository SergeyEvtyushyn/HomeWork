package HomeWork3.calcs.additional.calcs;

import HomeWork3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAgregationInterface implements ICalculator {

    long countOperation = 0;
    ICalculator calc;
    double a;
    double b;
    double c;
    double d;
    double e;
    int exponent;


    public CalculatorWithCounterAutoAgregationInterface(ICalculator calc){
        this.calc = calc;
    }



    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getC() {
        return c;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public void setExponent(int exponent) {
        this.exponent = exponent;
    }

    public int getExponent() {
        return exponent;
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
    public double AdivBpow(double a, double b, int exponent) {
        ++countOperation;
        return calc.AdivBpow(a, b, exponent);
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
