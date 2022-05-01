package HomeWork1;

import java.util.Objects;
import java.util.Scanner;

public class NamesIf_ElseInterface implements ICommunicationPrinter{

    String s;

    public String welcom(String name) {

        Boolean a = Objects.equals(name, "Вася");
        Boolean b = Objects.equals(name, "Анастасия");

        if (a){
            s = "Привет! \nЯ тебя так долго ждал!";
        } else if (b){
            s = "Я тебя так долго ждал!";
        } else {
            s = "Добрый день, а вы кто?";
        }
        return s;
    }
}
