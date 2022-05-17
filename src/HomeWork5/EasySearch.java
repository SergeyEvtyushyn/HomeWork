package HomeWork5;

import java.util.Map;

public class EasySearch implements ISearchEngine{


    /**
     * Метод поиска слов в тексте без применения регулярных выражений
     * @param text Текст, в котором ищем
     * @param word Искомое слово
     * @return Возвращает число совпадений. При отсутсвии совападений возвращается -1.
     */
    @Override
    public long search(String text, String word){
        long count = 0;
        long index = 0;
        long index1 = 0;

        if (word.length() == 1) {
            String[] s = new String[]{word + " ", word + ".", word + ",", word + ":",word + ";", word + "!", word + "?"}; // TODO... Пересмотреть вариант нахождения союза в начале строки

            for (String words : s) {
                index = 0;
                index1 = 0;
                while (index != -1) {
                    index = text.indexOf(words, (int) index1);
                    index1 = index + 1;

                    boolean a = index > 0;
                    if ( a ) {
                        char c1 = text.charAt((int) (index - 1));
                        if (!Character.isDigit(c1) && !Character.isLetter(c1)) {
                            count++;
                        }
                    }
                }
            }
            if (count == 0) {
                return -1;
            }

        } else { //Часть для поиска целых слов

            while (index != -1) {
                index = text.indexOf(word, (int) index1);
                index1 = index + 1;
                boolean a = index > 0;
                boolean b = (index + word.length()) < text.length();


                if ((a && b)) {
                    char c1 = text.charAt((int)(index - 1));
                    char c2 = text.charAt((int)(index + word.length()));
                    if (!Character.isDigit(c1) && !Character.isLetter(c1) && !Character.isDigit(c2) && !Character.isLetter(c2) ){
                        count++;
                    }
                } else if (a && !b) {
                    char c1 = text.charAt((int)(index - 1));
                    if (!Character.isDigit(c1) && !Character.isLetter(c1) ){
                        count++;
                    }

                } else if ( !a && b) {
                    char c2 = text.charAt((int)(index + word.length()));
                    if ( !Character.isDigit(c2) && !Character.isLetter(c2) ){
                        count++;
                    }
                }

            }

            if (count == 0) {
                return -1;
            }
        } return count;
    }
}
