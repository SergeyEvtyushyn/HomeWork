package HomeWork5;

import java.io.*;
import java.util.HashSet;
import java.util.List;


public class bookRead {
       public static void main(String[] args) {

        // Создание объекта файла с указанием абсолютного пути к файлу
        File file = new File("C:\\Java\\JC1\\Md-JC1\\HomeWork\\src\\HomeWork5\\Война и мир_книга.txt");
//        File file = new File("C:\\Java\\JC1\\Md-JC1\\HomeWork\\src\\HomeWork5\\Test.txt"); // Для тестирования
//        File file = new File("C:\\Java\\JC1\\Md-JC1\\HomeWork\\src\\HomeWork5\\Test1.txt"); // Для тестирования

        // Создание объекта для чтения файла с обработкой исключения, если файл не найден в указанном месте
        String[] fileToString = null;
        try (BufferedReader wptxt = new BufferedReader(new FileReader(file))) {
            fileToString = fileToString(wptxt);
        } catch (FileNotFoundException e) {
            System.out.println("Указанный файл не найден.");
        } catch (IOException e) {
            System.out.println("Не могу прочитать файл");
        }

        // Помещение слов из текста в коллекцию Set и обработка ее.Задание 2.1
        HashSet<String> wpset = new HashSet<>(List.of(fileToString));

        System.out.println("Файл с текстом: " + file.getName());
        System.out.println("Количество уникальных слов в тексте: " + wpset.size());
    }

    /**
     * Метод обработки файла и помещение текста в строку
     * @param wptxt Чтение из файла с применением BufferedRead
     * @return Массив слов в виде строки
     * @throws IOException проверка исключений в мэйне, в месте вызова метода
     */
    public static String[] fileToString(BufferedReader wptxt) throws IOException {
        StringBuilder alltext = new StringBuilder();
        int txtIn = wptxt.read();
        while ( txtIn != -1) {
            alltext.append((char)txtIn);
            txtIn = wptxt.read();
        }
        return alltext.toString().split("[.,!?:;\\s]+"); // TODO... Проверить на правильность принятия всех условий для слов со знаками
    }
}
