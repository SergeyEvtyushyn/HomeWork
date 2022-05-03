package HomeWork2.arrays;

public class ForOperation implements IArraysOperation{

    public int[] arrayPrint(int[] arr) { // Перебор массива
        int m = arr.length;

        System.out.print("Введенный массив(for): ");
        for (int j = 0; j < m; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
        return arr;
    }

    public int[] evrysecond(int[] arr) { // Вывод каждого второго элемента массива.
        int m = arr.length;
        int[] arr1 = new int[ m / 2 ];
        int i = 0 ;
        System.out.print("Каждый второй элемент (for): ");
        for (int j = 1; j < m; j = j + 2) {
            System.out.print(arr[j] + " ");
            arr1[i] = arr[j];
            i++;
        }
        System.out.println();

        return arr1;
    }

    public int[] arrayPrintRevers(int[] arr) { // Вывод элементов массива в обратном порядке.
        int m = arr.length;
        int[] arr1 = new int[ m ];
        int i = 0 ;
        System.out.print("Массив в обратном порядке (for): ");
        for (int j = arr.length - 1; j >= 0; j--) {
            System.out.print(arr[j] + " ");
            arr1[i] = arr[j];
            i++;
        }
        System.out.println();

        return arr1;
    }
}
