package HomeWork1;

public class Operators2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 8;


        // 2.1
        double d = a + b / (float) c; // Ответ 5,25. Сначала деление, после прибавление. Без приведения делителя ответ целочисленный и неточный.
        System.out.println(d);


        // 2.2
        float d1 = (a + b) / (float) c; // Ответ 0,875. Сначала прибавление, после деление, т.к. сначала вычиляется выражение в скобаках. Без приведения делителя ответ целочисленный и неточный.
        System.out.println(d1);

        // 2.3
        int d2 = (a + ++b) / c; //Ответ 1. Сначала прибавление, после деление, т.к. сначала вычиляется выражение в скобаках. Значение в скобках 5+3=8.
        System.out.println(d2);

        //2.4
        a = 5;
        b = 2;
        c = 8;
        float d3 = (a + ++b) / (float) --c; //Ответ 1,1428572. Сначала прибавление, после деление, т.к. сначала вычиляется выражение в скобаках. Значение в скобках 5+3=8. Делитель равен 7. 8/7=1,1428572
        System.out.println(d3);

        //2.5
        a = 5;
        b = 2;
        c = 8;
        float d4 = (a * b >> ++b) / (float)--c; // Ответ 0,14285715. Сначала умножение, потом сдвиг, далее деление. 1/7=0,14285715. Без приведения делителя ответ целочисленный и неточный.
        System.out.println(d4);

        //2.6
        int a6 = 5;
        int b6 = 7;
        int c6 = 20;
        int d6 = 68;
        int e6 = 22;
        int f6 = 2;
        int g6 = 8;
        float j6 = (a6 + b6 > c6 ? d6 : e6 * f6 >> ++f6) / (float) --g6; // Ответ 0,71428573. Условие в скобках false. К расчету принимается 22*2>>3=5. 5/7=0,71428573 Без приведения делителя ответ целочисленный и неточный.
        System.out.println(j6);


        //2.7 Не выполнимо, т.к. для тернарного оператора не может быть присваиваемого значения отличного от числа. В данном случае новое условие итогом которого являтся тип boolean.
        int a7 = 5;
        int b7 = 7;
        int c7 = 20;
        int d7 = 68;
        int e7 = 22;
        int f7 = 2;
        int g7 = 8;

        //float j7 = (a7 + b7 > c7 ? d7 >= d7 : e7 * f7 >> ++f7) / (float) --g7;

        //System.out.println(j7);


        //2.8
        boolean a8 = 6 - 2 > 3;
        boolean b8 = 12 * 12 <= 119;
        boolean c8 = a8 && b8;
        System.out.println(c8);

        //2.9
        boolean a9 = true;
        boolean b9 = false;
        boolean c9 = a9 && b9;
        System.out.println(c9);

    }
}
