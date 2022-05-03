package HomeWork2.test;

import HomeWork2.arrays.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArraysIterationsInterface_2_3Test {

    int[] arr = {5, 2, 6, 4, 1};
    int[] arrexp = {5, 2, 6, 4, 1};
    int[] arrexpevrysecond = {2, 4};
    int[] arrexpRevers = {1, 4, 6, 2, 5};

    @Test
    public void DoWhileOperationTest(){

        IArraysOperation arr1 = new DoWhileOperation();

        Assertions.assertArrayEquals(arrexp, arr1.arrayPrint(arr));
    }

    @Test
    public void DoWhileOperationevrysecondTest(){

        IArraysOperation arr1 = new DoWhileOperation();

        Assertions.assertArrayEquals(arrexpevrysecond, arr1.evrysecond(arr));
    }

    @Test
    public void DoWhileOperationPrintReversTest(){

        IArraysOperation arr1 = new DoWhileOperation();

        Assertions.assertArrayEquals(arrexpRevers, arr1.arrayPrintRevers(arr));
    }

    @Test
    public void ForOperationTest(){

        IArraysOperation arr1 = new ForOperation();

        Assertions.assertArrayEquals(arrexp, arr1.arrayPrint(arr));
    }

    @Test
    public void ForOperationevrysecondTest(){

        IArraysOperation arr1 = new ForOperation();

        Assertions.assertArrayEquals(arrexpevrysecond, arr1.evrysecond(arr));
    }

    @Test
    public void ForOperationPrintReversTest(){

        IArraysOperation arr1 = new ForOperation();

        Assertions.assertArrayEquals(arrexpRevers, arr1.arrayPrintRevers(arr));
    }

    @Test
    public void ForEachOperationTest(){

        IArraysOperation arr1 = new ForEachOperation() {
            @Override
            public int[] evrysecond(int[] arr) {
                return new int[0];
            }

            @Override
            public int[] arrayPrintRevers(int[] arr) {
                return new int[0];
            }
        };

        Assertions.assertArrayEquals(arrexp, arr1.arrayPrint(arr));
    }


    @Test
    public void WhileOperationTest(){

        IArraysOperation arr1 = new WhileOperation();

        Assertions.assertArrayEquals(arrexp, arr1.arrayPrint(arr));
    }

    @Test
    public void WhileOperationevrysecondTest(){

        IArraysOperation arr1 = new WhileOperation();

        Assertions.assertArrayEquals(arrexpevrysecond, arr1.evrysecond(arr));
    }

    @Test
    public void WhileOperationPrintReversTest() {

        IArraysOperation arr1 = new WhileOperation();

        Assertions.assertArrayEquals(arrexpRevers, arr1.arrayPrintRevers(arr));
    }
}
