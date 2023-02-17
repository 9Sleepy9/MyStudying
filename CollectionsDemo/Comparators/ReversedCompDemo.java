package CollectionsDemo.Comparators;

import com.sun.source.tree.Tree;

import java.util.*;

public class ReversedCompDemo {

    public static void main(String[] args) {

        // Если необходимо вывести элементы в обратном порядке,
        // то можно использовать reversed() для существующего компаратора,
        // или фабричный метод Comparator.reverseOrder для его создании
        TreeSet<String> ts = new TreeSet<>( (o1, o2) -> o2.compareTo(o1));

        // TreeSet<String> ts = new TreeSet<>(Comparator.reverseOrder());

        // Добавляем элементы
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        for (String str : ts)
            System.out.print(str + " ");
    }
}
