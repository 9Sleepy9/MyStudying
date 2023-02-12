package CollectionsDemo.LinkedList;

import java.util.*;

public class LinkedListDemo {

    public static void main(String[] args) {

        // �������� �������� ������ ll
        LinkedList<String> ll = new LinkedList<>();

        // ��������� �������� � ������� ������
        ll.add("F"); // String ��� ������ ������
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.add("Z");
        ll.add("A");

        // ��������� ������� �� �������
        ll.add(1, "A2");

        System.out.println("�������� ���������� �������� ������ ll: " + ll);

        // ������� ������� �� �������� � �� �������
        ll.remove("F");
        ll.remove(2);

        System.out.println("���������� �������� ������ ll ����� �������� ���������: " + ll);

        // ������� ������ � ��������� ������� � ������
        ll.removeFirst();
        ll.removeLast();

        System.out.println("���������� �������� ������ ll " +
                "����� �������� ������� � ���������� ���������: " + ll);

        // �������� �������� ������� �� ������ �� �������
        String val = ll.get(2);
        // ������������� ����� �������� (����� ������) �������� ��� �������� 2
        ll.set(2, val + " ��������");

        System.out.println("���������� �������� ������ ll ����� ���������: " + ll);
    }
}