package HomeWork2.arrays;

import java.util.Scanner;

import static HomeWork2.arrays.ArraysUtils_2_1.arrayRandom;

public class Arrays_2_4 {
    public static void main(String[] args) {
        int[] container1 = arrayRandom();
        System.out.println();
        int sumChet = sumChet(container1);
        System.out.println();
        int MaxChetI = MaxChetI(container1);
        System.out.println();
        int[] LessAref = LessAref(container1);
        System.out.println();
        int[] Min2 = Min2(container1);
        System.out.println();
        int[] DelInt = DelInt(container1);
        System.out.println();

        int[] container2 = arrayRandom();
        System.out.println();
        int sumofdig = sumofdig(container2);
        System.out.println();
    }
    public static int sumChet(int[] arr) {
        int m = arr.length;
        int sum = 0;
        for (int i = 0; i < m; i++) {
            boolean a = arr[i] >= 0;
            boolean b = arr[i] % 2 == 0;
            if ( a && b ){
                sum = sum + arr[i];
            }

        }
        System.out.println("Сумма четных положительных: " + sum);
        return sum;
    }

    public static int MaxChetI(int[] arr) {
        int m = arr.length;
        int MaxChetI = arr[0];
        for (int i = 0; i < m; i = i + 2) {
            if ( arr[i] >= MaxChetI ){
                MaxChetI = arr[i];
            }
        }
        System.out.println("Максимальный элемент с четным индексом: " + MaxChetI);
        return MaxChetI;
    }

    public static int[] LessAref(int[] arr) {
        int m = arr.length;
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum = sum + arr[i];

        }
        int sumAref = sum / m;
        System.out.print("Элементы меньше среднего арифметического: ");
        for (int i = 0; i < m; i++) {
            if ( arr[i] < sumAref ){

                System.out.print(arr[i] + " ");
            }

        }
        return arr;
    }

    public static int[] Min2(int[] arr) {
        int m = arr.length;
        int Min1 = arr[0];

        for (int i = 0; i < m; i++) {
            if ( arr[i] < Min1 ){
                Min1 = arr[i];
            }
        }
        System.out.print("Первое минимальное число: " + Min1 + ". ");

        int Min2 = arr[0];
        for (int i = 0; i < m; i++) {
            if (arr[i] < Min2 && arr[i] > Min1){
                Min2 = arr[i];
            }
        }
        System.out.print("Второе минимальное число: " + Min2);
        return arr;
    }

    public static int[] DelInt(int[] arr) { // Не доделано еще.
        int m = arr.length;
        Scanner ab = new Scanner(System.in);
        System.out.println("Введите нижнюю границу интервала");
        int a = ab.nextInt();
        System.out.println("Введите верхнюю границу интервала");
        int b = ab.nextInt();


        for (int i = 0; i < m; i++) {

                if (arr[i] >= a && arr[i] <= b) {
                    while ( i  < m - 1) {
                    arr[i] = arr[i++];
                    i++;

                    }
                    arr[ m - 1 ] = 0;
                }

        }
        System.out.print("Сжатый массив: ");
        for (int i = 0; i < m; i++) {
            System.out.print(arr[i] + " ");
        }
        return arr;
    }



    public static int sumofdig(int[] arr) {
        int m = arr.length;
        int sum = 0;
        for (int i = 0; i < m; i++) {
            int a = arr[i] % 10;
            int b = (arr[i] - a)/10;
            System.out.print(a+" "  + b + " ");

            sum = sum + a + b;
        }
        System.out.println("Сумма всех цифр массива: " + sum);
        return sum;
    }

}
