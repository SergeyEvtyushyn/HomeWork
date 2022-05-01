package HomeWork1.test;

import HomeWork1.ICommunicationPrinter;
import HomeWork1.NamesCaseInterface;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NamesCaseInterfaceTest {

    @Test
    public void nameWrong() {

        String name = "Саша";

        ICommunicationPrinter names1 = new NamesCaseInterface();

        String a = names1.welcom(name);
        Assertions.assertEquals("Добрый день, а вы кто?", a);
    }

    @Test
    public void nameRight() {

        String name = "Анастасия";

        ICommunicationPrinter names1 = new NamesCaseInterface();

        String a = names1.welcom(name);
        Assertions.assertEquals("Я тебя так долго ждал!", a);
    }

}
