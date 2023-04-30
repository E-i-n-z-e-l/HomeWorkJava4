/*
Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
 */
import java.util.LinkedList;

public class TaskJava2 {
    public static void main(String[] args) {
        LinkedList<String> listLink = new LinkedList<>();
        listLink.add("apple");
        listLink.add("banana");
        listLink.add("orange");
        listLink.add("pineapple");
        listLink.add("lemon");

        for (String element : listLink) {
            System.out.println(element);
        }

        System.out.println("__________________________________________________________________");

        turnedList(listLink);
    }

    public static void turnedList (LinkedList<String> list ) {
        for (int i = list.size() - 1; i >= 0; i--) {
            String element = list.get(i);
            System.out.println(element);
        }
    }
}
