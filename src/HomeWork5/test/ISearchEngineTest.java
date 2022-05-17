package HomeWork5.test;

import HomeWork5.EasySearch;
import HomeWork5.ISearchEngine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ISearchEngineTest implements ISearchEngine {

    String searchWhere = "Свобода лося висела на волоске, и он не знал, что ему предстоит пережить в этом лесу! И, он начал считать: один, два, 3, 4 ... и так до -СТА";
    String searchWhatWord = "Свобода";
    String searchWhatWord1 = "и";
    String searchWhatWord2 = "И";
    String searchWhatWord3 = "-СТА";
    String searchWhatWord4 = "СТА";
    String searchWhatWord5 = "он";


    @Test
    public void search(){
        ISearchEngine search = new ISearchEngine() {
            @Override
            public long search(String text, String word) {
                return ISearchEngine.super.search(text, word);
            }
        };

        Assertions.assertEquals(2, search.search(searchWhere, searchWhatWord1) );
    }

    @Test
    public void searchEasySearch(){
        ISearchEngine search = new EasySearch();

        Assertions.assertEquals(2, search.search(searchWhere, searchWhatWord1) );
    }
}
