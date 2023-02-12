package CollectionsDemo;

import java.util.*;

public class ArrayListDemo {

    public static void main(String[] args) {

        // Создаём новый списочный массив al
        ArrayList<String> al = new ArrayList<>();

        System.out.printf("Начальный размер списочного массива al: %d\n", al.size());

        // Добавляем в созданный массив элементы
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        // Когда мы вставляем по индексу, то все остальные элементы "сдвигаются"
        al.add(1, "A2");

        System.out.printf("Размер списочного массива al после добавления элементов: %d\n", al.size());

        // Вызывается метод toString() по умолчанию от класса AbstractCollection
        System.out.println("Содержание списочного массива al: " + al);

        // Удаляем элементы по названию и по индексу
        al.remove("F");
        al.remove(2);

        // Стоит отметить, что при удалении элементов размер массива автоматически сокращается
        System.out.printf("Размер списочного массива al после удаления элементов: %d\n", al.size());

        System.out.println("Содержание списочного массива al: " + al);
    }
}
