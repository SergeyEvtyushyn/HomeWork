package HomeWork2.Sorts;

import java.util.Arrays;

public class SortsUtils {
    public static void main(String[] args) {
        int[] arr = {4, 3, 5, 1, 2};

        int[] bubble = bubble(arr);

    }


    public static int[] bubble(int[] arr){
        int x;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j+1]){
                    x = arr[j];
                    arr[j] = arr[j+1];
                   arr[j+1] = x;
                }

            }

        }
        System.out.print(Arrays.toString(arr) + " ");
        return arr;
    }

}
