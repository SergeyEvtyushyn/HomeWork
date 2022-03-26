package HomeWork1;

public class Operators2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 8;


        // 2.1
        double d = a + b / (float) c;
        System.out.println(d);

        // 2.2
        float d1 = (a + b) / (float) c;
        System.out.println(d1);

        // 2.3
        float d2 = (a + ++b) / (float) c;
        System.out.println(d2);

        //2.4
        int b1 = b -= 1;
        float d3 = (a + ++b1) / (float) --c;
        System.out.println(d3);

        //2.5
        int b2 = b -= 1;
        int c1 = c += 1;
        //int e = 2 >> 3;
        //System.out.println(e);
        float d4 = (a * b2 >> ++b2 / --c1);
        System.out.println(d4);

        //2.6
        int a6 = 5;
        int b6 = 7;
        int c6 = 20;
        int d6 = 68;
        int e6 = 22;
        int f6 = 2;
        int g6 = 8;

        boolean h6 = (a6 + b6) > c6;

        int j6 = 0;
        if (h6) {
            j6 = d6 / --g6;
        } else {
            j6 = e6 * f6 >> ++f6 / --g6;
        }
        System.out.println(j6);

        //2.7
        int a7 = 5;
        int b7 = 7;
        int c7 = 20;
        int d7 = 68;
        int e7 = 22;
        int f7 = 2;
        int g7 = 8;

        int j7 = 0;

        boolean h7 = (a7 + b7) > c7;
        boolean i7 = d7 <= 68;

        if (h7) {
            { if (i7);{
                        System.out.println(i7);
                        }
            }
        } else {
            j7 = e7 * f7 >> ++f7 / --g7;
            System.out.println(j7);
        }

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
