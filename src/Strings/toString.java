package Strings;

import java.sql.Struct;
import java.util.Scanner;

public class toString {
    private static final String[] digits = {"", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
    private static final String[] numbers11to19 = {"", "одинадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
    private static final String[] decimals = {"", "десять", "двадцать", "тридцать", "сорок'", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто" };
    private static final String[] thousands = {"", "сто", "двести", "триста'", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот" };
    private static final String[] mills = {"миллиона", "миллионов" };
    private static final int maxvalue = 999_999_999;
    private static final int minvalue = -999_999_999;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое числов диапазоне от " + minvalue + " до " + maxvalue);

        boolean choice = true;
        int number = 0;
        while (choice) {
            number = sc.nextInt();
            if (number > maxvalue || number < minvalue) {
                System.out.println("Введено неверное число. Попробуйте еще раз.");
            } else {
                choice = false;
            }
        }

        System.out.println(toString(number));
    }

    public static String toString (int number){ // Затычка. Незаконченный метод
        String s = Integer.toString(number);
        return s;
    }
}
