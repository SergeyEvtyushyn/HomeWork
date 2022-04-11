package HomeWork2.Sorts;

import java.util.Arrays;

public class SortsUtils {
    public static void main(String[] args) {
        int[] arr = {4, 3, 5, 1, 2, 6, 8, 9, 7 , 0};

        int[] bubble = bubble(arr);
        System.out.println();
        int[] shake = shake(arr);

    }

    /**
     * Метод пузырьковой сортировки
     * @param arr вводимый параметр из массива целых чисел
     * @return отсортированный массив по возрастанию
     */

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

    /**
     * Метод шэйкер-сортировки
     * @param arr вводимый параметр из массива целых чисел
     * @return отсортированный массив по убыванию
     */
    public static int[] shake(int[] arr){
        int r = arr.length - 1;
        int l = 0;
        int x;
        int flag = 1;
        while (l < r && flag != 0) {
            flag = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                if ( arr[i] < arr[i+1] ){
                    x = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = x;
                    flag = 1;
                }
            }
        r--;
            for (int i = r; i > l ; i--) {
                if ( arr[i - 1] < arr[i]){
                    x = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = x;
                    flag = 1;
                }
            }
        l++;
        }
        System.out.print(Arrays.toString(arr) + " ");
        return arr;
    }
}
