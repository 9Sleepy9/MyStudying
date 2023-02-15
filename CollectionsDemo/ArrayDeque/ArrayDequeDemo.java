package CollectionsDemo.ArrayDeque;

import java.util.*;

public class ArrayDequeDemo {

    public static void main(String[] args) {

        // Создание пустой двусторонней динамической очереди (начальный размер - 16)
        ArrayDeque<String> ad = new ArrayDeque<>();

        // Добавление элементов в стек
        ad.push("A");
        ad.push("B");
        ad.push("D");
        ad.push("E");
        ad.push("F");

        System.out.println("Извлечение из стека: ");
        while(ad.peek() != null)
            // Извлечение из стека (т.е. с конца)
            System.out.println(ad.pop() + " ");
        
        System.out.println();
    }
}
