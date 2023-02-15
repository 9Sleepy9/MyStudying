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

        // ���� for-each ����� ���� ����������� ������ ���������, ���� �� ��������� ��������
        // �������� � �������� ������� ��� ������������ ��
        System.out.print("�������� ���������� ���������� ������� ali: ");
        for (int v : ali)
            System.out.print(v + " ");

        System.out.println();

        int sum = 0;
        for (int v : ali)
            sum += v;

        System.out.println("����� ��������� � ��������� ������� ali: " + sum);
    }
}
