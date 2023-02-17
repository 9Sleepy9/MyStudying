package CollectionsDemo.Comparators;

import java.util.*;

// Создаём компаратор для сравнения символьных строк в обратном порядке
class MyComp1 implements Comparator<String> {

    // Достаточно переопределить только метод compare()
    @Override
    public int compare(String o1, String o2) {
        String o1Str, o2Str;

        o1Str = o1;
        o2Str = o2;

        // Сравнение в обратном порядке
        return o2Str.compareTo(o1Str);
    }
}

public class MyCompDemo1 {

    public static void main(String[] args) {

        // создаём древовидное множество типа String с нашим компаратором
        TreeSet<String> ts = new TreeSet<>(new MyComp1());

        // Добавляем элементы
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        // Выводим значения, они будут в обратном порядке
        for (String str : ts)
            System.out.print(str + " ");
        System.out.println();
    }
}

