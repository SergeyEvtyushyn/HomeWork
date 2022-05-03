package HomeWork2.test;

import HomeWork2.Sorts.SortsUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortsUtilsTest {

    int[] arr1 = {1, 2, 3, 4, 5, 6};
    int[] arr2 = {1, 1, 1, 1};

    int[] arr3 = {};

    int[] arr4 = {6, 5, 4, 3, 2, 1};

    int[] arr5 = {89, 88, 85, 86, 87};


    @Test
    public void shakeTest(){

        SortsUtils sort = new SortsUtils();
        int[] arrexp = {6, 5, 4, 3, 2, 1};
        Assertions.assertArrayEquals(arrexp, sort.shake(arr1));


    }

    @Test
    public void bubbleTest(){

        SortsUtils sort = new SortsUtils();
        int[] arrexp = {1, 2, 3, 4, 5, 6};
        Assertions.assertArrayEquals(arrexp, sort.bubble(arr4));


    }

    @Test
    public void bubbleNullTest(){

        SortsUtils sort = new SortsUtils();
        int[] arrexp = {};
        Assertions.assertArrayEquals(arrexp, sort.bubble(arr3));


    }

    @Test
    public void shakeTest1(){

        SortsUtils sort = new SortsUtils();
        int[] arrexp = {89, 88, 87, 86, 85};;
        Assertions.assertArrayEquals(arrexp, sort.shake(arr5));


    }
}
