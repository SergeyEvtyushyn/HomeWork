package HomeWork4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class DataContainerMain {
    public static void main(String[] args) {
        DataContainer<String> container = new DataContainer<>(new String[0]);

        int l1 = container.addData("Привет"); //Наполнение массива данных
        int l2 = container.addData("Как дела?"); //Наполнение массива данных
        int l3 = container.addData("Работаю"); //Наполнение массива данных
        int l4 = container.addData("Давай потом"); //Наполнение массива данных
        int l5 = container.addData(null); //Проверка на добавление ячейки null

        System.out.println(Arrays.toString(container.getData())); // Вывод массива через метод Arrays.toString

        System.out.println(container.toString()); // Вывод массива через переопределенный метод .toString c учетом null-позиций

        String text1 = container.get(l1); // Вывод элемента на позиции l1
        String text2 = container.get(l2); // Вывод элемента на позиции l2
        String text4 = container.get(l4); // Вывод элемента на позиции l4
        String text3 = container.get(l3); // Вывод элемента на позиции l3


        System.out.println(text1); // Вывод элемента из переменной text1
        System.out.println(text2); // Вывод элемента из переменной text2
        System.out.println(text3); // Вывод элемента из переменной text3
        System.out.println(text4); // Вывод элемента из переменной text4


        int l6 = container.addData("Поговорим"); // Тестовое добавление нового элемента, с заменой позиции null


        System.out.println(Arrays.toString(container.getData()));

        container.get(4); //Проверка на вывод элемента по номру пощиции

        container.delete(2); // Проверка на удаление по индексу элемента

        container.delete(text1); //Проверка на удаление через переменную
        container.delete("Поговорим1"); //Проверка на удаление через литерал

       container.sort(java.util.Comparator.naturalOrder());

       System.out.println(container.toString()); // Вывод массива после сортировки

    }
}
