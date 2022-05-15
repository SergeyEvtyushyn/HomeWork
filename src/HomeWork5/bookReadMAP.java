package HomeWork5;

import java.io.*;
import java.util.*;


public class bookReadMAP extends bookRead {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Создание объекта файла с указанием абсолютного пути к файлу
        File file = new File("C:\\Java\\JC1\\Md-JC1\\HomeWork\\src\\HomeWork5\\Война и мир_книга.txt");
//        File file = new File("C:\\Java\\JC1\\Md-JC1\\HomeWork\\src\\HomeWork5\\Test.txt"); // Для тестирования
//        File file = new File("C:\\Java\\JC1\\Md-JC1\\HomeWork\\src\\HomeWork5\\Test1.txt"); // Для тестирования

        // Создание объекта для чтения файла с обработкой исключения, если файл не найден в указанном месте
        String[] fileToString = null;
        try (BufferedReader wptxt = new BufferedReader(new FileReader(file))) {
            fileToString = bookRead.fileToString(wptxt);
        } catch (FileNotFoundException e) {
            System.out.println("Указанный файл не найден.");
        } catch (IOException e) {
            System.out.println("Не могу прочитать файл");
        }

        Map<String, Integer> sortedwpputall = sortedwpputall(fileToString);

        System.out.println("Какое количество топ слов выводить?");
        int n = sc.nextInt();
        boolean key1 = false;
        while (key1 == false) {
            if (n > sortedwpputall.size()){
                System.out.println("Количество слов в тексте меньше запрашиваемого. Введите снова.");
                n = sc.nextInt();
            } else {
                key1 = true;
            }
        }

        System.out.println("Файл с текстом: " + file.getName());
        int i = 0;
        // Вывод n-задаваемых значений после сортировки задание. Задание 2.2
        for(Map.Entry<String, Integer> entry : sortedwpputall.entrySet()){
            if ( i == n ){
                break;
            } else {
                String key = entry.getKey();
                int value = entry.getValue();
                System.out.println("Количество повторений слова \"" + key + "\" составляет: " + value + " раз.");
                i++;
            }
        }
    }

    /**
     * Метод наполнения колллекции Мар с сортировкой по значению
     * @param fileToString Массив слов
     * @return Сортированнаяколлекция по знпчению
     */
    public static Map<String, Integer> sortedwpputall(String[] fileToString){
        Map<String, Integer> wpputall = new HashMap<>();

        for (String s1 : fileToString) {
            wpputall.put(s1, 0);
        }

        for (String s1 : fileToString) {
            int value = wpputall.get(s1);
            wpputall.put(s1, value + 1);
        }

        //Сортировка Мар по значению в порядке убывания
        List <Map.Entry<String, Integer>> valuesList = new ArrayList(wpputall.entrySet());
        Collections.sort(valuesList, new Comparator<Map.Entry<String, Integer>>(){

            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        //Содание новой коллекции Мар и сохраннение в ней отсортированных значений
        Map<String, Integer> sortedwpputall = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> entry : valuesList){
            sortedwpputall.put(entry.getKey(), entry.getValue());
        }
        return sortedwpputall;
    }
}
