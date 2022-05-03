package HomeWork2.arrays;

import java.util.Arrays;

public class ArraysIterationsInterface_2_3 {
    public static void main(String[] args) {

        int[] arr = {1, 3, 8, 10, 35};

        IArraysOperation arr1 = new DoWhileOperation();
        IArraysOperation arr2 = new WhileOperation();
        IArraysOperation arr3 = new WhileOperation();
        IArraysOperation arr4 = new WhileOperation();

        arr1.arrayPrint(arr);
        arr1.arrayPrintRevers(arr);
        arr1.evrysecond(arr);
        System.out.println();

        arr2.arrayPrint(arr);
        arr2.arrayPrintRevers(arr);
        arr2.evrysecond(arr);
        System.out.println();

        arr3.arrayPrint(arr);
        arr3.arrayPrintRevers(arr);
        arr3.evrysecond(arr);
        System.out.println();

        arr4.arrayPrint(arr);



    }
}
