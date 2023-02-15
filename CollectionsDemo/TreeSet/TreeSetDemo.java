package CollectionsDemo.TreeSet;

import java.util.*;

public class TreeSetDemo {

    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();

        // Данные (элементы) автоматически сортируются от меньшего к большему
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        System.out.println(ts);
        // Выводятся элементы от 'C' до 'F' (F исключается)
        System.out.println(ts.subSet("C", "F"));
    }
}
