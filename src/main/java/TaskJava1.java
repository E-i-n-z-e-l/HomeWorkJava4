/*
Реализовать консольное приложение, которое:
1. Принимает от пользователя и “запоминает” строки.
2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
3. Если введено revert, удаляет предыдущую введенную строку из памяти.
 */

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Scanner;

public class TaskJava1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayDeque<String> application = new ArrayDeque<String>();
        while (true) {
            System.out.println();
            System.out.print("Введите строку: ");
            String inputUserString = in.nextLine();

            if (inputUserString.trim().length() == 0) {                    // Если строка пуста
                System.out.println("Введите что-нибудь: ");
                continue;
            }
            if (inputUserString.equalsIgnoreCase("end")) {
                break;
            }
            if (inputUserString.equalsIgnoreCase("show")) {

                for (String element : application) {
                    System.out.println(element);
                }
                continue;
            }
            if (inputUserString.equalsIgnoreCase("print")) {
                Iterator<String> descendingIterator = application.descendingIterator();
                System.out.println("Элементы ArrayDeque в обратном порядке:");
                while (descendingIterator.hasNext()) {
                    System.out.println(descendingIterator.next());
                }
                String first = application.removeLast();
            }
            if (inputUserString.equalsIgnoreCase("revert")) {
                String first = application.removeLast();
            }
            else {
                application.addLast(inputUserString);
            }

        }
    }


}