package HomeWork1;

import java.util.Scanner;

public class NamesMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = sc.nextLine();

        ICommunicationPrinter names1 = new NamesCaseInterface();
        ICommunicationPrinter names2 = new NamesIf_ElseInterface();
        ICommunicationPrinter names3 = new NamesIfInterface();

        System.out.println(names1.welcom(name));
        System.out.println(names2.welcom(name));
        System.out.println(names3.welcom(name));


    }
}
