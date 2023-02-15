package CollectionsDemo.Iterator;

import java.util.*;

public class ForAsIterator {

    public static void main(String[] args) {

        ArrayList<Integer> ali = new ArrayList<>();

        ali.add(1);
        ali.add(2);
        ali.add(3);
        ali.add(4);
        ali.add(5);

        // Цикл for-each может быть использован вместо итератора, если не требуется выводить
        // элементы в обратном порядке или видоизменять их
        System.out.print("Исходное содержимое списочного массива ali: ");
        for (int v : ali)
            System.out.print(v + " ");

        System.out.println();

        int sum = 0;
        for (int v : ali)
            sum += v;

        System.out.println("Сумма элементов в списочном массиве ali: " + sum);
    }
}
