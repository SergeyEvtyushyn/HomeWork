package HomeWork2.arrays;

public abstract class ForEachOperation implements IArraysOperation{

    public int[] arrayPrint(int[] arr) { // Перебор массива

        int m = arr.length;

        System.out.print("Введенный массив(for ich): ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        return arr;

    }
}
