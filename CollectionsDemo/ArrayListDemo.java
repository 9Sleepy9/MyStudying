package CollectionsDemo;

import java.util.*;

public class ArrayListDemo {

    public static void main(String[] args) {

        // ������ ����� ��������� ������ al
        ArrayList<String> al = new ArrayList<>();

        System.out.printf("��������� ������ ���������� ������� al: %d\n", al.size());

        // ��������� � ��������� ������ ��������
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        // ����� �� ��������� �� �������, �� ��� ��������� �������� "����������"
        al.add(1, "A2");

        System.out.printf("������ ���������� ������� al ����� ���������� ���������: %d\n", al.size());

        // ���������� ����� toString() �� ��������� �� ������ AbstractCollection
        System.out.println("���������� ���������� ������� al: " + al);

        // ������� �������� �� �������� � �� �������
        al.remove("F");
        al.remove(2);

        // ����� ��������, ��� ��� �������� ��������� ������ ������� ������������� �����������
        System.out.printf("������ ���������� ������� al ����� �������� ���������: %d\n", al.size());

        System.out.println("���������� ���������� ������� al: " + al);
    }
}
