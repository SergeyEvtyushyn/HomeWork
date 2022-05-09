package HomeWork5;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class bookRead {

    public static void main(String[] args) throws IOException {

        // Создание объекта файла с указанием абсолютного пути к файлу
        File file = new File("C:\\Java\\JC1\\Md-JC1\\HomeWork\\src\\HomeWork5\\Война и мир_книга.txt");
//        File file = new File("C:\\Java\\JC1\\Md-JC1\\HomeWork\\src\\HomeWork5\\Test.txt"); // Для тестирования
//        File file = new File("C:\\Java\\JC1\\Md-JC1\\HomeWork\\src\\HomeWork5\\Test1.txt"); // Для тестирования

        // Создание объекта для чтения файла с обработкой исключения, если файл не найдет в указанном месте
        BufferedReader wptxt  = null;
        try {
            wptxt = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            System.out.println("Указанный файл не найден.");
        }

        // Создание строки из прочитанного текста в файле.
        StringBuilder alltext = new StringBuilder();
        int txtIn = wptxt.read();
        while ( txtIn != -1) {
           alltext.append((char)txtIn);
//            System.out.print((char)txtIn);
            txtIn = wptxt.read();
        }
        String s = alltext.toString();
        String[] s2 = s.split("[ .,!?:;]+");

        // Помещение слов из текста в коллекцию Set и обработка ее.Задание 2.1
        HashSet<String> wpset = new HashSet<String>();
            wpset.addAll(List.of(s2));
       for (String elem : wpset){
           System.out.print(" " + elem);
       }

       System.out.println();
       System.out.println("Количество уникальных слов в тексте: " + wpset.size());


        wptxt.close(); // Закрытие ранее открытого файла
    }
}
