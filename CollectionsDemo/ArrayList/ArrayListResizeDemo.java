package CollectionsDemo.ArrayList;

import java.util.ArrayList;

public class ArrayListResizeDemo {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        // ��������� ������� �������� ����� � ����������� ������ ��� 6 ��������
        al.ensureCapacity(6);
        // ��� ���� ������ �� ��������
        System.out.printf("������ ������� al: %d\n", al.size());
        al.add(1); al.add(2); al.add(3); al.add(4); al.add(5);
        System.out.println("���������� ������� al: " + al);

        // ��� ������������� ���������� ��������� �������� � ��������� ��� �������� ���������
        al.add(6);
        System.out.printf("������ ������������ ������� al: %d\n", al.size());
        // ����� ����� ���������� �������� ��� ����� ����������� ArrayList
        ArrayList<Integer> al2 = new ArrayList<>(9);
        al2.add(10);
        System.out.println(al2);
        // ��������� ������ ���������� ������ �� ������������ ��������, ������� ��������� ����� ������������
        al2.trimToSize();
    }
}
