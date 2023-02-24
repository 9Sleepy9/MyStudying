package CollectionsDemo;

import java.util.*;
public class ArraysDemo {

    public static void main(String[] args) {

        // ������ � ��������� ������
        int array[] = new int[10];
        for (int i = 0; i < 10; i++)
            array[i] = -3 * i;

        // ������� ���������� �������
        System.out.print("�������� ������: ");
        display(array);

        // ��������� ������ ����������� ������� sort()
        Arrays.sort(array);
        System.out.print("��������������� ������: ");
        display(array);

        // ��������� ������ array ������� � ������� 2, �� ������� 6 (5) ���������� -1
        Arrays.fill(array, 2, 6, -1);
        System.out.print("��������������� ������ ����� ������ ������ fill(): ");
        Arrays.sort(array);
        display(array);

        System.out.print("�������� -9 ��������� �� �������: ");
        int index = Arrays.binarySearch(array, -9);
        System.out.print(index);

        System.out.println("\n����� ������� ������� ��������");

        System.out.print(Arrays.toString(array));
    }

    static void display(int[] array) {
        for (int i : array)
            System.out.print(i + " ");
        System.out.println();
    }
}
