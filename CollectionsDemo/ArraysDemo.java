package CollectionsDemo;

import java.util.*;
public class ArraysDemo {

    public static void main(String[] args) {

        // Создаём и заполняем массив
        int array[] = new int[10];
        for (int i = 0; i < 10; i++)
            array[i] = -3 * i;

        // Выводим содержимое массива
        System.out.print("Исходный массив: ");
        display(array);

        // Сортируем массив статическим методом sort()
        Arrays.sort(array);
        System.out.print("Отсортированный массив: ");
        display(array);

        // Заполняем массив array начиная с индекса 2, до индекса 6 (5) значениями -1
        Arrays.fill(array, 2, 6, -1);
        System.out.print("Отсортированный массив после вызова метода fill(): ");
        Arrays.sort(array);
        display(array);

        System.out.print("Значение -9 находится на позиции: ");
        int index = Arrays.binarySearch(array, -9);
        System.out.print(index);

        System.out.println("\nВывод массива обычным способом");

        System.out.print(Arrays.toString(array));
    }

    static void display(int[] array) {
        for (int i : array)
            System.out.print(i + " ");
        System.out.println();
    }
}
