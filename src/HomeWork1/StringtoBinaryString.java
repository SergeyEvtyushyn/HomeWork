package HomeWork1;

import java.util.Arrays;
import java.util.Scanner;

public class StringtoBinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        byte a = sc.nextByte();

        String s = toBinaryString(a);
        System.out.println(s);
    }

    public static String toBinaryString (byte number) {
        byte[] arr = new byte[8];

        byte number1;
        if (number >= 0) {
           number1 = number;
        } else {
           number1 = (byte) (-1 * number);
        }

            for (int i = 0; i < 8; i++) {
                if (number1 % 2 == 1) {
                    arr[i] = 1;
                    number1 = (byte) (number1 / 2);
                } else {
                    arr[i] = 0;
                    number1 = (byte) (number1 / 2);
                }
            }
                byte tmp = 0 ;
                    for (int i1 = 0; i1 < arr.length /2 ; i1++) {
                        tmp = arr[arr.length - i1 - 1 ];
                        arr[arr.length - i1 - 1 ]= arr[i1];
                        arr[i1] = tmp;

                }

            if (number < 0) {
                for (int i = 0; i < arr.length; i++) {
                    if ( arr[i] == 0){
                        arr[i] = 1;
                    } else {
                        arr[i] = 0;
                    }

                }

                if (arr[arr.length - 1] == 0){
                    arr[arr.length - 1] = 1;
                } else {
                    arr[arr.length - 1] = 0;
                    boolean flag = true;
                    for (int j = arr.length - 2; j >= 0; j--) {
                        if (flag){
                            if (arr[j] == 1){
                                arr[j] = 0;
                                flag = true;
                            } else {
                                arr[j] = 1;
                                flag = false;
                            }
                        }
                    }
                }
//                System.out.println(Arrays.toString(arr));
                StringBuilder s1 = new StringBuilder();
                for (int i = 0; i < arr.length; i++) {
                    s1.append(arr[i]);
                }
                return s1.toString();

            } else {
                StringBuilder s1 = new StringBuilder();
                for (int i = 0; i < arr.length; i++) {
                    s1.append(arr[i]);
                }
                return s1.toString();
            }

        }

}

