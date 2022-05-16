package HomeWork5;

import java.util.Map;

public class EasySearch implements ISearchEngine{


    @Override
    public long search(String text, String word){  // TODO... Добавить вариант для случая поиска союза.
        long count = 0;
        long index = text.indexOf(word);
        if (index == -1 ){
            return -1;
        } else {
            while (index != -1){
                index = text.indexOf(word, (int) (index + 1));
                count++;
            }
            return count;
        }
    }
}
