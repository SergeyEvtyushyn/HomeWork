package HomeWork2.arrays;

public class WhileOperation implements IArraysOperation{

    public int[] arrayPrint(int[] arr) { // Перебор массива

        int m = arr.length;

        System.out.print("Введенный массив(while): ");
        int i1 = 0;
        while (i1 < m) {
            System.out.print(arr[i1] + " ");
            i1++;
        }
        System.out.println();
        return arr;
    }

    public int[] evrysecond(int[] arr) { // Вывод каждого второго элемента массива.
        int m = arr.length;
        int[] arr1 = new int[m / 2];
        int i = 0;
        System.out.print("Каждый второй элемент (while): ");
        int i1 = 1;
        while ( i1 < m ) {
            System.out.print(arr[i1] + " ");
            arr1[i] = arr[i1];
            i1 = i1 + 2;
            i++;
        }
        System.out.println();
    return arr1;
    }

    public int[] arrayPrintRevers(int[] arr) { // Вывод элементов массива в обратном порядке.
        int m = arr.length;
        int[] arr1 = new int[m];
        int i = 0;
        System.out.print("Массив в обратном порядке (while): ");
        int i1 = arr.length - 1;
        while (i1 >= 0) {
            System.out.print(arr[i1] + " ");
            arr1[i] = arr[i1];
            i1--;
            i++;
        }
        System.out.println();

        return arr1;

    }
}
