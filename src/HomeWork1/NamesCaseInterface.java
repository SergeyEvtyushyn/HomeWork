package HomeWork1;

import java.util.Scanner;

public class NamesCaseInterface implements ICommunicationPrinter {

        String s;

        public String welcom(String name) {

            switch (name) {
            case "Вася":
                s = "Привет! \nЯ тебя так долго ждал!";
                break;

            case "Анастасия":
                s = "Я тебя так долго ждал!";
                break;

            default:
                s = "Добрый день, а вы кто?";
                break;
        }
        return s;
    }

}