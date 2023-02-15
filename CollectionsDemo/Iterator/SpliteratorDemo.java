package CollectionsDemo.Iterator;

import java.util.*;

public class SpliteratorDemo {

    public static void main(String[] args) {

        ArrayList<Double> ald = new ArrayList<>();

        ald.add(1.0);
        ald.add(2.0);
        ald.add(3.0);
        ald.add(4.0);
        ald.add(5.0);

        System.out.print("Содержимое списочного массива ald:\n");
        Spliterator<Double> spliterator = ald.spliterator();

        while (spliterator.tryAdvance( n ->
                System.out.println(n)));
        System.out.println();

        spliterator = ald.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while (spliterator.tryAdvance( n -> sqrs.add(Math.sqrt(n))));

        System.out.print("Содержимое списочного массива sqrs:\n");

        spliterator = sqrs.spliterator();
        spliterator.forEachRemaining( n -> System.out.println(n));
        System.out.println();
    }
}
