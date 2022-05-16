package HomeWork5;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public interface ISearchEngine {

    /**
     * Метод обработки файла и помещение текста в строку
     * @param wptxt Чтение из файла с применением BufferedRead
     * @return Массив слов в виде строки
     * @throws IOException проверка исключений в мэйне, в месте вызова метода
     */
    static String[] fileToString(BufferedReader wptxt) throws IOException {
        StringBuilder alltext = new StringBuilder();
        int txtIn = wptxt.read();
        while ( txtIn != -1) {
            alltext.append((char)txtIn);
            txtIn = wptxt.read();
        }
        return alltext.toString().split("[.,!?:;\\s]+");
    }

    /**
     * Метод наполнения колллекции Мар с сортировкой по значению
     * @param fileToString Массив слов
     * @return Сортированнаяколлекция по знпчению
     */
    default Map<String, Integer> sortedwpputall(String[] fileToString){
        Map<String, Integer> wpputall = new HashMap<>();

        for (String s1 : fileToString) {
            wpputall.put(s1, 0);
        }

        for (String s1 : fileToString) {
            int value = wpputall.get(s1);
            wpputall.put(s1, value + 1);
        }

        //Сортировка Мар по значению в порядке убывания
        List<Map.Entry<String, Integer>> valuesList = new ArrayList(wpputall.entrySet());
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

    /**
     * Метод, который возвращает количество повторений слова в тексте. Задание 3.
     * @param text Текст, в которм ищем
     * @param word Искомое слово
     * @return Количество повторений в тексте
     */
    default long search(String text, String word){
        String[] string = text.toString().split("[.,!?:;\\s]+");
        Map<String, Integer> sortedtext = sortedwpputall(string);
        return sortedtext.get(word);
    }
}
