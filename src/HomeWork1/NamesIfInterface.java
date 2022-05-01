package HomeWork1;

import java.util.Objects;
import java.util.Scanner;

public class NamesIfInterface implements ICommunicationPrinter {

    String s;

    public String welcom(String name) {

        Boolean a = Objects.equals(name, "Вася");
        Boolean b = Objects.equals(name, "Анастасия");

        if (a){
            s = "Привет! \nЯ тебя так долго ждал!";
        }
        if (b){
            s = "Я тебя так долго ждал!";
        }
        if (!a && !b){
            s = "Добрый день, а вы кто?";
        }
        return s;
    }
}
