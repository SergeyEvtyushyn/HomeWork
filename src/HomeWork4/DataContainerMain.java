package HomeWork4;

import java.util.Arrays;
import java.util.Scanner;


public class DataContainerMain {
    public static void main(String[] args) {
        DataContainer<String> container = new DataContainer<>(new String[0]);

        int l1 = container.addData("Привет");
        int l2 = container.addData("Как дела?");
        int l3 = container.addData("Работаю");
        int l4 = container.addData("Давай потом");
        int l5 = container.addData(null);

        System.out.println(Arrays.toString(container.getData()));

        System.out.println(container.toString());

        String text1 = container.get(l1);
        String text2 = container.get(l2);
        String text3 = container.get(l3);
        String text4 = container.get(l4);

        System.out.println(text1);
        System.out.println(text2);
        System.out.println(text3);
        System.out.println(text4);


        int l6 = container.addData("Поговорим");


        System.out.println(Arrays.toString(container.getData()));

        container.get(4);

        container.delete(2);

        container.delete(text1);
        container.delete("Поговорим1");







    }
}
