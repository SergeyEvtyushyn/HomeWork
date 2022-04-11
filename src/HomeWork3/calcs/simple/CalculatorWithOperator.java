package HomeWork3.calcs.simple;

public class CalculatorWithOperator {
        int a;
        int b;

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public int AplusB(int a, int b){
        return a + b;
    }

    public int AminusB(int a, int b){
        return a - b;
    }

    public int AmultB(int a, int b){
        return a * b;
    }

    public double AdivB(int a, double b){
        return a / b;
    }

    public double AdivBpow2 (int a, double b){
        double x = a / b;
        if (x < 0){
            x *= - 1;
        }
        return x * x;
    }

    public double ABabs (int a, double b){
        double x = a / b;
        if (x < 0){
            x *= - 1;
        }
        return x;
    }



    public double[] ABradical (int a, int b){

        if (a < 0){
            a *= - 1;
        }
        if (b < 0){
            b *= - 1;
        }
        double x = a;
        double y = b;

        for (int i = 0; i < 100; i++) {
            x = ( x + a/x) / 2;
            y = ( y + b/y) / 2;

        }

       return new double[] {x, y};

    }

}
