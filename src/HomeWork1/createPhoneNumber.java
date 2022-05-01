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

        String c = createPhoneNumber_(array);
        System.out.println(c);
    }

    public static String createPhoneNumber_(int[] array){
        StringBuilder s = new StringBuilder("Phone number: (");

        for (int i = 0; i < 3; i++)
        {
            s.append(Integer.toString(array[i]));
        }
        s.append(") ");
        for (int i = 3; i < 6; i++)
        {
            s.append(Integer.toString(array[i]));
        }
        s.append("-");
        for (int i = 6; i <10; i++)
        {
            s.append(Integer.toString(array[i]));
        }
        return s.toString();
    }

}
