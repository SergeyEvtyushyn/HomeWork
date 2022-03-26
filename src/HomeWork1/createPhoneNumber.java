package HomeWork1;

import java.util.Scanner;

public class createPhoneNumber {
    public static void main(String[] args) {

        Scanner arr = new Scanner(System.in);
        System.out.println("Введите 10 цифр через пробел и нажмите Enter");

        int array[] = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = arr.nextInt();
        }

        System.out.println("Номер телефона: (" +array[0]+  +array[1]+ +array[2]+ ") " + array[3]+  +array[4]+ +array[5]+ "-" +array[6]+  +array[7]+ +array[8]+ +array[9]);
    }
}
