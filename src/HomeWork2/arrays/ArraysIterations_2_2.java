package HomeWork2.arrays;

import static HomeWork2.arrays.ArraysUtils_2_1.arrayFromConsole;

public class ArraysIterations_2_2 {
    public static void main(String[] args) {
        int[] container = arrayFromConsole();
        System.out.println();
        int[] arrayPrint = arrayPrint(container);
        System.out.println();
        int[] evrysecond = evrysecond(container);
        System.out.println();
        int[] arrayPrintRevers = arrayPrintRevers(container);

    }

    public static int[] arrayPrint(int[] arr) {
        int m = arr.length;

        System.out.print("Введенный массив(do...while): ");
        int i = 0;
        do {
            System.out.print(arr[i] + " ");
            i++;
        } while (i < m);
        System.out.println();

        System.out.print("Введенный массив(while): ");
        int i1 = 0;
        while (i1 < m) {
            System.out.print(arr[i1] + " ");
            i1++;
        }
        System.out.println();

        System.out.print("Введенный массив(for): ");
        for (int j = 0; j < m; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();

        System.out.print("Введенный массив(for ich): ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        return arr;
    }


    public static int[] evrysecond(int[] arr) {
        int m = arr.length;

        System.out.print("Каждый второй элемент (do...while): ");
        int i = 1;
        do {
            System.out.print(arr[i] + " ");
            i = i + 2;
        } while (i < m);
        System.out.println();

        System.out.print("Каждый второй элемент (while): ");
        int i1 = 1;
        while (i1 < m) {
            System.out.print(arr[i1] + " ");
            i1 = i1 + 2;
        }
        System.out.println();

        System.out.print("Каждый второй элемент (for): ");
        for (int j = 1; j < m; j =j + 2) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();

        return arr;
    }

    public static int[] arrayPrintRevers(int[] arr) {
        int m = arr.length;
        //int[] arr1 = new int[m];

        System.out.print("Массив в обратном порядке (do...while): ");
        int i = arr.length - 1;
        do {
            System.out.print(arr[i] + " ");
            i--;
        } while (i >= 0);
        System.out.println();

        System.out.print("Массив в обратном порядке (while): ");
        int i1 = arr.length - 1;
        while (i1 >= 0) {
            System.out.print(arr[i1] + " ");
            i1--;
        }
        System.out.println();

        System.out.print("Массив в обратном порядке (for): ");
        for (int j = arr.length - 1; j >= 0; j--) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();

        //System.out.print("Массив в обратном порядке (for ich): ");
        //for (int element : arr) {
        //   System.out.print(element + " ");
        //}
        return arr;
    }
}
