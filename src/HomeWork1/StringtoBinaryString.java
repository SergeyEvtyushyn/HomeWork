package HomeWork1;

import java.util.Scanner;

public class StringtoBinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int a = sc.nextInt();

        System.out.println(Integer.toBinaryString(a));
    }
}
