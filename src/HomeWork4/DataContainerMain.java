package HomeWork4;

import java.util.Arrays;
import java.util.Scanner;


public class DataContainerMain {
    public static void main(String[] args) {
        DataContainer<String> container = new DataContainer<>(new String[0]);

        container.addData("Привет");
        container.addData("Как дела?");
        container.addData("Работаю");
        container.addData("Давай потом");
        container.addData(null);

        System.out.println(Arrays.toString(container.getData()));
        container.get(3);

        container.addData("Поговорим");
        System.out.println(Arrays.toString(container.getData()));
        container.get(4);

        container.delete(3);

        container.deleteeq("Привет");

    }
}
