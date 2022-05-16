package HomeWork5;

import java.io.*;
import java.util.*;

public class chooseBookFindWord implements ISearchEngine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите местоположение файла.");
        String fileBook = sc.nextLine();

        File file = new File(fileBook);

        Map<Integer, File> listOfBooks = listOfBooks(file);
        System.out.println("В папке находятся файлы.");

        for (Map.Entry<Integer, File> entry : listOfBooks.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue().getName();
            System.out.println(key + "." + value);

        }

        System.out.println("___________________________________");
        System.out.println("Сделайте свой выбор из списка выше."); // TODO... Выполнить повтор выбора книги
        int bookNumber = sc.nextInt();

        File fileInSearch = new File(listOfBooks.get(bookNumber).getAbsolutePath());

        System.out.println("Вы выбрали книгу: " + fileInSearch.getName());

        String[] fileToString = null;
        try (BufferedReader wptxt = new BufferedReader(new FileReader(fileInSearch))) {
            fileToString = ISearchEngine.fileToString(wptxt);
        } catch (FileNotFoundException e) {
            System.out.println("Указанный файл не найден.");
        } catch (IOException e) {
            System.out.println("Не могу прочитать файл");
        }


        // Поиск слова в выбраном тексте с повторением поиска по требованию.
        StringBuilder stringBuilder = new StringBuilder();

        boolean key = true;
        while (key) {
            if (key) {
                System.out.println("_________________________");
                System.out.println("Введите слово для поиска.");
                sc.nextLine();
                String searchWord = sc.nextLine();

                ISearchEngine numberOfWords = new ISearchEngine() {
                    @Override
                    public long search(String text, String word) {
                        return ISearchEngine.super.search(text, word);
                    }
                };


                // Поиск и вывод количества встречающихся слов в тексте с исключением для NullPointerException, и записью результата в файл.
                try {
                    String s = "Слово \"" + searchWord + "\" встречается в тексте " + fileInSearch.getName() + " " + numberOfWords.search(Arrays.toString(fileToString), searchWord) + " раз(а).";
                    System.out.println( s );
                    stringBuilder.append(s).append("\n");
                } catch (NullPointerException e) {
                    String s = "Cлово \"" + searchWord + "\" не найдено в тексте " + fileInSearch.getName();
                    System.out.println( s );
                    stringBuilder.append(s).append("\n");
                }

                System.out.println("Продолжить поиск слов? (true/false)");
                key = sc.nextBoolean();
            } else {
                key = false;
            }
        }

        // Запись результата поиска в файл
        try {
            writeInFile(String.valueOf(stringBuilder));
        } catch (IOException e){
            System.out.println("Не смогли записать файл");
        }

    }

    /**
     * Метод помещения списка всех книг в указанной папке в Мар сохранением порядка внесения
     * @param file Путь к папке с файлами(книгами)
     * @return Коллекция LinkedHashMap, где ключ - номер книги по порядку в папке, Значение - объект типа File
     */
    public static Map<Integer, File> listOfBooks(File file){
        Map<Integer, File> bookList = new LinkedHashMap<>();

        if(file.isFile()){
            bookList.put(1, file);
        } else {

            File[] files = file.listFiles();
            if(files != null){
                 for (int i = 0; i < files.length; i++) {
                     bookList.put(i + 1, files[i]);
                }
            }
        }

        return bookList;
    }

    /**
     * Метод записи результата поиска в указанный файл
     * @param string Параметр в виде строки, который нужно добавить в файл
     * @throws IOException Поисск исключений перенесен в Main по месту вызова метода
     */
    public static void writeInFile (String string) throws IOException {
        FileWriter fileWriter = new FileWriter("C:\\Java\\JC1\\Md-JC1\\HomeWork\\src\\HomeWork5\\result.txt");
        fileWriter.append(string);
        fileWriter.close();
    }
}
