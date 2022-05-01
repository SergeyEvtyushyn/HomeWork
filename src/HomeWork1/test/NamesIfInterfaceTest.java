package HomeWork1.test;

import HomeWork1.ICommunicationPrinter;
import HomeWork1.NamesIfInterface;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NamesIfInterfaceTest {

    @Test
    public void nameWrong() {

        String name = "Саша";

        ICommunicationPrinter names1 = new NamesIfInterface();

        String a = names1.welcom(name);
        Assertions.assertEquals("Добрый день, а вы кто?", a);
    }

    @Test
    public void nameRight() {

        String name = "Вася";

        ICommunicationPrinter names1 = new NamesIfInterface();

        String a = names1.welcom(name);
        Assertions.assertEquals("Привет! \nЯ тебя так долго ждал!", a);
    }
}
