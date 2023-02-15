package CollectionsDemo.Iterator;

import java.util.*;

public class IteratorsDemo {

    public static void main(String[] args) {

        String element;

        // Создаём обычный списочный массив al
        ArrayList<String> al = new ArrayList<>();
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");

        // Создаём обычный итератор и выводим все объекты из списочного массива
        System.out.print("Исходное содержимое списочного массива al: ");
        Iterator<String> itr = al.iterator();
        while(itr.hasNext()) {
            element = itr.next();
            System.out.print(element + " ");
        }

        System.out.println();

        // Создаём ListIterator, который позволяет изменять элементы в перебираемой коллекции
        ListIterator<String> litr = al.listIterator();
        while(litr.hasNext()) {
            element = litr.next();
            litr.set(element + "+");
        }

        System.out.print("Измененное содержимое списочного массива al: ");
        itr = al.iterator();
        while (itr.hasNext()) {
            element = itr.next();
            System.out.print(element + " ");
        }

        System.out.println();

        System.out.print("Содержимое измененного списочного массива al в обратном поряке: ");
        litr = al.listIterator(al.size()); // Устанавливаем ListIterator в конец списка и выводим элементы
        while (litr.hasPrevious()) {
            element = litr.previous();
            System.out.print(element + " ");
        }

        System.out.println();
    }
}
