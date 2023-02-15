package CollectionsDemo.ArrayDeque;

import java.util.*;

public class ArrayDequeDemo {

    public static void main(String[] args) {

        // �������� ������ ������������ ������������ ������� (��������� ������ - 16)
        ArrayDeque<String> ad = new ArrayDeque<>();

        // ���������� ��������� � ����
        ad.push("A");
        ad.push("B");
        ad.push("D");
        ad.push("E");
        ad.push("F");

        System.out.println("���������� �� �����: ");
        while(ad.peek() != null)
            // ���������� �� ����� (�.�. � �����)
            System.out.println(ad.pop() + " ");
        
        System.out.println();
    }
}
