package HomeWork5;

import java.io.*;
import java.util.Arrays;


public class ISearchEngineMainWandP implements ISearchEngine {
       public static void main(String[] args) {

        // Создание объекта файла с указанием абсолютного пути к файлу
        File file = new File("C:\\Java\\JC1\\Md-JC1\\HomeWork\\src\\HomeWork5\\Война и мир_книга.txt");

        // Создание объекта для чтения файла с обработкой исключения, если файл не найден в указанном месте
        String[] fileToString = null;
        try (BufferedReader wptxt = new BufferedReader(new FileReader(file))) {
            fileToString = ISearchEngine.fileToString(wptxt);
        } catch (FileNotFoundException e) {
            System.out.println("Указанный файл не найден.");
        } catch (IOException e) {
            System.out.println("Не могу прочитать файл");
        }

        String search1 = "война"; // Слово, для которого ищем количество повторений в тексте
        String search2 = "и"; // Слово, для которого ищем количество повторений в тексте
        String search3 = "мир"; // Слово, для которого ищем количество повторений в тексте

        // Поиск и вывод количества слов "война" "и" "мир" в книге Война и мир. Задание 5.1.

           ISearchEngine number = new ISearchEngine() {
             @Override
             public long search(String text, String word) {
                   return ISearchEngine.super.search(text, word);
             }
        };

        System.out.println("Поиск слов при помощи метода search");
        System.out.println("-----------------------------------");
        try {
            System.out.println("Слово \"" + search1 + "\" встречается в тексте " + file.getName() + " " + number.search(Arrays.toString(fileToString), search1) + " раз.");
            System.out.println("Слово \"" + search2 + "\" встречается в тексте " + file.getName() + " " + number.search(Arrays.toString(fileToString), search2) + " раз.");
            System.out.println("Слово \"" + search3 + "\" встречается в тексте " + file.getName() + " " + number.search(Arrays.toString(fileToString), search3) + " раз.");
        } catch (NullPointerException e) {
            System.out.println("Cлово \"" + search1 + "\" не найдено в тексте " + file.getName());
            System.out.println("Cлово \"" + search2 + "\" не найдено в тексте " + file.getName());
            System.out.println("Cлово \"" + search3 + "\" не найдено в тексте " + file.getName());
        }

        ISearchEngine number1 = new EasySearch();

        System.out.println();
        System.out.println("Поиск слов при помощи метода EasySearch");
        System.out.println("-----------------------------------");
        try {
            System.out.println("Слово \"" + search1 + "\" встречается в тексте " + file.getName() + " " + number1.search(Arrays.toString(fileToString), search1) + " раз.");
            System.out.println("Слово \"" + search2 + "\" встречается в тексте " + file.getName() + " " + number1.search(Arrays.toString(fileToString), search2) + " раз.");
            System.out.println("Слово \"" + search3 + "\" встречается в тексте " + file.getName() + " " + number1.search(Arrays.toString(fileToString), search3) + " раз.");
        } catch (NullPointerException e) {
            System.out.println("Cлово \"" + search1 + "\" не найдено в тексте " + file.getName());
            System.out.println("Cлово \"" + search2 + "\" не найдено в тексте " + file.getName());
            System.out.println("Cлово \"" + search3 + "\" не найдено в тексте " + file.getName());
        }

    }
}
