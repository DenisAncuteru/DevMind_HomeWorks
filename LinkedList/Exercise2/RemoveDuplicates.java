package LinkedList.Exercise2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class RemoveDuplicates {

    public static void removeDuplicates(LinkedList<Integer> list) {
        ListIterator<Integer> it = list.listIterator();

        int aux1 = it.next();
        int aux2 = it.next();

        while (it.hasNext()) {

            if (aux1 == aux2) {
                it.remove();
            } else {
                aux1 = aux2;
            }
            aux2 = it.next();
        }
        if (aux1 == aux2) {
            it.remove();
        }
    }

    public static void removeDuplicate2(LinkedList<Integer> list) {
        ListIterator<Integer> it = list.listIterator();

        int aux1 = it.next();
        int aux2 = it.next();

        while (it.hasNext()) {

            if (aux1 == aux2) {
                it.remove();
                it.previous();
                it.remove();
            } else {
                aux1 = aux2;
            }
            aux2 = it.next();
        }
        if (aux1 == aux2) {
            it.remove();
            it.previous();
            it.remove();

        }
    }

    public static void main(String[] args) {

        LinkedList<Integer> forPractice = new LinkedList<>();

        forPractice.add(1);
        forPractice.add(2);
        forPractice.add(2);
        forPractice.add(9);
        forPractice.add(9);
        forPractice.add(10);
        forPractice.add(11);
        forPractice.add(13);
        forPractice.add(13);
        forPractice.add(21);
        forPractice.add(22);


        System.out.println(forPractice);

        removeDuplicates(forPractice);

        System.out.println(forPractice);

    }
}
