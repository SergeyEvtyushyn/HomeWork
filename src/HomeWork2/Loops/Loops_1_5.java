package HomeWork2.Loops;

public class Loops_1_5 {
    public static void main(String[] args) { // Столько строк,если делать с форматированием как в таблице. Без форматирования 2 for достаточно.

        int i = 2;
        int j = 1;
        System.out.println(i + " x  " + j + " = " + i * j + "   " + (i + 1) + " x  " + j + " = " + (i + 1) * j + "   " + (i + 2) + " x  " + j + " = " + (i + 2) * j + "   "+ (i + 3) + " x  " + j + " = " + (i + 3) * j);

        i = 2;
        j = 2;
        System.out.println(i + " x  " + j + " = " + i * j + "   " + (i + 1) + " x  " + j + " = " + (i + 1) * j + "   " + (i + 2) + " x  " + j + " = " + (i + 2) * j + "   "+ (i + 3) + " x  " + j + " = " + (i + 3) * j);

        i = 2;
        j = 3;
        System.out.println(i + " x  " + j + " = " + i * j + "   " + (i + 1) + " x  " + j + " = " + (i + 1) * j + "   " + (i + 2) + " x  " + j + " = " + (i + 2) * j + "  "+ (i + 3) + " x  " + j + " = " + (i + 3) * j);

        i = 2;
        j = 4;
        System.out.println(i + " x  " + j + " = " + i * j + "   " + (i + 1) + " x  " + j + " = " + (i + 1) * j + "  " + (i + 2) + " x  " + j + " = " + (i + 2) * j + "  "+ (i + 3) + " x  " + j + " = " + (i + 3) * j);


        for (j = 5; j < 10; j++){
            System.out.println(i + " x  " + j + " = " + i * j + "  " + (i + 1) + " x  " + j + " = " + (i + 1) * j + "  " + (i + 2) + " x  " + j + " = " + (i + 2) * j + "  "+ (i + 3) + " x  " + j + " = " + (i + 3) * j);
        }
        for (j = 10; j <= 10; j++){
            System.out.println(i + " x " + j + " = " + i * j + "  " + (i + 1) + " x " + j + " = " + (i + 1) * j + "  " + (i + 2) + " x " + j + " = " + (i + 2) * j + "  "+ (i + 3) + " x " + j + " = " + (i + 3) * j);
        }
        System.out.println();
            i = 6;
        for (j = 1; j <=1; j++){
            System.out.println(i + " x  " + j + " =  " + i * j + "  " + (i + 1) + " x  " + j + " = " + (i + 1) * j + "   " + (i + 2) + " x  " + j + " = " + (i + 2) * j + "   "+ (i + 3) + " x  " + j + " = " + (i + 3) * j);
        }
        for (j = 2; j <10; j++){
            System.out.println(i + " x  " + j + " = " + i * j + "  " + (i + 1) + " x  " + j + " = " + (i + 1) * j + "  " + (i + 2) + " x  " + j + " = " + (i + 2) * j + "  "+ (i + 3) + " x  " + j + " = " + (i + 3) * j);
        }
        for (j = 10; j <=10; j++){
            System.out.println(i + " x " + j + " = " + i * j + "  " + (i + 1) + " x " + j + " = " + (i + 1) * j + "  " + (i + 2) + " x " + j + " = " + (i + 2) * j + "  "+ (i + 3) + " x " + j + " = " + (i + 3) * j);
        }
    }
}
