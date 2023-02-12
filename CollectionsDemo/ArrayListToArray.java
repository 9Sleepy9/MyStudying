package CollectionsDemo;

import java.util.*;

public class ArrayListToArray {

    public static void main(String[] args) {

        ArrayList<Integer> ali = new ArrayList<>();

        ali.add(1); // Здесь применяется автоупаковка примитивных типов
        ali.add(2);
        ali.add(3);
        ali.add(4);

        System.out.println("Содержание списочного массива ali: " + ali);

        // Сохраним элементы из списочного массива ali в обычный массив Integer
        Integer[] ia = new Integer[ali.size()];
        ia = ali.toArray(ia); // Необходимо передать целевой массив

        // Найдём сумму элементов
        int sum = 0;
        for(int i : ia)
            sum += i;
        System.out.println("Сумма элементов: " + sum);
    }
}
