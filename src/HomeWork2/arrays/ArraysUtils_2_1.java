package HomeWork2.arrays;

import java.util.Random;
import java.util.Scanner;

public class ArraysUtils_2_1 {
    public static void main(String[] args) {
        int[] container = arrayFromConsole();
        System.out.println();
        int[] container1 = arrayRandom();

    }

    public static int[] arrayFromConsole() { // Метод для ввода массива через консоль. Задание 2.1.1

        Scanner arr = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int n = arr.nextInt();
        System.out.println("Введите массив из " + n + " элементов");

        int[] container = new int[n];

        for(int i = 0; i < n ;i++){
            container[i] = arr.nextInt();
            System.out.print(container[i] + " ");
        }
        return container;
    }

    public static int[] arrayRandom() { // Метод для ввода массива по параметрам через рандом. Задание 2.1.2

        Scanner arr = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int n = arr.nextInt();
        System.out.println("Введите, до какого числа генерируется каждый элемент массива (0-99)");
        int m = arr.nextInt();

        Random rand = new Random();
        int[] container1 = new int[n];

        for(int i = 0; i < n ;i++){
            container1[i] = rand.nextInt(m);
            System.out.print(container1[i] + " ");
        }
        return container1;
    }


}
