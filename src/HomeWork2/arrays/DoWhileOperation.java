package HomeWork2.arrays;

public class DoWhileOperation implements IArraysOperation{

    public int[] arrayPrint(int[] arr) { // Перебор массива

        int m = arr.length;

        System.out.print("Введенный массив(do...while): ");
        int i = 0;
        do {
            System.out.print(arr[i] + " ");
            i++;
        } while (i < m);
        System.out.println();
        return arr;
    }

    public int[] evrysecond(int[] arr) { // Вывод каждого второго элемента массива.
        int m = arr.length;
        int[] arr1 = new int[m / 2];
        System.out.print("Каждый второй элемент (do...while): ");
        int i = 1;
        int j = 0;
        do {
            System.out.print(arr[i] + " ");
            arr1[j] = arr[i];
            j++;
            i = i + 2;
        } while (i < m);
        System.out.println();
    return arr1;
    }

    public int[] arrayPrintRevers(int[] arr) { // Вывод элементов массива в обратном порядке.
        int m = arr.length;
        int[] arr1 = new int[m];
        System.out.print("Массив в обратном порядке (do...while): ");
        int i = arr.length - 1;
        int j = 0;
        do {
            System.out.print(arr[i] + " ");
            arr1[j] = arr[i];
            j++;
            i--;
        } while (i >= 0);
        System.out.println();

        return arr1;

    }
}
