package CollectionsDemo.LinkedList;

import java.util.*;

public class LinkedListDemo {

    public static void main(String[] args) {

        // Создание связного списка ll
        LinkedList<String> ll = new LinkedList<>();

        // Добавляем элементы в связный список
        ll.add("F"); // String это всегда объект
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.add("Z");
        ll.add("A");

        // Добавляем элемент по индексу
        ll.add(1, "A2");

        System.out.println("Исходное содержимое связного списка ll: " + ll);

        // Удаляем объекты по названию и по индексу
        ll.remove("F");
        ll.remove(2);

        System.out.println("Содержимое связного списка ll после удаления элементов: " + ll);

        // Удаляем первый и последний объекты в списке
        ll.removeFirst();
        ll.removeLast();

        System.out.println("Содержимое связного списка ll " +
                "после удаления первого и последнего элементов: " + ll);

        // Получаем значение объекта из списка по индексу
        String val = ll.get(2);
        // Устанавливаем новое значение (новый объект) элементу под индексом 2
        ll.set(2, val + " изменено");

        System.out.println("Содержимое связного списка ll после изменения: " + ll);
    }
}