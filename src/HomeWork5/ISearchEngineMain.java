package HomeWork5;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;


public class ISearchEngineMain implements ISearchEngine {
       public static void main(String[] args) {

        // Создание объекта файла с указанием абсолютного пути к файлу
        File file = new File("C:\\Java\\JC1\\Md-JC1\\HomeWork\\src\\HomeWork5\\Война и мир_книга.txt");
//        File file = new File("C:\\Java\\JC1\\Md-JC1\\HomeWork\\src\\HomeWork5\\Test.txt"); // Для тестирования
//        File file = new File("C:\\Java\\JC1\\Md-JC1\\HomeWork\\src\\HomeWork5\\Test1.txt"); // Для тестирования

        // Создание объекта для чтения файла с обработкой исключения, если файл не найден в указанном месте
        String[] fileToString = null;
        try (BufferedReader wptxt = new BufferedReader(new FileReader(file))) {
            fileToString = ISearchEngine.fileToString(wptxt);
        } catch (FileNotFoundException e) {
            System.out.println("Указанный файл не найден.");
        } catch (IOException e) {
            System.out.println("Не могу прочитать файл");
        }

        String search = "привет"; // Слово, для которого ищем количество повторений в тексте

        ISearchEngine number = new ISearchEngine() {
             @Override
             public long search(String text, String word) {
                   return ISearchEngine.super.search(text, word);
             }
        };

        // Поиск и вывод количества встречающихсяслов в тексте с исключением для NullPointerException. Задание 3.
        try {
            System.out.println("Слово \"" + search + "\" встречается в тексте " + file.getName() + " " + number.search(Arrays.toString(fileToString), search) + " раз.");
        } catch (NullPointerException e) {
            System.out.println("Cлово \"" + search + "\" не найдено в тексте " + file.getName());
            return;
        }

    }
}
