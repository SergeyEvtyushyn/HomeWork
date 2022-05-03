package HomeWork2.test;

import HomeWork2.arrays.Arrays_2_4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Arrays_2_4Test {

    int[] arr = {1, 3, 6, 2, 8};

    @Test
    public void sumChetTest () {

        Arrays_2_4 count = new Arrays_2_4();

        Assertions.assertEquals(16, count.sumChet(arr));
    }

    @Test
    public void MaxChetITest () {

        Arrays_2_4 count = new Arrays_2_4();

        Assertions.assertEquals(8, count.MaxChetI(arr));
    }

    @Test
    public void LessArefTest () {

        Arrays_2_4 count = new Arrays_2_4();
        int[] arrexp = {1, 3, 2};
        Assertions.assertArrayEquals( arrexp, Arrays_2_4.LessAref(arr));
    }

    @Test
    public void Min2Test () {

        Arrays_2_4 count = new Arrays_2_4();
        int[] arrexp = {1, 2};
        Assertions.assertArrayEquals( arrexp, Arrays_2_4.Min2(arr));
    }

    @Test
    public void sumofdigTest () {

        Arrays_2_4 count = new Arrays_2_4();

        int[] arr1 = {1, 2, 25, 16};

        Assertions.assertEquals(17,Arrays_2_4.sumofdig(arr1));

    }

}
