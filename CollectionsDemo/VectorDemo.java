package CollectionsDemo;

import java.util.*;
/**
Основное отличие от класса ArrayList заключается в том,
что Vector синхронизирован и имеет не мало методов,
дублирующих методы из Collections Framework
 */

public class VectorDemo {

    public static void main(String[] args) {

        // Начальная емкость вектора - 3, инкремент - 2
        Vector<Integer> v = new Vector<>(3, 2);
        System.out.println("Начальный размер вектора: " + v.size());
        System.out.println("Начальная емкость вектора: " + v.capacity());

        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);

        System.out.println("Емкость вектора после ввода 4-х элементов: " + v.capacity());

        System.out.println("Первый элемент: " + v.firstElement());
        System.out.println("Последний элемент: " + v.lastElement());

        if (v.contains(3))
            System.out.println("v содержит 3");

        // Устаревший аналог Итератора - интерфейс Enumeration
        Enumeration<Integer> vEnum = v.elements();
        System.out.println("\nЭлементы вектора:");
        while(vEnum.hasMoreElements())
            System.out.print(vEnum.nextElement() + " ");
    }
}
